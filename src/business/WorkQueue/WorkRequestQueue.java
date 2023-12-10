/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author sangram
 */
public class WorkRequestQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    
    public WorkRequestQueue(){
        workRequestList=new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    
}
