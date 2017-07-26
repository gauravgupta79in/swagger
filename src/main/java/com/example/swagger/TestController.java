package com.example.swagger;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/test")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TestController {
	
	    @ApiOperation(value = "View a list of available test items", response = String.class)
	    @ApiResponses(value = {
	            @ApiResponse(code = 200, message = "Successfully retrieved list"),
	            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
	            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	    }
	    )
	    @RequestMapping(value = "/list", method= RequestMethod.GET, produces = "application/text")
	    public String list(Model model){
	        
	        return "TestList";
	    }
}
