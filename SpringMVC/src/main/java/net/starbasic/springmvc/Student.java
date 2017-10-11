/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.starbasic.springmvc;

/**
 *
 * @author Серж
 */
class Student {

    private Integer age;
   private String name;
   private Integer id;
   private Integer pswd;
   

   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }

    public Integer getPswd() {
        return pswd;
    }

    public void setPswd(Integer pswd) {
        this.pswd = pswd;
    }
}
