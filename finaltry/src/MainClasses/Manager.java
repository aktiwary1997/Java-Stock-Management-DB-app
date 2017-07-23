/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClasses;

import methods.BranchMenuMethods;

/**
 *
 * @author johnkenny
 */
public class Manager extends Employee implements StaffProfile
{
    //varaibles for this object
   
    private int branchNo;

    //constructors for this class

    public Manager(int staffNo, int acccoutId, String name, String password, int branchNo) 
    {
        super(staffNo, acccoutId,  name, password, AccountTypes.MANAGER);
        //creates the username
        super.setUserName(setUser(name, staffNo));
        this.branchNo = branchNo;
    }

    public Manager(int acccoutId, String name,  String password, int branchNo) 
    {
        super(acccoutId,  name, password, AccountTypes.MANAGER);
        //super.setUserName(setUser(name));
        this.branchNo = branchNo;
    }
    
    //setters
    
    //sets the varaibles of a manager object 
    
  
    public void setBranchNo(int branchNo) 
    {
        this.branchNo = branchNo;
    }

    /*
    creates the user name inserting Ma before the user name generated by the super
    classes setUser method eg MaNameNo - MaPaul1
    */
    @Override
    public String setUser(String user, int staffNo)
    {
        return "Ma" + super.setUser(user, staffNo);
    }
    
    //gets manager branchNo
    
    @Override
    public int getBranchNo() 
    {
        return branchNo;
    }
    
    //gets the name of the managers branch using the branch number
    
    @Override
    public String branchName(int branchNo)
    {
        Branch b = BranchMenuMethods.branchName(branchNo);
        return b.getBranchName();
    }
    
    //gets the user account type name for manager
    @Override
    public String accountType()
    {
        return AccountTypes.MANAGER.name();
    }
    
    //returns all info from an object of this class
    @Override
    public String details() 
    {
        return "Manager " + "Manager No " + super.getStaffNo() + ", Branch Name " + super.branchName(branchNo) +  ", Manager Name " + super.getName();
    }    
}