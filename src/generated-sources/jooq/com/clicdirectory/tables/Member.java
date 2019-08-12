/**
 * This class is generated by jOOQ
 */
package com.clicdirectory.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Member extends org.jooq.impl.TableImpl<com.clicdirectory.tables.records.MemberRecord> {

	private static final long serialVersionUID = 1215401570;

	/**
	 * The singleton instance of <code>public.member</code>
	 */
	public static final com.clicdirectory.tables.Member MEMBER = new com.clicdirectory.tables.Member();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.clicdirectory.tables.records.MemberRecord> getRecordType() {
		return com.clicdirectory.tables.records.MemberRecord.class;
	}

	/**
	 * The column <code>public.member.name</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * The column <code>public.member.email</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>public.member.phone</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>public.member.location</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> LOCATION = createField("location", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

	/**
	 * The column <code>public.member.is_verified</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.Boolean> IS_VERIFIED = createField("is_verified", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>public.member.password</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(30), this, "");

	/**
	 * The column <code>public.member.role</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> ROLE = createField("role", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

	/**
	 * The column <code>public.member.token</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> TOKEN = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>public.member.id</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this, "");

	/**
	 * The column <code>public.member.fb_token</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> FB_TOKEN = createField("fb_token", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "");

	/**
	 * The column <code>public.member.authentication</code>.
	 */
	public final org.jooq.TableField<com.clicdirectory.tables.records.MemberRecord, java.lang.String> AUTHENTICATION = createField("authentication", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * Create a <code>public.member</code> table reference
	 */
	public Member() {
		this("member", null);
	}

	/**
	 * Create an aliased <code>public.member</code> table reference
	 */
	public Member(java.lang.String alias) {
		this(alias, com.clicdirectory.tables.Member.MEMBER);
	}

	private Member(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.MemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private Member(java.lang.String alias, org.jooq.Table<com.clicdirectory.tables.records.MemberRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.clicdirectory.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<com.clicdirectory.tables.records.MemberRecord, java.lang.Long> getIdentity() {
		return com.clicdirectory.Keys.IDENTITY_MEMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.clicdirectory.tables.records.MemberRecord> getPrimaryKey() {
		return com.clicdirectory.Keys.MEMBER_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.clicdirectory.tables.records.MemberRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.clicdirectory.tables.records.MemberRecord>>asList(com.clicdirectory.Keys.MEMBER_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.clicdirectory.tables.Member as(java.lang.String alias) {
		return new com.clicdirectory.tables.Member(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.clicdirectory.tables.Member rename(java.lang.String name) {
		return new com.clicdirectory.tables.Member(name, null);
	}
}