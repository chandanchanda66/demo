package com.example.chandan.demo;

/**
 * Created by chandan on 31-Dec-17.
 */

public class playerdetails {
    private String Team_name,Player_name,Email,Skill;
    public playerdetails()
    {

    }
    public playerdetails(String tname,String name,String mail,String skill)
    {
        this.Team_name=tname;
        this.Email=mail;
        this.Player_name=name;
        this.Skill=skill;
    }


    public String getTeam_name() {
        return Team_name;
    }

    public String getPlayer_name() {
        return Player_name;
    }

    public String getEmail() {
        return Email;
    }

    public String getSkill() {
        return Skill;
    }
}
