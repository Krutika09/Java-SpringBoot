@RestController = This tells Spring Boot that this class is a controller and will return data (like JSON) instead of HTML pages.
@RequestMapping = Sets the base URL for all the methods in this class. So you don’t have to write /studentdb in every method.
@GetMapping = Maps HTTP GET requests to this method. GET is used to fetch data.
@PostMapping() = Maps HTTP POST requests to create new data.
@PutMapping = Maps HTTP PUT requests to update existing data.
@PutMapping = Maps HTTP DELETE requests to remove data.
@PathVariable = Binds the URL path variable to the method parameter. URL /studentdb/101 → studentId = 101
@RequestBody = Get JSON data from request body
