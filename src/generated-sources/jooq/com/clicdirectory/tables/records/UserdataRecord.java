/**
 * This class is generated by jOOQ
 */
package com.clicdirectory.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserdataRecord extends org.jooq.impl.TableRecordImpl<com.clicdirectory.tables.records.UserdataRecord> implements org.jooq.Record5<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = -767675415;

	/**
	 * Setter for <code>public.Userdata.contactno</code>.
	 */
	public void setContactno(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.Userdata.contactno</code>.
	 */
	public java.lang.Long getContactno() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>public.Userdata.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.Userdata.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.Userdata.usertype</code>.
	 */
	public void setUsertype(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.Userdata.usertype</code>.
	 */
	public java.lang.String getUsertype() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.Userdata.authentication</code>.
	 */
	public void setAuthentication(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.Userdata.authentication</code>.
	 */
	public java.lang.Long getAuthentication() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>public.Userdata.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.Userdata.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return com.clicdirectory.tables.Userdata.USERDATA.CONTACTNO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.clicdirectory.tables.Userdata.USERDATA.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.clicdirectory.tables.Userdata.USERDATA.USERTYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return com.clicdirectory.tables.Userdata.USERDATA.AUTHENTICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return com.clicdirectory.tables.Userdata.USERDATA.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getContactno();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUsertype();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getAuthentication();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserdataRecord value1(java.lang.Long value) {
		setContactno(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserdataRecord value2(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserdataRecord value3(java.lang.String value) {
		setUsertype(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserdataRecord value4(java.lang.Long value) {
		setAuthentication(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserdataRecord value5(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserdataRecord values(java.lang.Long value1, java.lang.String value2, java.lang.String value3, java.lang.Long value4, java.lang.String value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserdataRecord
	 */
	public UserdataRecord() {
		super(com.clicdirectory.tables.Userdata.USERDATA);
	}

	/**
	 * Create a detached, initialised UserdataRecord
	 */
	public UserdataRecord(java.lang.Long contactno, java.lang.String password, java.lang.String usertype, java.lang.Long authentication, java.lang.String email) {
		super(com.clicdirectory.tables.Userdata.USERDATA);

		setValue(0, contactno);
		setValue(1, password);
		setValue(2, usertype);
		setValue(3, authentication);
		setValue(4, email);
	}
}