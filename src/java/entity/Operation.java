/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */

@Entity
public class Operation implements Serializable {
    @Id
    private Long id;
    private String operationName;
    private String operationDescription;
    private Long operationCost;
    
    public Operation() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public void setOperationDescription(String operationDescription) {
        this.operationDescription = operationDescription;
    }

    public Long getOperationCost() {
        return operationCost;
    }

    public void setOperationCost(Long operationCost) {
        this.operationCost = operationCost;
    }
    
}
