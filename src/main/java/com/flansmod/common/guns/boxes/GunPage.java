package com.flansmod.common.guns.boxes;

public class GunPage
{
    public String pageName;
    public GunBoxEntry[] gunList;

    public GunPage(String n)
    {
        pageName = n;
    }

    public void addGunList(GunBoxEntry[] list)
    {
        gunList = list;
    }

    public int getSize()
    {
        return gunList.length;
    }

    public boolean isPageEmpty()
    {
        return gunList.length == 0;
    }

    public void setPageName(String name)
    {
        pageName = name;
    }
}
