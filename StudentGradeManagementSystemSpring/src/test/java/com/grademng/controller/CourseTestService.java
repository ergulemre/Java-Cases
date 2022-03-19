package com.grademng.controller;


import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.grademng.entity.Course;
import com.grademng.entity.Grade;
import com.grademng.entity.Student;
import com.grademng.repository.CourseRepository;
import com.grademng.service.CoursesService;


@RunWith(MockitoJUnitRunner.class)
public class CourseTestService {
    private MockMvc mockMvc;

    @InjectMocks
    private CourseController controller;

    @Mock
    private CoursesService service;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void courseRegistrationCheck() throws Exception {
        // Arrange the mock behavior
    	
    	Course crs1 = new Course();
    	crs1.setCourseName("Mathematics");   	
    	crs1.setId(Long.valueOf("1"));
    	
    	List<Course> allCourse = Arrays.asList(crs1);
        when(service.getAllCourse()).thenReturn(allCourse);

        // Act (perform the MVC request) and Assert results
        mockMvc.perform(MockMvcRequestBuilders.get("/course/get"))
        .andExpect(MockMvcResultMatchers.status().isOk());
    }

}