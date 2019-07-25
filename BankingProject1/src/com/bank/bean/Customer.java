package com.bank.bean;
public class Customer 
{ 
	private int cid;
	private String cname;
	private long cmob;
	private int cpan;
	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public long getCmob() {
		return cmob;
	}

	public void setCmob(long cmob) {
		this.cmob = cmob;
	}

	public int getCpan() {
		return cpan;
	}

	public void setCpan(int cpan) {
		this.cpan = cpan;
	}

	public void acceptValues(int id,String name,long mob,int pan)
	{ 
		cid=id;
		cname=name;
		cmob=mob;
		cpan=pan;
	}
	
	public Customer() {
		this.cid=9;
		this.cname="LMN";
		this.cmob=5463820264L;
		this.cpan=34576;
	}
	public Customer(int cid, String cname, long cmob, int cpan) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cmob = cmob;
		this.cpan = cpan;
	}


	public void finalize()
	{
		System.out.println(cid);
	}
	
	public String display()
	{
		String c="Customer ID is  "+cid+"Customer name is  "+cname+ "Mobile no is  "+cmob+ "Pan number is  "+cpan;
		return c;
	}
	
}
