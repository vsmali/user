package com.example.user;

public class UserClass  implements Comparable{
    private String usercode;
    private String name;
    private int  jobs_completed;
    private String preffered_location;
    private boolean inactive;

    public UserClass() {
    }

    public UserClass(String usercode,
                     String name,
                     int jobs_completed,
                     String preffered_location,
                     boolean inactive) {
        this.usercode = usercode;
        this.name = name;
        this.jobs_completed = jobs_completed;
        this.preffered_location = preffered_location;
        this.inactive = inactive;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJobs_completed() {
        return jobs_completed;
    }

    public void setJobs_completed(int jobs_completed) {
        this.jobs_completed = jobs_completed;
    }

    public String getPreffered_location() {
        return preffered_location;
    }

    public void setPreffered_location(String preffered_location) {
        this.preffered_location = preffered_location;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    @Override
    public String toString() {
        return usercode +"," + name + "," +jobs_completed + "," + preffered_location + "," + inactive;
    }

    @Override
    public int compareTo(Object o) {
        UserClass comparingTo =(UserClass) o;
        int comp = name.compareTo(comparingTo.name);
        return comp;
    }

}
