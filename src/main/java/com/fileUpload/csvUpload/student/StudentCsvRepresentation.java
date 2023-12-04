package com.fileUpload.csvUpload.student;

import com.opencsv.bean.CsvBindByName;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//provide the attributes we need to read from the csv file

public class StudentCsvRepresentation {

    //we need to tell our opencsv library that these
    // columns represent the columns of my csv file
    @CsvBindByName(column = "firstname")
    private String fname;
    @CsvBindByName(column = "lastname")
    private String lname;
    @CsvBindByName(column = "age")
    private int age;
}
