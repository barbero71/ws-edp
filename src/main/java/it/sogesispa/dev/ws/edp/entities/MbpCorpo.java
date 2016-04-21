package it.sogesispa.dev.ws.edp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="MBP_CORPO")
@IdClass(MbpCorpoPk.class)
public class MbpCorpo
{
	@Id
	@Column(name="MBPC_BPT_ID")
	private int mbpc_bpt_id;
	@Id
	@Column(name="MBPC_ARTICOLO")
	private String mbpc_articolo;
	@Column(name="MBPC_QTA")
	private int mbpc_qta;
	@Column(name="MBPC_QTA_CON")
	private int mbpc_qta_con;
	@Column(name="MBPC_QTA_PRE")
	private int mbpc_qta_pre;
	@Column(name="MBPC_QTA_DIF")
	private int mbpc_qta_dif;
	@Column(name="MBPC_STATO")
	private int mbpc_stato;
	
	public MbpCorpo()
	{
		
	}
	
	public MbpCorpo(int mbpc_bpt_id, String mbpc_articolo, int mbpc_qta, int mbpc_qta_con, int mbpc_qta_pre,
			int mbpc_qta_dif, int mbpc_stato) {
		this.mbpc_bpt_id = mbpc_bpt_id;
		this.mbpc_articolo = mbpc_articolo;
		this.mbpc_qta = mbpc_qta;
		this.mbpc_qta_con = mbpc_qta_con;
		this.mbpc_qta_pre = mbpc_qta_pre;
		this.mbpc_qta_dif = mbpc_qta_dif;
		this.mbpc_stato = mbpc_stato;
	}
	public int getMbpc_stato() {
		return mbpc_stato;
	}
	public void setMbpc_stato(int mbpc_stato) {
		this.mbpc_stato = mbpc_stato;
	}
	public int getMbpc_btp_id() {
		return mbpc_bpt_id;
	}
	public void setMbpc_bpt_id(int mbpc_bpt_id) {
		this.mbpc_bpt_id = mbpc_bpt_id;
	}
	public String getMbpc_articolo() {
		return mbpc_articolo;
	}
	public void setMbpc_articolo(String mbpc_articolo) {
		this.mbpc_articolo = mbpc_articolo;
	}
	public int getMbpc_qta() {
		return mbpc_qta;
	}
	public void setMbpc_qta(int mbpc_qta) {
		this.mbpc_qta = mbpc_qta;
	}
	public int getMbpc_qta_con() {
		return mbpc_qta_con;
	}
	public void setMbpc_qta_con(int mbpc_qta_con) {
		this.mbpc_qta_con = mbpc_qta_con;
	}
	public int getMbpc_qta_pre() {
		return mbpc_qta_pre;
	}
	public void setMbpc_qta_pre(int mbpc_qta_pre) {
		this.mbpc_qta_pre = mbpc_qta_pre;
	}
	public int getMbpc_qta_dif() {
		return mbpc_qta_dif;
	}
	public void setMbpc_qta_dif(int mbpc_qta_dif) {
		this.mbpc_qta_dif = mbpc_qta_dif;
	}
}
