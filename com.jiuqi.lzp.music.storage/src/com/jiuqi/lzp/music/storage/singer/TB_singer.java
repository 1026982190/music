package com.jiuqi.lzp.music.storage.singer;

import com.jiuqi.dna.core.def.table.TableDeclarator;
import com.jiuqi.dna.core.type.TypeFactory;
import com.jiuqi.dna.core.def.table.TableFieldDefine;
import com.jiuqi.dna.core.def.table.TableFieldDeclare;

public final class TB_singer extends TableDeclarator {

	public static final String TABLE_NAME ="singer";

	public final TableFieldDefine f_NAME;
	public final TableFieldDefine f_SEX;
	public final TableFieldDefine f_BIRTH_DATE;
	public final TableFieldDefine f_BRIEF_INTRODUCTION;
	public final TableFieldDefine f_DETAIL_INTRODUCTION;
	public final TableFieldDefine f_PHOTO;

	public static final String FN_NAME ="NAME";
	public static final String FN_SEX ="SEX";
	public static final String FN_BIRTH_DATE ="BIRTH_DATE";
	public static final String FN_BRIEF_INTRODUCTION ="BRIEF_INTRODUCTION";
	public static final String FN_DETAIL_INTRODUCTION ="DETAIL_INTRODUCTION";
	public static final String FN_PHOTO ="PHOTO";

	//不可调用该构造方法.当前类只能由框架实例化.
	private TB_singer() {
		super(TABLE_NAME);
		this.table.setTitle("歌手");
		TableFieldDeclare field;
		this.f_NAME = field = this.table.newField(FN_NAME, TypeFactory.NVARCHAR(20));
		field.setTitle("姓名");
		this.f_SEX = field = this.table.newField(FN_SEX, TypeFactory.NVARCHAR(10));
		field.setTitle("性别");
		this.f_BIRTH_DATE = field = this.table.newField(FN_BIRTH_DATE, TypeFactory.DATE);
		field.setTitle("出生日期");
		this.f_BRIEF_INTRODUCTION = field = this.table.newField(FN_BRIEF_INTRODUCTION, TypeFactory.NVARCHAR(100));
		field.setTitle("简介");
		this.f_DETAIL_INTRODUCTION = field = this.table.newField(FN_DETAIL_INTRODUCTION, TypeFactory.NTEXT);
		field.setTitle("详细介绍");
		this.f_PHOTO = field = this.table.newField(FN_PHOTO, TypeFactory.BLOB);
		field.setTitle("照片");
	}

}
