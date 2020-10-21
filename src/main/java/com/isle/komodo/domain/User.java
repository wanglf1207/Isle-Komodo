package com.isle.komodo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Entity(name = "isle_sys_user")
@Data public class User implements Serializable {
    @Id
    private BigInteger userId;
    private BigInteger orgId;
    private String accountNo;
    private String password;
    private String username;
    private Date createdTime;
    private Date lastLoginTime;
    private BigInteger loginTimes;
}
