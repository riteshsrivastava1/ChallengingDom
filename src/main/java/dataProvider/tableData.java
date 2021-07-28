package dataProvider;

import org.testng.annotations.DataProvider;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class tableData {

    @DataProvider(name = "testData-TableHeader")
    public Object[][] dataProvTblHeader(){
        return new Object[][]{
        {"Test Header", new String [] {"Lorem", "Ipsum", "Dolor", "Sit", "Amet", "Diceret", "Action"}}
        };
    }
    @DataProvider(name = "testData-TableData")
    public Object[][] dataProvTblData(){
        return new Object[][]{
                {"Table Data validation", 1, new String [] {"Iuvaret0", "Apeirian0", "Adipisci0", "Definiebas0", "Consequuntur0", "Phaedrum0", "edit delete"}},
                {"Table Data validation", 2, new String [] {"Iuvaret1", "Apeirian1", "Adipisci1", "Definiebas1", "Consequuntur1", "Phaedrum1", "edit delete"}},
                {"Table Data validation", 3,new String [] {"Iuvaret2", "Apeirian2", "Adipisci2", "Definiebas2", "Consequuntur2", "Phaedrum2", "edit delete"}},
                {"Table Data validation", 4, new String [] {"Iuvaret3", "Apeirian3", "Adipisci3", "Definiebas3", "Consequuntur3", "Phaedrum3", "edit delete"}},
                {"Table Data validation", 5, new String [] {"Iuvaret4", "Apeirian4", "Adipisci4", "Definiebas4", "Consequuntur4", "Phaedrum4", "edit delete"}},
                {"Table Data validation", 6, new String [] {"Iuvaret5", "Apeirian5", "Adipisci5", "Definiebas5", "Consequuntur5", "Phaedrum5", "edit delete"}},
                {"Table Data validation", 7, new String [] {"Iuvaret6", "Apeirian6", "Adipisci6", "Definiebas6", "Consequuntur6", "Phaedrum6", "edit delete"}},
                {"Table Data validation", 8, new String [] {"Iuvaret7", "Apeirian7", "Adipisci7", "Definiebas7", "Consequuntur7", "Phaedrum7", "edit delete"}},
                {"Table Data validation", 9, new String [] {"Iuvaret8", "Apeirian8", "Adipisci8", "Definiebas8", "Consequuntur8", "Phaedrum8", "edit delete"}},
                {"Table Data validation", 10, new String [] {"Iuvaret9", "Apeirian9", "Adipisci9", "Definiebas9", "Consequuntur9", "Phaedrum9", "edit delete"}}
        };
    }
        @DataProvider(name = "testData-Button")
        public Object[][] dataProvButton() {
            return new Object[][]{
                    {0, "bar", "#2ba6cb"},
                    {1, "baz", "#c60f13"},
                    {2, "foo", "#5da423"}
            };
        }

        @DataProvider(name = "testData-Para")
        public Object[][] dataProvPara(){
            return new Object[][]{
                    {"The hardest part in automated web testing is finding the best locators (e.g., ones that well named, unique, and unlikely to change). It's more often than not that the application you're testing was not built with this concept in mind. This example demonstrates that with unique IDs, a table with no helpful locators, and a canvas element."}
            };
        }
}
