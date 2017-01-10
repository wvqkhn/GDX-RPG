package com.rpsg.rpg.object.item;

/**
 *	GDX-RPG 基础数值类型 
 */
public enum PropKey {
	/**当前血量*/
	hp,
	/**最大血量*/
	maxhp,
	/**当前蓝量*/
	mp,
	/**最大蓝量*/
	maxmp,
	/**物理攻击力*/
	patk,
	/**魔法攻击力*/
	matk,
	/**物理防御力*/
	pdef,
	/**魔法防御力*/
	mdef,
	/**速度（决定了战斗中行动速度）*/
	speed,
	/**命中率*/
	hit,
	/**等级*/
	level,
	/**经验*/
	exp,
	/**下一级所需经验*/
	nextExp,
	/**暴击率*/
	criticalRate,
	/**暴击伤害*/
	critical,
	/**是否死亡（1=true，0=false）*/
	dead,
	/**被敌人攻击的评分，越高的值代表越容易被聪明的AI攻击。*/
	rank,
	/**被敌人攻击的几率(0-100)，越高的值代表越容易被敌人攻击。*/
	rankRate,
	/**技能额外倍率*/
	attackRate;
	
	public static final int TRUE = 1, FALSE = 0;
}