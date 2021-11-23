/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cli.users;
import dbconn.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
/**
 *
 * @author JM
 */
public class PersonProfile extends DBConnection {
    private Integer id;
    private String firstname;
    private String lastname;    
    private String birthdate;

    private Collection<PersonProfile> cData;

    public PersonProfile() {
        //
    }

    public PersonProfile(
            //
            Integer id,
            String firstname,
            String lastname,
            String birthdate
            ) {
        //
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    /**
     * select() all data but return active row(s) only
     */
    public static void main(String[] args) {
        PersonProfile p = new PersonProfile();
//        p.select();
//        for (PersonProfile a : p.getcData()) {
//            System.out.println("Firstname: " + a.getFirstname());
//            System.out.println("Lastname: " + a.getLastname());
//            System.out.println("Birthdate: " + a.getBirthdate());
//
//        }
        p.selectFilterByFullname("John");
        for (PersonProfile a : p.getcData()) {
            System.out.println("Firstname: " + a.getFirstname());
            System.out.println("Lastname: " + a.getLastname());
            System.out.println("Birthdate: " + a.getBirthdate());

        }
        
//        p.selectById(2);
//            System.out.println("Firstname: " + p.getFirstname());
//            System.out.println("Lastname: " + p.getLastname());
//            System.out.println("Birthdate: " + p.getBirthdate());

//
    }

    public void select() {
        
        setcData(new ArrayList<PersonProfile>());
        try {
            super.getConnectToDbHost();
            PreparedStatement statement = conn.prepareStatement("SELECT SQL_CALC_FOUND_ROWS MAX(cr.id), cr.* FROM tblpersons cr GROUP BY cr.id ORDER BY cr.id ASC");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Integer idl = rs.getInt("id");
                String firstnamel = rs.getString("firstname");
                String lastnamel = rs.getString("lastname");
                String birthdate1 = rs.getString("birthdate");
                //
                this.getcData().add(new PersonProfile(
                        idl,
                        firstnamel,
                        lastnamel,
                        birthdate1));
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void selectFilterByFullname(String fullname) {
        setcData(new ArrayList<PersonProfile>());
        try {
            super.getConnectToDbHost();
            PreparedStatement statement = conn.prepareStatement("SELECT SQL_CALC_FOUND_ROWS MAX(cr.id), cr.* FROM tblpersons cr WHERE CONCAT(cr.`firstname`, ' ', cr.`lastname`) LIKE ? GROUP BY cr.id ORDER BY cr.id ASC");
            statement.setString(1, fullname + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Integer idl = rs.getInt("id");
                String firstnamel = rs.getString("firstname");
                String lastnamel = rs.getString("lastname");
                String birthdatel = rs.getString("birthdate");
                //
                this.getcData().add(new PersonProfile(
                        idl,
                        firstnamel,
                        lastnamel,
                        birthdatel));
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    /**
     *
     * @param id selectAllById() return only one data but using Collection class
     *
     */
    public void selectAllById(Integer id) {
        setcData(new ArrayList<PersonProfile>());
        try {
            super.getConnectToDbHost();
            PreparedStatement statement = conn.prepareStatement("SELECT SQL_CALC_FOUND_ROWS MAX(cr.id), cr.* FROM tblpersons cr WHERE cr.id = ? GROUP BY cr.id");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Integer idl = rs.getInt("id");
                String firstnamel = rs.getString("firstname");
                String lastnamel = rs.getString("lastname");
                String birthdatel = rs.getString("birthdate");
                //
                this.getcData().add(new PersonProfile(
                        idl,
                        firstnamel,
                        lastnamel,
                        birthdatel));

            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void selectById(Integer id) {
        try {
            super.getConnectToDbHost();
            PreparedStatement statement = conn.prepareStatement("SELECT SQL_CALC_FOUND_ROWS MAX(cr.id), cr.* FROM tblpersons cr WHERE cr.id = ? GROUP BY cr.id");
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Integer idl = rs.getInt("id");
                String firstnamel = rs.getString("firstname");
                String lastnamel = rs.getString("lastname");
                String birthdate1 = rs.getString("birthdate");
                //                
                this.setId(idl);
                this.setFirstname(firstnamel);
                this.setLastname(lastnamel);
                this.setBirthdate(birthdate1);
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insert() {
        try {
            super.getConnectToDbHost();
            PreparedStatement statement = conn.prepareStatement("INSERT INTO `tblpersons`(`firstname`, `lastname`, `birthdate`) VALUES (?,?,?)");
            
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, birthdate);
            statement.execute();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void update() {
        try {
            super.getConnectToDbHost();
            PreparedStatement statement = conn.prepareStatement("UPDATE `tblpersons` SET `firstname`= ?,`lastname`= ? ,`birthdate`= ? WHERE `id` = ?");
            statement.setString(1, firstname);
            statement.setString(2, lastname);
            statement.setString(3, birthdate);
            statement.setInt(4, id);
            statement.execute();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                //conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void clearData() {
        this.setId(null);
        this.setFirstname("");
        this.setLastname("");
        this.setBirthdate("");
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
   

    /**
     * @return the address
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param address the address to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the cData
     */
    public Collection<PersonProfile> getcData() {
        return cData;
    }

    /**
     * @param cData the cData to set
     */
    public void setcData(Collection<PersonProfile> cData) {
        this.cData = cData;
    }
}
