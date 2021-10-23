package com.co.orangehrmlive.opensourcedemo.tasks.common;

import net.serenitybdd.screenplay.Performable;
import org.apache.log4j.Logger;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static com.google.common.base.StandardSystemProperty.USER_DIR;

public class BaseSikulix{
    private static final String PAGE_BASE_PATCH = USER_DIR.value() + "\\src\\main\\resources\\";
    protected static final String SELECT_PICTURE_PATCH_DELETE =PAGE_BASE_PATCH+"page.admin.job.workshifts\\EliminarTurno.PNG";
    private static final Logger LOGGER = Logger.getLogger(BaseSikulix.class);

    public BaseSikulix() {
        //Constructor by default.
    }

    public Performable clickOn(String path){
        Screen s = new Screen();
        try{
            s.wait(path);
            s.click(path);
        }
        catch(FindFailed e){
            LOGGER.warn(e.getMessage(), e);
        }
        return null;
    }

    public void insertInto(String path, String text){
        Screen s = new Screen();
        try{
            s.wait(path);
            s.write(text);
        }
        catch(FindFailed e){
            LOGGER.warn(e.getMessage(), e);
        }
    }
}
