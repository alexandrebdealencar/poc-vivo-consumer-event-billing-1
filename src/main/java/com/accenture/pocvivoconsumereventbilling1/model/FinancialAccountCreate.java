package com.accenture.pocvivoconsumereventbilling1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An account of money owed by a party to another entity in exchange for goods or services that have been delivered or used. A financial (account receivable account/account payable) aggregates the amounts of one or more party accounts (billing or settlement) owned by a given party. It is a specialization of entity Account. Skipped properties: id,href
 */
@ApiModel(description = "An account of money owed by a party to another entity in exchange for goods or services that have been delivered or used. A financial (account receivable account/account payable) aggregates the amounts of one or more party accounts (billing or settlement) owned by a given party. It is a specialization of entity Account. Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")


public class FinancialAccountCreate   {
  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lastModified")
  private OffsetDateTime lastModified = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("accountBalance")
  @Valid
  private List<AccountBalance> accountBalance = null;

  @JsonProperty("accountRelationship")
  @Valid
  private List<AccountRelationship> accountRelationship = null;

  @JsonProperty("contact")
  @Valid
  private List<Contact> contact = null;

  @JsonProperty("creditLimit")
  private Money creditLimit = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("taxExemption")
  @Valid
  private List<AccountTaxExemption> taxExemption = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public FinancialAccountCreate accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * A categorization of an account, such as individual, joint, and so forth, whose instances share some of the same characteristics. Note: for flexibility we use a String here but an implementation may use an enumeration with a limited list of valid values.
   * @return accountType
  **/
  @ApiModelProperty(value = "A categorization of an account, such as individual, joint, and so forth, whose instances share some of the same characteristics. Note: for flexibility we use a String here but an implementation may use an enumeration with a limited list of valid values.")


  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public FinancialAccountCreate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Detailed description of the party account
   * @return description
  **/
  @ApiModelProperty(value = "Detailed description of the party account")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FinancialAccountCreate lastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Date of last modification of the account
   * @return lastModified
  **/
  @ApiModelProperty(value = "Date of last modification of the account")

  @Valid

  public OffsetDateTime getLastModified() {
    return lastModified;
  }

  public void setLastModified(OffsetDateTime lastModified) {
    this.lastModified = lastModified;
  }

  public FinancialAccountCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the account")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FinancialAccountCreate state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Contains the lifecycle state such as: Active, Closed, Suspended and so on.
   * @return state
  **/
  @ApiModelProperty(value = "Contains the lifecycle state such as: Active, Closed, Suspended and so on.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public FinancialAccountCreate accountBalance(List<AccountBalance> accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  public FinancialAccountCreate addAccountBalanceItem(AccountBalance accountBalanceItem) {
    if (this.accountBalance == null) {
      this.accountBalance = new ArrayList<AccountBalance>();
    }
    this.accountBalance.add(accountBalanceItem);
    return this;
  }

  /**
   * Get accountBalance
   * @return accountBalance
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountBalance> getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(List<AccountBalance> accountBalance) {
    this.accountBalance = accountBalance;
  }

  public FinancialAccountCreate accountRelationship(List<AccountRelationship> accountRelationship) {
    this.accountRelationship = accountRelationship;
    return this;
  }

  public FinancialAccountCreate addAccountRelationshipItem(AccountRelationship accountRelationshipItem) {
    if (this.accountRelationship == null) {
      this.accountRelationship = new ArrayList<AccountRelationship>();
    }
    this.accountRelationship.add(accountRelationshipItem);
    return this;
  }

  /**
   * Get accountRelationship
   * @return accountRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountRelationship> getAccountRelationship() {
    return accountRelationship;
  }

  public void setAccountRelationship(List<AccountRelationship> accountRelationship) {
    this.accountRelationship = accountRelationship;
  }

  public FinancialAccountCreate contact(List<Contact> contact) {
    this.contact = contact;
    return this;
  }

  public FinancialAccountCreate addContactItem(Contact contactItem) {
    if (this.contact == null) {
      this.contact = new ArrayList<Contact>();
    }
    this.contact.add(contactItem);
    return this;
  }

  /**
   * Get contact
   * @return contact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Contact> getContact() {
    return contact;
  }

  public void setContact(List<Contact> contact) {
    this.contact = contact;
  }

  public FinancialAccountCreate creditLimit(Money creditLimit) {
    this.creditLimit = creditLimit;
    return this;
  }

  /**
   * The maximum amount of money that may be charged on an account
   * @return creditLimit
  **/
  @ApiModelProperty(value = "The maximum amount of money that may be charged on an account")

  @Valid

  public Money getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Money creditLimit) {
    this.creditLimit = creditLimit;
  }

  public FinancialAccountCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public FinancialAccountCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public FinancialAccountCreate taxExemption(List<AccountTaxExemption> taxExemption) {
    this.taxExemption = taxExemption;
    return this;
  }

  public FinancialAccountCreate addTaxExemptionItem(AccountTaxExemption taxExemptionItem) {
    if (this.taxExemption == null) {
      this.taxExemption = new ArrayList<AccountTaxExemption>();
    }
    this.taxExemption.add(taxExemptionItem);
    return this;
  }

  /**
   * Get taxExemption
   * @return taxExemption
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<AccountTaxExemption> getTaxExemption() {
    return taxExemption;
  }

  public void setTaxExemption(List<AccountTaxExemption> taxExemption) {
    this.taxExemption = taxExemption;
  }

  public FinancialAccountCreate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public FinancialAccountCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public FinancialAccountCreate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinancialAccountCreate financialAccountCreate = (FinancialAccountCreate) o;
    return Objects.equals(this.accountType, financialAccountCreate.accountType) &&
        Objects.equals(this.description, financialAccountCreate.description) &&
        Objects.equals(this.lastModified, financialAccountCreate.lastModified) &&
        Objects.equals(this.name, financialAccountCreate.name) &&
        Objects.equals(this.state, financialAccountCreate.state) &&
        Objects.equals(this.accountBalance, financialAccountCreate.accountBalance) &&
        Objects.equals(this.accountRelationship, financialAccountCreate.accountRelationship) &&
        Objects.equals(this.contact, financialAccountCreate.contact) &&
        Objects.equals(this.creditLimit, financialAccountCreate.creditLimit) &&
        Objects.equals(this.relatedParty, financialAccountCreate.relatedParty) &&
        Objects.equals(this.taxExemption, financialAccountCreate.taxExemption) &&
        Objects.equals(this.baseType, financialAccountCreate.baseType) &&
        Objects.equals(this.schemaLocation, financialAccountCreate.schemaLocation) &&
        Objects.equals(this.type, financialAccountCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, description, lastModified, name, state, accountBalance, accountRelationship, contact, creditLimit, relatedParty, taxExemption, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinancialAccountCreate {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    accountRelationship: ").append(toIndentedString(accountRelationship)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    creditLimit: ").append(toIndentedString(creditLimit)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    taxExemption: ").append(toIndentedString(taxExemption)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

