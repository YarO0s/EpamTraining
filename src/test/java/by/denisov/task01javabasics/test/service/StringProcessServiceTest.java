package by.denisov.task01javabasics.test.service;

import by.denisov.task01javabasics.service.StringProcessService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StringProcessServiceTest {

    StringProcessService stringProcessOps = new StringProcessService();

    @DataProvider(name = "ifStringIsValidTestData")
    public Object[][] ifStringIsValidTestData(){
        return new Object[][]{
                {"_String1", true},
                {"String2", true},
                {"string2", true},
                {"String_3", true},
                {"", true},
                {"1String", false},
                {"123", false},
        };
    }

    @Test(description = "Defining if string is valid", dataProvider = "ifStringIsValidTestData")
    public void ifStringIsValidTestData(String initValue, boolean expected){
        boolean actual = stringProcessOps.ifStringValid(initValue);
        assertEquals(expected, actual);
    }

    @DataProvider(name = "convertToArabicTestData")
    public Object[][] convertToArabicTestData(){
        return new Object[][]{
                {"I", 1},
                {"III", 3},
                {"IV", 4},
                {"VIII", 8},
                {"XXX", 30},
                {"XL", 40},
                {"IX", 9},
                {"C", 100},
                {"D", 500},
                {"M", 1000},
        };
    }

    @Test(description = "Convert to arabic test", dataProvider = "convertToArabicTestData")
    public void convertToArabicTest(String initialValue, Integer expected){
        Integer actual = stringProcessOps.convertToArabic(initialValue);
        assertEquals(expected, actual);
    }




}
