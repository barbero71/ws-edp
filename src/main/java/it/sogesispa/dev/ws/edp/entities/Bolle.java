package it.sogesispa.dev.ws.edp.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JSN_BOLLEP")
public class Bolle 
{
	@Id
	@Column(name="JBPT_ID")
	private int jpbd_id;
	@Column(name="JBPT_EMITT")
	private String jbpt_emitt;
	@Column(name="JCLS_DESC_EMITT")
	private String jcls_desc_emitt;
	@Column(name="JBPT_ANNO")
	private int jbpt_anno;
	@Column(name="JBPT_SIGBOL")
	private String jbpt_sigbol;
	@Column(name="JBPT_DATBOL")
	private Date jbpt_datbol;
	@Column(name="JBPT_DATSPE")
	private Date jbpt_datspe;
	@Column(name="JBPT_CAUBOL")
	private String jbpt_caubol;
	@Column(name="JCAU_DES")
	private String jcau_des;
	@Column(name="JBPT_CAUMOV")
	private String jbpt_caumov;
	@Column(name="JBPT_CLICOD")
	private int jbpt_clicod;
	@Column(name="JBPT_SUBCOD")
	private String jbpt_subcod;
	@Column(name="JBPT_REPCOD")
	private String jbpt_repcod;
	@Column(name="JBPT_SEZCOD")
	private String jbpt_sezcod;
	@Column(name="JBPT_DESTCLI")
	private int jbpt_destcli;
	@Column(name="JCL_DESC_CLI")
	private String jcl_desc_cli;
	@Column(name="JBPT_DESTSUB")
	private String jbpt_destsub;
	@Column(name="JBPT_DESC_SUB")
	private String jbpt_desc_sub;
	@Column(name="JBPT_DESTREP")
	private String jbpt_destrep;
	@Column(name="JBPT_DESC_REP")
	private String jbtp_desc_rep;
	@Column(name="JBPT_DESTSEZ")
	private String jbpt_destsez;
	@Column(name="JBPT_DESC_SEZ")
	private String jbpt_desc_sez;
	@Column(name="JBPT_CENCOS")
	private String jbpt_cencos;
	@Column(name="JBPT_ASPETT")
	private String jbpt_aspett;
	@Column(name="JBPT_AMEZZO")
	private String jbpt_amezzo;
	@Column(name="JBPT_VETDES")
	private String jbpt_vetdes;
	@Column(name="JBPT_VETCOD")
	private String jbpt_vetcod;
	@Column(name="JBPT_XCONTO")
	private String jbpt_xconto;
	@Column(name="JBPT_TIPO_ARTICOLO")
	private String jbpt_tipo_articolo;
	@Column(name="JBPT_NUMCON")
	private String jbpt_numcon;
	@Column(name="JBPT_STAB")
	private String jbpt_stab;
	@Column(name="JBPT_NUM_BOL_DEF")
	private int jbpt_num_bol_def;
	@Column(name="JBPT_STAMPATA_SN")
	private String jbpt_stampata_sn;
	@Column(name="JBPT_DATA_INS")
	private Date jbpt_data_ins;
	@Column(name="JBPT_USER_INS")
	private String jbpt_user_ins;
	@Column(name="JBPT_DATA_VAR")
	private Date jbpt_data_var;
	@Column(name="JBPT_USER_VAR")
	private String jbpt_user_var;
	@Column(name=" JBPT_LIVELLO_DIV")
	private String jbpt_livello_div;
	@Column(name="JBPT_VETTORE_PIVA")
	private String jbpt_vettore_piva;
	@Column(name="JBPT_VETTORE_CFISC")
	private String jbpt_vettore_cfisc;
	@Column(name="JBPT_PROGRAMMATA_SN")
	private String jbpt_programmata_sn;
	@Column(name="JBPT_NCOLLI")
	private int jbpt_ncolli;
	@Column(name="JBPT_BLOCCATA")
	private String jbpt_bloccata;
	@Column(name="JBPT_VETDES_2")
	private String jbpt_vetdes_2;
	@Column(name="JBPT_VETCOD_2")
	private String jbpt_vetcod_2;
	@Column(name="JBPT_VETTORE_PIVA_2")
	private String jbpt_vettore_piva_2;
	@Column(name="JBPT_VETTORE_CFISC_2")
	private String jbpt_vettore_cfisc_2;
	@Column(name="JBPT_GIRO")
	private String jbpt_giro;
	@Column(name="JBPT_ALTRO1")
	private String jbpt_altro1;
	@Column(name="JBPT_ALTRO2")
	private String jbpt_altro2;
	@Column(name="JBPC_BPT_ID")
	private int jbpc_bpt_id;
	@Column(name="JBPC_CAUMOV")
	private String jbpc_caumov;
	@Column(name="JTT_DESC_CAUMOV")
	private String jtt_desc_caumov;
	@Column(name="JBPC_ARTICOLO")
	private String jbpc_articolo;
	@Column(name="JART.DESC_ART")
	private String jart_desc_Art;
	@Column(name="JBPC_CP_ID")
	private String jbpc_cp_id;
	@Column(name="JBPC_GRUME")
	private String jbpc_grume;
	@Column(name="JBPC_TAGLIA")
	private String jbpc_taglia;
	@Column(name="JBPC_UM")
	private String jbpc_um;
	@Column(name="JBPC_QTA")
	private double jbpc_qta;
	@Column(name="JBPC_PESO")
	private double jbpc_peso;
	@Column(name="JBPC_QTA_L")
	private double jbpc_qta_l;
	@Column(name="JBPC_PESO_L")
	private double jbpc_peso_l;
	@Column(name="JBPC_PREZZO")
	private double jbpc_prezzo;
	@Column(name="JBPC_IMBALLO")
	private String jbpc_imballo;
	@Column(name="JBPC_ASPETTO")
	private String jbpc_aspetto;
	@Column(name="JBPC_CLICOD")
	private int jbpc_clicod;
	@Column(name="JBPC_SUBCOD")
	private String jbpc_subcod;
	@Column(name="JBPC_REPCOD")
	private String jbpc_repcod;
	@Column(name="JBPC_SEZCOD")
	private String jbpc_sezcod;
	@Column(name="JBPC_BOL_KEY")
	private String jbpc_bol_key;
	@Column(name="JBPC_QTA_CON")
	private double jbpc_qta_con;
	@Column(name="JBPC_QTA_PRE")
	private double jbpc_qta_pre;
	@Column(name="JBPC_QTA_DIF")
	private double jbpc_qta_dif;
	@Column(name="JBPC_DES_CAUMOV")
	private String jbpc_des_caumov;
	@Column(name="JBPC_DIPENDENTE")
	private String jbpc_dipendente;
	@Column(name="JBPC_PARTITA")
	private String jbpc_partita;
	@Column(name="JBPC_PARTITA2")
	private String jbpc_partita2;
	@Column(name="JCLS_IP")
	private String jcls_ip;
	public int getJpbd_id() {
		return jpbd_id;
	}
	public void setJpbd_id(int jpbd_id) {
		this.jpbd_id = jpbd_id;
	}
	public String getJbpt_emitt() {
		return jbpt_emitt;
	}
	public void setJbpt_emitt(String jbpt_emitt) {
		this.jbpt_emitt = jbpt_emitt;
	}
	public String getJcls_desc_emitt() {
		return jcls_desc_emitt;
	}
	public void setJcls_desc_emitt(String jcls_desc_emitt) {
		this.jcls_desc_emitt = jcls_desc_emitt;
	}
	public int getJbpt_anno() {
		return jbpt_anno;
	}
	public void setJbpt_anno(int jbpt_anno) {
		this.jbpt_anno = jbpt_anno;
	}
	public String getJbpt_sigbol() {
		return jbpt_sigbol;
	}
	public void setJbpt_sigbol(String jbpt_sigbol) {
		this.jbpt_sigbol = jbpt_sigbol;
	}
	public Date getJbpt_datbol() {
		return jbpt_datbol;
	}
	public void setJbpt_datbol(Date jbpt_datbol) {
		this.jbpt_datbol = jbpt_datbol;
	}
	public Date getJbpt_datspe() {
		return jbpt_datspe;
	}
	public void setJbpt_datspe(Date jbpt_datspe) {
		this.jbpt_datspe = jbpt_datspe;
	}
	public String getJbpt_caubol() {
		return jbpt_caubol;
	}
	public void setJbpt_caubol(String jbpt_caubol) {
		this.jbpt_caubol = jbpt_caubol;
	}
	public String getJcau_des() {
		return jcau_des;
	}
	public void setJcau_des(String jcau_des) {
		this.jcau_des = jcau_des;
	}
	public String getJbpt_caumov() {
		return jbpt_caumov;
	}
	public void setJbpt_caumov(String jbpt_caumov) {
		this.jbpt_caumov = jbpt_caumov;
	}
	public int getJbpt_clicod() {
		return jbpt_clicod;
	}
	public void setJbpt_clicod(int jbpt_clicod) {
		this.jbpt_clicod = jbpt_clicod;
	}
	public String getJbpt_subcod() {
		return jbpt_subcod;
	}
	public void setJbpt_subcod(String jbpt_subcod) {
		this.jbpt_subcod = jbpt_subcod;
	}
	public String getJbpt_repcod() {
		return jbpt_repcod;
	}
	public void setJbpt_repcod(String jbpt_repcod) {
		this.jbpt_repcod = jbpt_repcod;
	}
	public String getJbpt_sezcod() {
		return jbpt_sezcod;
	}
	public void setJbpt_sezcod(String jbpt_sezcod) {
		this.jbpt_sezcod = jbpt_sezcod;
	}
	public int getJbpt_destcli() {
		return jbpt_destcli;
	}
	public void setJbpt_destcli(int jbpt_destcli) {
		this.jbpt_destcli = jbpt_destcli;
	}
	public String getJcl_desc_cli() {
		return jcl_desc_cli;
	}
	public void setJcl_desc_cli(String jcl_desc_cli) {
		this.jcl_desc_cli = jcl_desc_cli;
	}
	public String getJbpt_destsub() {
		return jbpt_destsub;
	}
	public void setJbpt_destsub(String jbpt_destsub) {
		this.jbpt_destsub = jbpt_destsub;
	}
	public String getJbpt_desc_sub() {
		return jbpt_desc_sub;
	}
	public void setJbpt_desc_sub(String jbpt_desc_sub) {
		this.jbpt_desc_sub = jbpt_desc_sub;
	}
	public String getJbpt_destrep() {
		return jbpt_destrep;
	}
	public void setJbpt_destrep(String jbpt_destrep) {
		this.jbpt_destrep = jbpt_destrep;
	}
	public String getJbtp_desc_rep() {
		return jbtp_desc_rep;
	}
	public void setJbtp_desc_rep(String jbtp_desc_rep) {
		this.jbtp_desc_rep = jbtp_desc_rep;
	}
	public String getJbpt_destsez() {
		return jbpt_destsez;
	}
	public void setJbpt_destsez(String jbpt_destsez) {
		this.jbpt_destsez = jbpt_destsez;
	}
	public String getJbpt_desc_sez() {
		return jbpt_desc_sez;
	}
	public void setJbpt_desc_sez(String jbpt_desc_sez) {
		this.jbpt_desc_sez = jbpt_desc_sez;
	}
	public String getJbpt_cencos() {
		return jbpt_cencos;
	}
	public void setJbpt_cencos(String jbpt_cencos) {
		this.jbpt_cencos = jbpt_cencos;
	}
	public String getJbpt_aspett() {
		return jbpt_aspett;
	}
	public void setJbpt_aspett(String jbpt_aspett) {
		this.jbpt_aspett = jbpt_aspett;
	}
	public String getJbpt_amezzo() {
		return jbpt_amezzo;
	}
	public void setJbpt_amezzo(String jbpt_amezzo) {
		this.jbpt_amezzo = jbpt_amezzo;
	}
	public String getJbpt_vetdes() {
		return jbpt_vetdes;
	}
	public void setJbpt_vetdes(String jbpt_vetdes) {
		this.jbpt_vetdes = jbpt_vetdes;
	}
	public String getJbpt_vetcod() {
		return jbpt_vetcod;
	}
	public void setJbpt_vetcod(String jbpt_vetcod) {
		this.jbpt_vetcod = jbpt_vetcod;
	}
	public String getJbpt_xconto() {
		return jbpt_xconto;
	}
	public void setJbpt_xconto(String jbpt_xconto) {
		this.jbpt_xconto = jbpt_xconto;
	}
	public String getJbpt_tipo_articolo() {
		return jbpt_tipo_articolo;
	}
	public void setJbpt_tipo_articolo(String jbpt_tipo_articolo) {
		this.jbpt_tipo_articolo = jbpt_tipo_articolo;
	}
	public String getJbpt_numcon() {
		return jbpt_numcon;
	}
	public void setJbpt_numcon(String jbpt_numcon) {
		this.jbpt_numcon = jbpt_numcon;
	}
	public String getJbpt_stab() {
		return jbpt_stab;
	}
	public void setJbpt_stab(String jbpt_stab) {
		this.jbpt_stab = jbpt_stab;
	}
	public int getJbpt_num_bol_def() {
		return jbpt_num_bol_def;
	}
	public void setJbpt_num_bol_def(int jbpt_num_bol_def) {
		this.jbpt_num_bol_def = jbpt_num_bol_def;
	}
	public String getJbpt_stampata_sn() {
		return jbpt_stampata_sn;
	}
	public void setJbpt_stampata_sn(String jbpt_stampata_sn) {
		this.jbpt_stampata_sn = jbpt_stampata_sn;
	}
	public Date getJbpt_data_ins() {
		return jbpt_data_ins;
	}
	public void setJbpt_data_ins(Date jbpt_data_ins) {
		this.jbpt_data_ins = jbpt_data_ins;
	}
	public String getJbpt_user_ins() {
		return jbpt_user_ins;
	}
	public void setJbpt_user_ins(String jbpt_user_ins) {
		this.jbpt_user_ins = jbpt_user_ins;
	}
	public Date getJbpt_data_var() {
		return jbpt_data_var;
	}
	public void setJbpt_data_var(Date jbpt_data_var) {
		this.jbpt_data_var = jbpt_data_var;
	}
	public String getJbpt_user_var() {
		return jbpt_user_var;
	}
	public void setJbpt_user_var(String jbpt_user_var) {
		this.jbpt_user_var = jbpt_user_var;
	}
	public String getJbpt_livello_div() {
		return jbpt_livello_div;
	}
	public void setJbpt_livello_div(String jbpt_livello_div) {
		this.jbpt_livello_div = jbpt_livello_div;
	}
	public String getJbpt_vettore_piva() {
		return jbpt_vettore_piva;
	}
	public void setJbpt_vettore_piva(String jbpt_vettore_piva) {
		this.jbpt_vettore_piva = jbpt_vettore_piva;
	}
	public String getJbpt_vettore_cfisc() {
		return jbpt_vettore_cfisc;
	}
	public void setJbpt_vettore_cfisc(String jbpt_vettore_cfisc) {
		this.jbpt_vettore_cfisc = jbpt_vettore_cfisc;
	}
	public String getJbpt_programmata_sn() {
		return jbpt_programmata_sn;
	}
	public void setJbpt_programmata_sn(String jbpt_programmata_sn) {
		this.jbpt_programmata_sn = jbpt_programmata_sn;
	}
	public int getJbpt_ncolli() {
		return jbpt_ncolli;
	}
	public void setJbpt_ncolli(int jbpt_ncolli) {
		this.jbpt_ncolli = jbpt_ncolli;
	}
	public String getJbpt_bloccata() {
		return jbpt_bloccata;
	}
	public void setJbpt_bloccata(String jbpt_bloccata) {
		this.jbpt_bloccata = jbpt_bloccata;
	}
	public String getJbpt_vetdes_2() {
		return jbpt_vetdes_2;
	}
	public void setJbpt_vetdes_2(String jbpt_vetdes_2) {
		this.jbpt_vetdes_2 = jbpt_vetdes_2;
	}
	public String getJbpt_vetcod_2() {
		return jbpt_vetcod_2;
	}
	public void setJbpt_vetcod_2(String jbpt_vetcod_2) {
		this.jbpt_vetcod_2 = jbpt_vetcod_2;
	}
	public String getJbpt_vettore_piva_2() {
		return jbpt_vettore_piva_2;
	}
	public void setJbpt_vettore_piva_2(String jbpt_vettore_piva_2) {
		this.jbpt_vettore_piva_2 = jbpt_vettore_piva_2;
	}
	public String getJbpt_vettore_cfisc_2() {
		return jbpt_vettore_cfisc_2;
	}
	public void setJbpt_vettore_cfisc_2(String jbpt_vettore_cfisc_2) {
		this.jbpt_vettore_cfisc_2 = jbpt_vettore_cfisc_2;
	}
	public String getJbpt_giro() {
		return jbpt_giro;
	}
	public void setJbpt_giro(String jbpt_giro) {
		this.jbpt_giro = jbpt_giro;
	}
	public String getJbpt_altro1() {
		return jbpt_altro1;
	}
	public void setJbpt_altro1(String jbpt_altro1) {
		this.jbpt_altro1 = jbpt_altro1;
	}
	public String getJbpt_altro2() {
		return jbpt_altro2;
	}
	public void setJbpt_altro2(String jbpt_altro2) {
		this.jbpt_altro2 = jbpt_altro2;
	}
	public int getJbpc_bpt_id() {
		return jbpc_bpt_id;
	}
	public void setJbpc_bpt_id(int jbpc_bpt_id) {
		this.jbpc_bpt_id = jbpc_bpt_id;
	}
	public String getJbpc_caumov() {
		return jbpc_caumov;
	}
	public void setJbpc_caumov(String jbpc_caumov) {
		this.jbpc_caumov = jbpc_caumov;
	}
	public String getJtt_desc_caumov() {
		return jtt_desc_caumov;
	}
	public void setJtt_desc_caumov(String jtt_desc_caumov) {
		this.jtt_desc_caumov = jtt_desc_caumov;
	}
	public String getJbpc_articolo() {
		return jbpc_articolo;
	}
	public void setJbpc_articolo(String jbpc_articolo) {
		this.jbpc_articolo = jbpc_articolo;
	}
	public String getJart_desc_Art() {
		return jart_desc_Art;
	}
	public void setJart_desc_Art(String jart_desc_Art) {
		this.jart_desc_Art = jart_desc_Art;
	}
	public String getJbpc_cp_id() {
		return jbpc_cp_id;
	}
	public void setJbpc_cp_id(String jbpc_cp_id) {
		this.jbpc_cp_id = jbpc_cp_id;
	}
	public String getJbpc_grume() {
		return jbpc_grume;
	}
	public void setJbpc_grume(String jbpc_grume) {
		this.jbpc_grume = jbpc_grume;
	}
	public String getJbpc_taglia() {
		return jbpc_taglia;
	}
	public void setJbpc_taglia(String jbpc_taglia) {
		this.jbpc_taglia = jbpc_taglia;
	}
	public String getJbpc_um() {
		return jbpc_um;
	}
	public void setJbpc_um(String jbpc_um) {
		this.jbpc_um = jbpc_um;
	}
	public double getJbpc_qta() {
		return jbpc_qta;
	}
	public void setJbpc_qta(double jbpc_qta) {
		this.jbpc_qta = jbpc_qta;
	}
	public double getJbpc_peso() {
		return jbpc_peso;
	}
	public void setJbpc_peso(double jbpc_peso) {
		this.jbpc_peso = jbpc_peso;
	}
	public double getJbpc_qta_l() {
		return jbpc_qta_l;
	}
	public void setJbpc_qta_l(double jbpc_qta_l) {
		this.jbpc_qta_l = jbpc_qta_l;
	}
	public double getJbpc_peso_l() {
		return jbpc_peso_l;
	}
	public void setJbpc_peso_l(double jbpc_peso_l) {
		this.jbpc_peso_l = jbpc_peso_l;
	}
	public double getJbpc_prezzo() {
		return jbpc_prezzo;
	}
	public void setJbpc_prezzo(double jbpc_prezzo) {
		this.jbpc_prezzo = jbpc_prezzo;
	}
	public String getJbpc_imballo() {
		return jbpc_imballo;
	}
	public void setJbpc_imballo(String jbpc_imballo) {
		this.jbpc_imballo = jbpc_imballo;
	}
	public String getJbpc_aspetto() {
		return jbpc_aspetto;
	}
	public void setJbpc_aspetto(String jbpc_aspetto) {
		this.jbpc_aspetto = jbpc_aspetto;
	}
	public int getJbpc_clicod() {
		return jbpc_clicod;
	}
	public void setJbpc_clicod(int jbpc_clicod) {
		this.jbpc_clicod = jbpc_clicod;
	}
	public String getJbpc_subcod() {
		return jbpc_subcod;
	}
	public void setJbpc_subcod(String jbpc_subcod) {
		this.jbpc_subcod = jbpc_subcod;
	}
	public String getJbpc_repcod() {
		return jbpc_repcod;
	}
	public void setJbpc_repcod(String jbpc_repcod) {
		this.jbpc_repcod = jbpc_repcod;
	}
	public String getJbpc_sezcod() {
		return jbpc_sezcod;
	}
	public void setJbpc_sezcod(String jbpc_sezcod) {
		this.jbpc_sezcod = jbpc_sezcod;
	}
	public String getJbpc_bol_key() {
		return jbpc_bol_key;
	}
	public void setJbpc_bol_key(String jbpc_bol_key) {
		this.jbpc_bol_key = jbpc_bol_key;
	}
	public double getJbpc_qta_con() {
		return jbpc_qta_con;
	}
	public void setJbpc_qta_con(double jbpc_qta_con) {
		this.jbpc_qta_con = jbpc_qta_con;
	}
	public double getJbpc_qta_pre() {
		return jbpc_qta_pre;
	}
	public void setJbpc_qta_pre(double jbpc_qta_pre) {
		this.jbpc_qta_pre = jbpc_qta_pre;
	}
	public double getJbpc_qta_dif() {
		return jbpc_qta_dif;
	}
	public void setJbpc_qta_dif(double jbpc_qta_dif) {
		this.jbpc_qta_dif = jbpc_qta_dif;
	}
	public String getJbpc_des_caumov() {
		return jbpc_des_caumov;
	}
	public void setJbpc_des_caumov(String jbpc_des_caumov) {
		this.jbpc_des_caumov = jbpc_des_caumov;
	}
	public String getJbpc_dipendente() {
		return jbpc_dipendente;
	}
	public void setJbpc_dipendente(String jbpc_dipendente) {
		this.jbpc_dipendente = jbpc_dipendente;
	}
	public String getJbpc_partita() {
		return jbpc_partita;
	}
	public void setJbpc_partita(String jbpc_partita) {
		this.jbpc_partita = jbpc_partita;
	}
	public String getJbpc_partita2() {
		return jbpc_partita2;
	}
	public void setJbpc_partita2(String jbpc_partita2) {
		this.jbpc_partita2 = jbpc_partita2;
	}
	public String getJcls_ip() {
		return jcls_ip;
	}
	public void setJcls_ip(String jcls_ip) {
		this.jcls_ip = jcls_ip;
	}
	
	
}
