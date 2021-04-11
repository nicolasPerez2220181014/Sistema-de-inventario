package com.terra.GestionYVentas.Product.Domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the bills_products database table.
 * 
 */
@Embeddable
public class BillsProductPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="fk_product_serial", insertable=false, updatable=false)
	private Integer fkProductSerial;

	@Column(name="fk_bill_id", insertable=false, updatable=false)
	private Integer fkBillId;

	public BillsProductPK() {
	}
	public Integer getFkProductSerial() {
		return this.fkProductSerial;
	}
	public void setFkProductSerial(Integer fkProductSerial) {
		this.fkProductSerial = fkProductSerial;
	}
	public Integer getFkBillId() {
		return this.fkBillId;
	}
	public void setFkBillId(Integer fkBillId) {
		this.fkBillId = fkBillId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BillsProductPK)) {
			return false;
		}
		BillsProductPK castOther = (BillsProductPK)other;
		return 
			this.fkProductSerial.equals(castOther.fkProductSerial)
			&& this.fkBillId.equals(castOther.fkBillId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.fkProductSerial.hashCode();
		hash = hash * prime + this.fkBillId.hashCode();
		
		return hash;
	}
}