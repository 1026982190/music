<?xml version="1.0" encoding="UTF-8"?>
<tabledefine storagename="singer" ID="8D25D4AD45C7ACCDB39AD186DA2A04BC" name-db="singer" category="" title="歌手" author="" description="" packagename="com.jiuqi.lzp.music.storage.singer" name="singer" isneedrebuild="false">
	<fields>
		<field dbtable="singer" name="NAME" name-db="NAME" type="nvarchar(20)" primary-key="false" keep-valid="false" author="" title="姓名" description="" ID="AB239AC58CCF980856B43A415D9A5E81"/>
		<field dbtable="singer" name="SEX" name-db="SEX" type="nvarchar(10)" primary-key="false" keep-valid="false" author="" title="性别" description="" ID="C7601D8BEA33595FFDDC2062E81ABEF7"/>
		<field dbtable="singer" name="BIRTH_DATE" name-db="BIRTH_DATE" type="date" primary-key="false" keep-valid="false" author="" title="出生日期" description="" ID="088E2368106217014683DD79FD4561AB"/>
		<field dbtable="singer" name="BRIEF_INTRODUCTION" name-db="BRIEF_INTRODUCTION" type="nvarchar(100)" primary-key="false" keep-valid="false" author="" title="简介" description="" ID="85162A1B6F0678C164BA8096EDF3D62E"/>
		<field dbtable="singer" name="DETAIL_INTRODUCTION" name-db="DETAIL_INTRODUCTION" type="ntext" primary-key="false" keep-valid="false" author="" title="详细介绍" description="" ID="6A71D111A0D0749BA5DBA5E6D64E2808"/>
		<field dbtable="singer" name="PHOTO" name-db="PHOTO" type="blob" primary-key="false" keep-valid="false" author="" title="照片" description="" ID="5EE493CC4B9D6958B60BA07BE3991747"/>
	</fields>
	<indexs/>
	<hierarchies/>
	<dbtables>
		<dbtable author="" name="singer" name-db="singer" title="" description=""/>
	</dbtables>
	<relations/>
</tabledefine>
