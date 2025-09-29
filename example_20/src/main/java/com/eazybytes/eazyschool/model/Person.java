package com.eazybytes.eazyschool.model;

import com.eazybytes.eazyschool.annotation.FieldsValueMatch;
import com.eazybytes.eazyschool.annotation.PasswordValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
@FieldsValueMatch.List({
        @FieldsValueMatch(
                field = "pwd",
                fieldMatch = "confirmPwd",
                message = "Password do not match!"
        ),
        @FieldsValueMatch(
                field = "email",
                fieldMatch = "confirmEmail",
                message = "email addresses do not match!"
        )
})
public class Person extends BaseEntity{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
        @GenericGenerator(name = "native",strategy = "native")
        private int personId;

        @NotBlank(message = "Name must not be blank")
        @Size(min=3, message = "Name must be at least 3 characters long")
        private String name;

        @NotBlank(message = "Mobile number must not be blank")
        @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
        private String mobileNumber;

        @NotBlank(message = "Email must not be blank")
        @Email(message = "Please provide a valid email address")
        private String email;

        @NotBlank(message = "Confirm Email must not be blank")
        @Email(message = "Please provide a valid confirm email address")
        @Transient
        private String confirmEmail;

        @NotBlank(message = "Password must not be blank")
        @Size(min = 5, message = "Password must be at least 5 characters long")
        @PasswordValidator
        private String pwd;

        @NotBlank(message = "Confirm Password must not be blank")
        @Size(min = 5, message = "Confirm Password must be at least 5 characters long")
        @Transient
        private String confirmPwd;

        @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST,targetEntity = Roles.class)
        @JoinColumn(name = "role_id", referencedColumnName = "roleId",nullable = false)
        private Roles roles;

        @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL, targetEntity = Address.class)
        @JoinColumn(name = "address_id", referencedColumnName = "addressId",nullable = true)
        private Address address;

        @ManyToOne(fetch = FetchType.LAZY, optional = true)
        @JoinColumn(name = "class_id", referencedColumnName = "classId",nullable = true)
        private EazyClass eazyClass;

        @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
        @JoinTable(name = "person_courses",
                joinColumns = {
                        @JoinColumn(name = "person_id", referencedColumnName = "personId")},
                inverseJoinColumns = {
                        @JoinColumn(name = "course_id", referencedColumnName = "courseId")})
        private Set<Courses> courses = new HashSet<>();

        public Set<Courses> getCourses() {
                return courses;
        }

        public void setCourses(Set<Courses> courses) {
                this.courses = courses;
        }

        public EazyClass getEazyClass() {
                return eazyClass;
        }

        public void setEazyClass(EazyClass eazyClass) {
                this.eazyClass = eazyClass;
        }

        public Address getAddress() {
                return address;
        }

        public void setAddress(Address address) {
                this.address = address;
        }

        public Roles getRoles() {
                return roles;
        }

        public void setRoles(Roles roles) {
                this.roles = roles;
        }

        public int getPersonId() {
                return personId;
        }

        public void setPersonId(int personId) {
                this.personId = personId;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getMobileNumber() {
                return mobileNumber;
        }

        public void setMobileNumber(String mobileNumber) {
                this.mobileNumber = mobileNumber;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getConfirmEmail() {
                return confirmEmail;
        }

        public void setConfirmEmail(String confirmEmail) {
                this.confirmEmail = confirmEmail;
        }

        public String getPwd() {
                return pwd;
        }

        public void setPwd(String pwd) {
                this.pwd = pwd;
        }

        public String getConfirmPwd() {
                return confirmPwd;
        }

        public void setConfirmPwd(String confirmPwd) {
                this.confirmPwd = confirmPwd;
        }
}
