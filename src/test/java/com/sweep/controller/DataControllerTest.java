package com.sweep.controller;

import com.sweep.service.DataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataControllerTest {

    @Autowired
    private DataController dataController;

    @MockBean
    private DataService dataService;

    @Test
    public void insertDataTest() {
        String testData = "test data";
        dataController.insertData(testData);
        verify(dataService).insertData(testData);
    }
}