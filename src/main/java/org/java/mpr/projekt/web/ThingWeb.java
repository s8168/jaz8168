
package org.java.mpr.projekt.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;
import org.java.mpr.projekt.domain.Things;
import org.java.mpr.projekt.services.ThingsService;


@SessionScoped
@Named("thingWeb")
public class ThingWeb implements Serializable {
   
    private ListDataModel<Things> things = new ListDataModel<Things>();
    private Things thing;
    
    @Inject
    private ThingsService ts;
    
    public String create() { 
        thing = new Things("", "");
        return "create";
    }
    
    public String update() { 
        thing = things.getRowData();
        return "update";
    }
    
    public String delete() {  
        thing = things.getRowData();
        ts.remove(thing);
        return "all";
    }
        
    public String retrive() {
        thing = things.getRowData();
        return "retrive";
    }

    public String merge() {
        ts.merge(thing);
        return "all";
    }
    
    public ListDataModel<Things> getAllThings() {
        things.setWrappedData(ts.getAllThings());
        return things;
    }

    public Things getThing() {
        return thing;
    }

    public void setThing(Things thing) {
        this.thing = thing;
    }
}