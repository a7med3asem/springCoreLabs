package day5.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {
    private List adminEmails2;
    private Set adminEmails3;
    private Map adminEmails4;
    private Properties adminEmails5;

    public ComplexObject() {
        System.out.println("ComplexObject()");
    }

    public ComplexObject(List adminEmails2) {
        System.out.println("ComplexObject(List adminEmails2)");
        this.adminEmails2 = adminEmails2;
    }

    public void setAdminEmails2(List adminEmails2) {
        System.out.println("setAdminEmails2(List adminEmails2)");
        this.adminEmails2 = adminEmails2;
    }

    public List getAdminEmails2() {
        System.out.println("List getAdminEmails2()");
        return adminEmails2;
    }

    public Set getAdminEmails3() {
        System.out.println("Set getAdminEmails3() {\n");
        return adminEmails3;
    }

    public void setAdminEmails3(Set adminEmails3) {
        System.out.println("setAdminEmails3(Set adminEmails3) {\n");
        this.adminEmails3 = adminEmails3;
    }

    public Map getAdminEmails4() {
        System.out.println("Map getAdminEmails4() {\n");
        return adminEmails4;
    }

    public void setAdminEmails4(Map adminEmails4) {
        System.out.println("setAdminEmails4(Map adminEmails4) {\n");
        this.adminEmails4 = adminEmails4;
    }

    public Properties getAdminEmails5() {
        System.out.println("Properties getAdminEmails5() {\n");
        return adminEmails5;
    }

    public void setAdminEmails5(Properties adminEmails5) {
        System.out.println("setAdminEmails5(Properties adminEmails5) {\n");
        this.adminEmails5 = adminEmails5;
    }
}
