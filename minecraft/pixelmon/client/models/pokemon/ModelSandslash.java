// Date: 2/7/2013 3:06:12 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.ModuleTailBasic;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelSandslash extends PixelmonModelBase {
	// fields

	PixelmonModelRenderer Body;

	public ModelSandslash() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 12, -1);
		PixelmonModelRenderer body_ = new PixelmonModelRenderer(this, 0, 49);
		body_.addBox(-4F, 0F, 0F, 8, 8, 7);
		body_.setTextureSize(128, 64);
		body_.mirror = true;
		setRotation(body_, -0.296706F, 0F, 0F);
		Body.addChild(body_);
		PixelmonModelRenderer neck_base = new PixelmonModelRenderer(this, 0, 38);
		neck_base.addBox(-3F, 0.2666667F, -1F, 6, 6, 4);
		neck_base.setTextureSize(128, 64);
		neck_base.mirror = true;
		setRotation(neck_base, -0.6806784F, 0F, 0F);
		Body.addChild(neck_base);
		PixelmonModelRenderer neck_ = new PixelmonModelRenderer(this, 0, 30);
		neck_.addBox(-2F, 0.7333333F, -3F, 4, 4, 3);
		neck_.setTextureSize(128, 64);
		neck_.mirror = true;
		setRotation(neck_, -0.6981317F, 0F, 0F);
		Body.addChild(neck_);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, -1, -4);
		PixelmonModelRenderer head = new PixelmonModelRenderer(this, 31, 37);
		head.addBox(-3F, -2.266667F, -3.8F, 6, 5, 5);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.4014257F, 0F, 0F);
		Head.addChild(head);
		PixelmonModelRenderer snout_1 = new PixelmonModelRenderer(this, 35, 31);
		snout_1.addBox(-2F, -1.333333F, -4.4F, 4, 3, 2);
		snout_1.setTextureSize(128, 64);
		snout_1.mirror = true;
		setRotation(snout_1, 0.6806784F, 0F, 0F);
		Head.addChild(snout_1);
		PixelmonModelRenderer snout_2 = new PixelmonModelRenderer(this, 36, 26);
		snout_2.addBox(-1F, -1.266667F, -5.666667F, 2, 2, 2);
		snout_2.setTextureSize(128, 64);
		snout_2.mirror = true;
		setRotation(snout_2, 0.7330383F, 0F, 0F);
		Head.addChild(snout_2);
		PixelmonModelRenderer ear_L = new PixelmonModelRenderer(this, 55, 22);
		ear_L.addBox(2.7F, -5.266667F, 0.2F, 0, 5, 5);
		ear_L.setTextureSize(128, 64);
		ear_L.mirror = true;
		setRotation(ear_L, -0.0523599F, 0.5061455F, -0.0174533F);
		Head.addChild(ear_L);
		PixelmonModelRenderer ear_R = new PixelmonModelRenderer(this, 55, 22);
		ear_R.addBox(-2.6F, -5.266667F, 0.2F, 0, 5, 5);
		ear_R.setTextureSize(128, 64);
		ear_R.mirror = true;
		setRotation(ear_R, -0.0523599F, -0.5061455F, -0.0174533F);
		Head.addChild(ear_R);
		PixelmonModelRenderer head_spike_1 = new PixelmonModelRenderer(this,
				35, 48);
		head_spike_1.addBox(-1F, -3.866667F, -1.8F, 2, 2, 5);
		head_spike_1.setTextureSize(128, 64);
		head_spike_1.mirror = true;
		setRotation(head_spike_1, 0.9599311F, 0F, 0F);
		Head.addChild(head_spike_1);
		PixelmonModelRenderer head_spike_1_2 = new PixelmonModelRenderer(this,
				39, 52);
		head_spike_1_2.addBox(-0.5F, -4.066667F, 2.2F, 1, 1, 2);
		head_spike_1_2.setTextureSize(128, 64);
		head_spike_1_2.mirror = true;
		setRotation(head_spike_1_2, 0.8552113F, 0F, 0F);
		Head.addChild(head_spike_1_2);
		PixelmonModelRenderer head_spike_2 = new PixelmonModelRenderer(this,
				22, 14);
		head_spike_2.addBox(-2F, -2.666667F, 0.6F, 2, 2, 5);
		head_spike_2.setTextureSize(128, 64);
		head_spike_2.mirror = true;
		setRotation(head_spike_2, 0.9424778F, 0F, -0.3316126F);
		Head.addChild(head_spike_2);
		PixelmonModelRenderer head_spike_2_2 = new PixelmonModelRenderer(this,
				22, 14);
		head_spike_2_2.addBox(-1.5F, -2.6F, 1.6F, 1, 1, 5);
		head_spike_2_2.setTextureSize(128, 64);
		head_spike_2_2.mirror = true;
		setRotation(head_spike_2_2, 0.9075712F, 0F, -0.3316126F);
		Head.addChild(head_spike_2_2);
		PixelmonModelRenderer head_spike_3 = new PixelmonModelRenderer(this,
				22, 14);
		head_spike_3.addBox(0F, -2.666667F, 0.6666667F, 2, 2, 5);
		head_spike_3.setTextureSize(128, 64);
		head_spike_3.mirror = true;
		setRotation(head_spike_3, 0.9424778F, 0F, 0.3316126F);
		Head.addChild(head_spike_3);
		PixelmonModelRenderer head_spike_3_2 = new PixelmonModelRenderer(this,
				22, 14);
		head_spike_3_2.addBox(0.5F, -2.6F, 1.6F, 1, 1, 5);
		head_spike_3_2.setTextureSize(128, 64);
		head_spike_3_2.mirror = true;
		setRotation(head_spike_3_2, 0.9075712F, 0F, 0.3316126F);
		Head.addChild(head_spike_3_2);
		Body.addChild(Head);

		PixelmonModelRenderer Tail = new PixelmonModelRenderer(this, "Tail");
		Tail.setRotationPoint(0, 4, 6);
		PixelmonModelRenderer tail_base = new PixelmonModelRenderer(this, 110,
				0);
		tail_base.addBox(-3F, -2F, -2F, 6, 7, 3);
		tail_base.setTextureSize(128, 64);
		tail_base.mirror = true;
		setRotation(tail_base, -0.0174533F, 0F, 0F);
		Tail.addChild(tail_base);
		PixelmonModelRenderer tail_1 = new PixelmonModelRenderer(this, 112, 11);
		tail_1.addBox(-2.5F, -1F, 0F, 5, 5, 3);
		tail_1.setTextureSize(128, 64);
		tail_1.mirror = true;
		setRotation(tail_1, 0.0523599F, 0F, 0F);
		Tail.addChild(tail_1);
		PixelmonModelRenderer tail_2 = new PixelmonModelRenderer(this, 114, 20);
		tail_2.addBox(-2F, -0.6666667F, 2F, 4, 4, 3);
		tail_2.setTextureSize(128, 64);
		tail_2.mirror = true;
		setRotation(tail_2, 0.1570796F, 0F, 0F);
		Tail.addChild(tail_2);
		PixelmonModelRenderer tail_3 = new PixelmonModelRenderer(this, 116, 28);
		tail_3.addBox(-1.5F, -0.2F, 4F, 3, 3, 3);
		tail_3.setTextureSize(128, 64);
		tail_3.mirror = true;
		setRotation(tail_3, 0.2443461F, 0F, 0F);
		Tail.addChild(tail_3);
		PixelmonModelRenderer tail_4 = new PixelmonModelRenderer(this, 118, 35);
		tail_4.addBox(-1F, 0.8F, 6F, 2, 2, 3);
		tail_4.setTextureSize(128, 64);
		tail_4.mirror = true;
		setRotation(tail_4, 0.3665191F, 0F, 0F);
		Tail.addChild(tail_4);
		Body.addChild(Tail);

		PixelmonModelRenderer LeftLeg = new PixelmonModelRenderer(this,
				"Left Leg");
		LeftLeg.setRotationPoint(4, 7, 1);
		PixelmonModelRenderer leg_L_1 = new PixelmonModelRenderer(this, 59, 0);
		leg_L_1.addBox(-1.333333F, -1.266667F, -2F, 3, 5, 5);
		leg_L_1.setTextureSize(128, 64);
		leg_L_1.mirror = true;
		setRotation(leg_L_1, 0.5235988F, -0.418879F, 0F);
		LeftLeg.addChild(leg_L_1);
		PixelmonModelRenderer leg_L_2 = new PixelmonModelRenderer(this, 46, 0);
		leg_L_2.addBox(0.6666667F, -0.7333333F, -1.533333F, 2, 4, 4);
		leg_L_2.setTextureSize(128, 64);
		leg_L_2.mirror = true;
		setRotation(leg_L_2, 0.5235988F, -0.5410521F, 0F);
		LeftLeg.addChild(leg_L_2);
		PixelmonModelRenderer foot_L_ = new PixelmonModelRenderer(this, 61, 12);
		foot_L_.addBox(-0.9333333F, 3.733333F, -2F, 3, 1, 4);
		foot_L_.setTextureSize(128, 64);
		foot_L_.mirror = true;
		setRotation(foot_L_, 0F, -0.418879F, 0F);
		LeftLeg.addChild(foot_L_);
		PixelmonModelRenderer foot_claw_1_L_ = new PixelmonModelRenderer(this,
				55, 11);
		foot_claw_1_L_.addBox(-0.5333334F, 3.666667F, -4F, 1, 1, 2);
		foot_claw_1_L_.setTextureSize(128, 64);
		foot_claw_1_L_.mirror = true;
		setRotation(foot_claw_1_L_, 0.0872665F, -0.418879F, 0F);
		LeftLeg.addChild(foot_claw_1_L_);
		PixelmonModelRenderer foot_claw_2_L_ = new PixelmonModelRenderer(this,
				55, 11);
		foot_claw_2_L_.addBox(0.2666667F, 3.6F, -4.333333F, 1, 1, 2);
		foot_claw_2_L_.setTextureSize(128, 64);
		foot_claw_2_L_.mirror = true;
		setRotation(foot_claw_2_L_, 0.0872665F, -0.6108652F, 0F);
		LeftLeg.addChild(foot_claw_2_L_);
		Body.addChild(LeftLeg);

		PixelmonModelRenderer RightLeg = new PixelmonModelRenderer(this,
				"Right Leg");
		RightLeg.setRotationPoint(-4, 7, 1);
		PixelmonModelRenderer leg_R_1 = new PixelmonModelRenderer(this, 59, 0);
		leg_R_1.addBox(-1.7F, -1.266667F, -2F, 3, 5, 5);
		leg_R_1.setTextureSize(128, 64);
		leg_R_1.mirror = true;
		setRotation(leg_R_1, 0.5235988F, 0.418879F, 0F);
		RightLeg.addChild(leg_R_1);
		PixelmonModelRenderer leg_R_2 = new PixelmonModelRenderer(this, 46, 0);
		leg_R_2.addBox(-2.666667F, -0.7333333F, -1.533333F, 2, 4, 4);
		leg_R_2.setTextureSize(128, 64);
		leg_R_2.mirror = true;
		setRotation(leg_R_2, 0.5235988F, 0.5410521F, 0F);
		RightLeg.addChild(leg_R_2);
		PixelmonModelRenderer foot_R = new PixelmonModelRenderer(this, 61, 12);
		foot_R.addBox(-1.933333F, 3.733333F, -2F, 3, 1, 4);
		foot_R.setTextureSize(128, 64);
		foot_R.mirror = true;
		setRotation(foot_R, 0F, 0.418879F, 0F);
		RightLeg.addChild(foot_R);
		PixelmonModelRenderer foot_claw_1_R = new PixelmonModelRenderer(this,
				55, 11);
		foot_claw_1_R.addBox(-0.2F, 3.666667F, -4F, 1, 1, 2);
		foot_claw_1_R.setTextureSize(128, 64);
		foot_claw_1_R.mirror = true;
		setRotation(foot_claw_1_R, 0.0872665F, 0.418879F, 0F);
		RightLeg.addChild(foot_claw_1_R);
		PixelmonModelRenderer foot_claw_2_R = new PixelmonModelRenderer(this,
				55, 11);
		foot_claw_2_R.addBox(-1.133333F, 3.6F, -4.3F, 1, 1, 2);
		foot_claw_2_R.setTextureSize(128, 64);
		foot_claw_2_R.mirror = true;
		setRotation(foot_claw_2_R, 0.0872665F, 0.6108652F, 0F);
		RightLeg.addChild(foot_claw_2_R);
		Body.addChild(RightLeg);

		PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this,
				"Left Arm");
		LeftArm.setRotationPoint(3, 4, -1.2F);
		PixelmonModelRenderer arm_L = new PixelmonModelRenderer(this, 0, 19);
		arm_L.addBox(-0.6666667F, 0F, -0.3333333F, 2, 2, 2);
		arm_L.setTextureSize(128, 64);
		arm_L.mirror = true;
		setRotation(arm_L, -0.1745329F, 0.3665191F, -0.7504916F);
		LeftArm.addChild(arm_L);
		PixelmonModelRenderer hand_L = new PixelmonModelRenderer(this, 9, 18);
		hand_L.addBox(-0.6666667F, 1.266667F, -0.3333333F, 2, 5, 4);
		hand_L.setTextureSize(128, 64);
		hand_L.mirror = true;
		setRotation(hand_L, -0.1745329F, 0.8203047F, -0.6283185F);
		LeftArm.addChild(hand_L);
		PixelmonModelRenderer hand_claw_1_L_1 = new PixelmonModelRenderer(this,
				0, 24);
		hand_claw_1_L_1.addBox(-0.2F, 4.2F, 1.933333F, 2, 3, 1);
		hand_claw_1_L_1.setTextureSize(128, 64);
		hand_claw_1_L_1.mirror = true;
		setRotation(hand_claw_1_L_1, -0.1745329F, 1.256637F, -0.6283185F);
		LeftArm.addChild(hand_claw_1_L_1);
		PixelmonModelRenderer hand_claw_2_L_1 = new PixelmonModelRenderer(this,
				0, 24);
		hand_claw_2_L_1.addBox(0.06666667F, 5.333333F, 1.066667F, 2, 3, 1);
		hand_claw_2_L_1.setTextureSize(128, 64);
		hand_claw_2_L_1.mirror = true;
		setRotation(hand_claw_2_L_1, -0.1745329F, 0.6283185F, -0.6283185F);
		LeftArm.addChild(hand_claw_2_L_1);
		PixelmonModelRenderer hand_claw_1_L_1_2 = new PixelmonModelRenderer(
				this, 0, 25);
		hand_claw_1_L_1_2.addBox(0.9333333F, 7F, 2F, 1, 2, 1);
		hand_claw_1_L_1_2.setTextureSize(128, 64);
		hand_claw_1_L_1_2.mirror = true;
		setRotation(hand_claw_1_L_1_2, -0.1745329F, 1.256637F, -0.6108652F);
		LeftArm.addChild(hand_claw_1_L_1_2);
		PixelmonModelRenderer hand_claw_2_L_1_2 = new PixelmonModelRenderer(
				this, 0, 25);
		hand_claw_2_L_1_2.addBox(2.8F, 7.6F, 0.9333333F, 1, 2, 1);
		hand_claw_2_L_1_2.setTextureSize(128, 64);
		hand_claw_2_L_1_2.mirror = true;
		setRotation(hand_claw_2_L_1_2, -0.1745329F, 0.6283185F, -0.4014257F);
		LeftArm.addChild(hand_claw_2_L_1_2);
		Body.addChild(LeftArm);

		PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this,
				"Right Arm");
		RightArm.setRotationPoint(-3, 4, -1.2F);
		PixelmonModelRenderer arm_R = new PixelmonModelRenderer(this, 0, 19);
		arm_R.addBox(-1.266667F, 0F, -0.3333333F, 2, 2, 2);
		arm_R.setTextureSize(128, 64);
		arm_R.mirror = true;
		setRotation(arm_R, -0.1745329F, -0.3665191F, 0.7504916F);
		RightArm.addChild(arm_R);
		PixelmonModelRenderer hand_R = new PixelmonModelRenderer(this, 9, 18);
		hand_R.addBox(-1.066667F, 1.266667F, -0.3333333F, 2, 5, 4);
		hand_R.setTextureSize(128, 64);
		hand_R.mirror = true;
		setRotation(hand_R, -0.1745329F, -0.8203047F, 0.6283185F);
		RightArm.addChild(hand_R);
		PixelmonModelRenderer hand_claw_1_R_1 = new PixelmonModelRenderer(this,
				0, 24);
		hand_claw_1_R_1.addBox(-1.6F, 4.333333F, 1.8F, 2, 3, 1);
		hand_claw_1_R_1.setTextureSize(128, 64);
		hand_claw_1_R_1.mirror = true;
		setRotation(hand_claw_1_R_1, -0.1745329F, -1.256637F, 0.6283185F);
		RightArm.addChild(hand_claw_1_R_1);
		PixelmonModelRenderer hand_claw_2_R_1 = new PixelmonModelRenderer(this,
				0, 24);
		hand_claw_2_R_1.addBox(-1.933333F, 5.333333F, 1.066667F, 2, 3, 1);
		hand_claw_2_R_1.setTextureSize(128, 64);
		hand_claw_2_R_1.mirror = true;
		setRotation(hand_claw_2_R_1, -0.1745329F, -0.6283185F, 0.6283185F);
		RightArm.addChild(hand_claw_2_R_1);
		PixelmonModelRenderer hand_claw_1_R_1_2 = new PixelmonModelRenderer(
				this, 0, 25);
		hand_claw_1_R_1_2.addBox(-1.6F, 7.333333F, 1.8F, 1, 2, 1);
		hand_claw_1_R_1_2.setTextureSize(128, 64);
		hand_claw_1_R_1_2.mirror = true;
		setRotation(hand_claw_1_R_1_2, -0.1745329F, -1.256637F, 0.6108652F);
		RightArm.addChild(hand_claw_1_R_1_2);
		PixelmonModelRenderer hand_claw_2_R_1_2 = new PixelmonModelRenderer(
				this, 0, 25);
		hand_claw_2_R_1_2.addBox(-3.6F, 7.6F, 0.9333333F, 1, 2, 1);
		hand_claw_2_R_1_2.setTextureSize(128, 64);
		hand_claw_2_R_1_2.mirror = true;
		setRotation(hand_claw_2_R_1_2, -0.1745329F, -0.6283185F, 0.4014257F);
		RightArm.addChild(hand_claw_2_R_1_2);
		Body.addChild(RightArm);

		PixelmonModelRenderer back_spike_1 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_1.addBox(-1F, 1F, 0F, 2, 2, 8);
		back_spike_1.setRotationPoint(0F, 1F, 3F);
		back_spike_1.setTextureSize(128, 64);
		back_spike_1.mirror = true;
		setRotation(back_spike_1, 0.2792527F, 0F, 0F);
		Body.addChild(back_spike_1);
		PixelmonModelRenderer back_spike_2 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_2.addBox(0F, 1F, 0F, 2, 2, 8);
		back_spike_2.setRotationPoint(0F, 1F, 3F);
		back_spike_2.setTextureSize(128, 64);
		back_spike_2.mirror = true;
		setRotation(back_spike_2, 0.1919862F, 0.2792527F, 0F);
		Body.addChild(back_spike_2);
		PixelmonModelRenderer back_spike_3 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_3.addBox(-2F, 1F, 0F, 2, 2, 8);
		back_spike_3.setRotationPoint(0F, 1F, 3F);
		back_spike_3.setTextureSize(128, 64);
		back_spike_3.mirror = true;
		setRotation(back_spike_3, 0.1919862F, -0.2792527F, 0F);
		Body.addChild(back_spike_3);
		PixelmonModelRenderer back_spike_4 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_4.addBox(-1F, -0.5333334F, -1F, 2, 2, 8);
		back_spike_4.setRotationPoint(0F, 1F, 3F);
		back_spike_4.setTextureSize(128, 64);
		back_spike_4.mirror = true;
		setRotation(back_spike_4, 0.3839724F, 0F, 0F);
		Body.addChild(back_spike_4);
		PixelmonModelRenderer back_spike_5 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_5.addBox(-1F, -1.533333F, -1F, 2, 2, 8);
		back_spike_5.setRotationPoint(0F, 1F, 3F);
		back_spike_5.setTextureSize(128, 64);
		back_spike_5.mirror = true;
		setRotation(back_spike_5, 0.715585F, 0F, 0F);
		Body.addChild(back_spike_5);
		PixelmonModelRenderer back_spike_6 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_6.addBox(-1F, -3.533333F, -2F, 2, 2, 8);
		back_spike_6.setRotationPoint(0F, 1F, 3F);
		back_spike_6.setTextureSize(128, 64);
		back_spike_6.mirror = true;
		setRotation(back_spike_6, 0.8552113F, 0F, 0F);
		Body.addChild(back_spike_6);
		PixelmonModelRenderer back_spike_7 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_7.addBox(-1F, -5.533333F, -3F, 2, 2, 8);
		back_spike_7.setRotationPoint(0F, 1F, 3F);
		back_spike_7.setTextureSize(128, 64);
		back_spike_7.mirror = true;
		setRotation(back_spike_7, 0.8901179F, 0F, 0F);
		Body.addChild(back_spike_7);
		PixelmonModelRenderer back_spike_8 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_8.addBox(-1F, -7.533333F, -3F, 2, 2, 8);
		back_spike_8.setRotationPoint(0F, 1F, 3F);
		back_spike_8.setTextureSize(128, 64);
		back_spike_8.mirror = true;
		setRotation(back_spike_8, 1.082104F, 0F, 0F);
		Body.addChild(back_spike_8);
		PixelmonModelRenderer back_spike_9 = new PixelmonModelRenderer(this, 0,
				0);
		back_spike_9.addBox(1.266667F, 1F, 0F, 2, 2, 8);
		back_spike_9.setRotationPoint(0F, 1F, 3F);
		back_spike_9.setTextureSize(128, 64);
		back_spike_9.mirror = true;
		setRotation(back_spike_9, -0.0523599F, 0.4886922F, 0F);
		Body.addChild(back_spike_9);
		PixelmonModelRenderer back_spike_10 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_10.addBox(-3F, 1F, 0F, 2, 2, 8);
		back_spike_10.setRotationPoint(0F, 1F, 3F);
		back_spike_10.setTextureSize(128, 64);
		back_spike_10.mirror = true;
		setRotation(back_spike_10, -0.0523599F, -0.4886922F, 0F);
		Body.addChild(back_spike_10);
		PixelmonModelRenderer back_spike_11 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_11.addBox(0F, -0.3333333F, 0F, 2, 2, 8);
		back_spike_11.setRotationPoint(0F, 1F, 3F);
		back_spike_11.setTextureSize(128, 64);
		back_spike_11.mirror = true;
		setRotation(back_spike_11, 0.4014257F, 0.2792527F, 0.1396263F);
		Body.addChild(back_spike_11);
		PixelmonModelRenderer back_spike_12 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_12.addBox(0F, -1.666667F, -1F, 2, 2, 8);
		back_spike_12.setRotationPoint(0F, 1F, 3F);
		back_spike_12.setTextureSize(128, 64);
		back_spike_12.mirror = true;
		setRotation(back_spike_12, 0.6283185F, 0.2792527F, 0.2443461F);
		Body.addChild(back_spike_12);
		PixelmonModelRenderer back_spike_13 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_13.addBox(0F, -3.666667F, -2F, 2, 2, 8);
		back_spike_13.setRotationPoint(0F, 1F, 3F);
		back_spike_13.setTextureSize(128, 64);
		back_spike_13.mirror = true;
		setRotation(back_spike_13, 0.7853982F, 0.2792527F, 0.296706F);
		Body.addChild(back_spike_13);
		PixelmonModelRenderer back_spike_14 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_14.addBox(0F, -5.666667F, -3F, 2, 2, 8);
		back_spike_14.setRotationPoint(0F, 1F, 3F);
		back_spike_14.setTextureSize(128, 64);
		back_spike_14.mirror = true;
		setRotation(back_spike_14, 0.9250245F, 0.2792527F, 0.3665191F);
		Body.addChild(back_spike_14);
		PixelmonModelRenderer back_spike_15 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_15.addBox(1.8F, -0.3333333F, -1F, 2, 2, 8);
		back_spike_15.setRotationPoint(0F, 1F, 3F);
		back_spike_15.setTextureSize(128, 64);
		back_spike_15.mirror = true;
		setRotation(back_spike_15, 0.1919862F, 0.4886922F, 0F);
		Body.addChild(back_spike_15);
		PixelmonModelRenderer back_spike_16 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_16.addBox(2.533333F, -1.333333F, -2F, 2, 2, 8);
		back_spike_16.setRotationPoint(0F, 1F, 3F);
		back_spike_16.setTextureSize(128, 64);
		back_spike_16.mirror = true;
		setRotation(back_spike_16, 0.5061455F, 0.4886922F, 0F);
		Body.addChild(back_spike_16);
		PixelmonModelRenderer back_spike_17 = new PixelmonModelRenderer(this,
				22, 14);
		back_spike_17.addBox(3.266667F, -0.6666667F, -1F, 2, 2, 5);
		back_spike_17.setRotationPoint(0F, 1F, 3F);
		back_spike_17.setTextureSize(128, 64);
		back_spike_17.mirror = true;
		setRotation(back_spike_17, 0.0698132F, 1.029744F, 0.0349066F);
		Body.addChild(back_spike_17);
		PixelmonModelRenderer back_spike_18 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_18.addBox(3.2F, -2.666667F, -3F, 2, 2, 8);
		back_spike_18.setRotationPoint(0F, 1F, 3F);
		back_spike_18.setTextureSize(128, 64);
		back_spike_18.mirror = true;
		setRotation(back_spike_18, 0.715585F, 0.715585F, 0F);
		Body.addChild(back_spike_18);
		PixelmonModelRenderer back_spike_19 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_19.addBox(-2F, -0.3333333F, 0F, 2, 2, 8);
		back_spike_19.setRotationPoint(0F, 1F, 3F);
		back_spike_19.setTextureSize(128, 64);
		back_spike_19.mirror = true;
		setRotation(back_spike_19, 0.4014257F, -0.2792527F, -0.1396263F);
		Body.addChild(back_spike_19);
		PixelmonModelRenderer back_spike_20 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_20.addBox(-2F, -1.666667F, -1F, 2, 2, 8);
		back_spike_20.setRotationPoint(0F, 1F, 3F);
		back_spike_20.setTextureSize(128, 64);
		back_spike_20.mirror = true;
		setRotation(back_spike_20, 0.6283185F, -0.2792527F, -0.2443461F);
		Body.addChild(back_spike_20);
		PixelmonModelRenderer back_spike_21 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_21.addBox(-2F, -3.666667F, -2F, 2, 2, 8);
		back_spike_21.setRotationPoint(0F, 1F, 3F);
		back_spike_21.setTextureSize(128, 64);
		back_spike_21.mirror = true;
		setRotation(back_spike_21, 0.7853982F, -0.2792527F, -0.296706F);
		Body.addChild(back_spike_21);
		PixelmonModelRenderer back_spike_22 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_22.addBox(-2F, -5.666667F, -3F, 2, 2, 8);
		back_spike_22.setRotationPoint(0F, 1F, 3F);
		back_spike_22.setTextureSize(128, 64);
		back_spike_22.mirror = true;
		setRotation(back_spike_22, 0.9250245F, -0.2792527F, -0.3665191F);
		Body.addChild(back_spike_22);
		PixelmonModelRenderer back_spike_23 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_23.addBox(-3.2F, -0.3333333F, -1F, 2, 2, 8);
		back_spike_23.setRotationPoint(0F, 1F, 3F);
		back_spike_23.setTextureSize(128, 64);
		back_spike_23.mirror = true;
		setRotation(back_spike_23, 0.1919862F, -0.4886922F, 0F);
		Body.addChild(back_spike_23);
		PixelmonModelRenderer back_spike_24 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_24.addBox(-4.466667F, -1.333333F, -2F, 2, 2, 8);
		back_spike_24.setRotationPoint(0F, 1F, 3F);
		back_spike_24.setTextureSize(128, 64);
		back_spike_24.mirror = true;
		setRotation(back_spike_24, 0.5061455F, -0.4886922F, 0F);
		Body.addChild(back_spike_24);
		PixelmonModelRenderer back_spike_25 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_25.addBox(-5.333333F, -2.666667F, -3F, 2, 2, 8);
		back_spike_25.setRotationPoint(0F, 1F, 3F);
		back_spike_25.setTextureSize(128, 64);
		back_spike_25.mirror = true;
		setRotation(back_spike_25, 0.715585F, -0.715585F, 0F);
		Body.addChild(back_spike_25);
		PixelmonModelRenderer back_spike_26 = new PixelmonModelRenderer(this,
				22, 14);
		back_spike_26.addBox(-5.733333F, -0.6666667F, -1F, 2, 2, 5);
		back_spike_26.setRotationPoint(0F, 1F, 3F);
		back_spike_26.setTextureSize(128, 64);
		back_spike_26.mirror = true;
		setRotation(back_spike_26, 0.0698132F, -1.029744F, -0.0349066F);
		Body.addChild(back_spike_26);
		PixelmonModelRenderer back_spike_1_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_1_2.addBox(-0.5F, 1F, 1F, 1, 1, 8);
		back_spike_1_2.setRotationPoint(0F, 1F, 3F);
		back_spike_1_2.setTextureSize(128, 64);
		back_spike_1_2.mirror = true;
		setRotation(back_spike_1_2, 0.2443461F, 0F, 0F);
		Body.addChild(back_spike_1_2);
		PixelmonModelRenderer back_spike_2_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_2_2.addBox(0.5F, 1F, 1F, 1, 1, 8);
		back_spike_2_2.setRotationPoint(0F, 1F, 3F);
		back_spike_2_2.setTextureSize(128, 64);
		back_spike_2_2.mirror = true;
		setRotation(back_spike_2_2, 0.1396263F, 0.2792527F, 0F);
		Body.addChild(back_spike_2_2);
		PixelmonModelRenderer back_spike_3_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_3_2.addBox(-1.6F, 1F, 1F, 1, 1, 8);
		back_spike_3_2.setRotationPoint(0F, 1F, 3F);
		back_spike_3_2.setTextureSize(128, 64);
		back_spike_3_2.mirror = true;
		setRotation(back_spike_3_2, 0.1570796F, -0.2792527F, 0F);
		Body.addChild(back_spike_3_2);
		PixelmonModelRenderer back_spike_4_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_4_2.addBox(-0.5F, -0.5333334F, 0F, 1, 1, 8);
		back_spike_4_2.setRotationPoint(0F, 1F, 3F);
		back_spike_4_2.setTextureSize(128, 64);
		back_spike_4_2.mirror = true;
		setRotation(back_spike_4_2, 0.3141593F, 0F, 0F);
		Body.addChild(back_spike_4_2);
		PixelmonModelRenderer back_spike_5_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_5_2.addBox(-0.5F, -1.533333F, 0F, 1, 1, 8);
		back_spike_5_2.setRotationPoint(0F, 1F, 3F);
		back_spike_5_2.setTextureSize(128, 64);
		back_spike_5_2.mirror = true;
		setRotation(back_spike_5_2, 0.6457718F, 0F, 0F);
		Body.addChild(back_spike_5_2);
		PixelmonModelRenderer back_spike_6_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_6_2.addBox(-0.5F, -3.533333F, -1F, 1, 1, 8);
		back_spike_6_2.setRotationPoint(0F, 1F, 3F);
		back_spike_6_2.setTextureSize(128, 64);
		back_spike_6_2.mirror = true;
		setRotation(back_spike_6_2, 0.7853982F, 0F, 0F);
		Body.addChild(back_spike_6_2);
		PixelmonModelRenderer back_spike_7_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_7_2.addBox(-0.5F, -5.533333F, -2.133333F, 1, 1, 8);
		back_spike_7_2.setRotationPoint(0F, 1F, 3F);
		back_spike_7_2.setTextureSize(128, 64);
		back_spike_7_2.mirror = true;
		setRotation(back_spike_7_2, 0.8028515F, 0F, 0F);
		Body.addChild(back_spike_7_2);
		PixelmonModelRenderer back_spike_8_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_8_2.addBox(-0.5F, -7.533333F, -3F, 1, 1, 8);
		back_spike_8_2.setRotationPoint(0F, 1F, 3F);
		back_spike_8_2.setTextureSize(128, 64);
		back_spike_8_2.mirror = true;
		setRotation(back_spike_8_2, 0.9424778F, 0F, 0F);
		Body.addChild(back_spike_8_2);
		PixelmonModelRenderer back_spike_9_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_9_2.addBox(1.8F, 1F, 1F, 1, 1, 8);
		back_spike_9_2.setRotationPoint(0F, 1F, 3F);
		back_spike_9_2.setTextureSize(128, 64);
		back_spike_9_2.mirror = true;
		setRotation(back_spike_9_2, -0.1047198F, 0.4886922F, 0F);
		Body.addChild(back_spike_9_2);
		PixelmonModelRenderer back_spike_10_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_10_2.addBox(-2.733333F, 1F, 1F, 1, 1, 8);
		back_spike_10_2.setRotationPoint(0F, 1F, 3F);
		back_spike_10_2.setTextureSize(128, 64);
		back_spike_10_2.mirror = true;
		setRotation(back_spike_10_2, -0.0872665F, -0.4886922F, 0F);
		Body.addChild(back_spike_10_2);
		PixelmonModelRenderer back_spike_11_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_11_2.addBox(0.5F, -0.3333333F, 1F, 1, 1, 8);
		back_spike_11_2.setRotationPoint(0F, 1F, 3F);
		back_spike_11_2.setTextureSize(128, 64);
		back_spike_11_2.mirror = true;
		setRotation(back_spike_11_2, 0.3490659F, 0.2792527F, 0.1396263F);
		Body.addChild(back_spike_11_2);
		PixelmonModelRenderer back_spike_12_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_12_2.addBox(0.5F, -1.666667F, 0F, 1, 1, 8);
		back_spike_12_2.setRotationPoint(0F, 1F, 3F);
		back_spike_12_2.setTextureSize(128, 64);
		back_spike_12_2.mirror = true;
		setRotation(back_spike_12_2, 0.5759587F, 0.2792527F, 0.2443461F);
		Body.addChild(back_spike_12_2);
		PixelmonModelRenderer back_spike_13_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_13_2.addBox(0.5F, -3.666667F, -1F, 1, 1, 8);
		back_spike_13_2.setRotationPoint(0F, 1F, 3F);
		back_spike_13_2.setTextureSize(128, 64);
		back_spike_13_2.mirror = true;
		setRotation(back_spike_13_2, 0.6981317F, 0.2792527F, 0.296706F);
		Body.addChild(back_spike_13_2);
		PixelmonModelRenderer back_spike_14_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_14_2.addBox(0.5F, -5.666667F, -2F, 1, 1, 8);
		back_spike_14_2.setRotationPoint(0F, 1F, 3F);
		back_spike_14_2.setTextureSize(128, 64);
		back_spike_14_2.mirror = true;
		setRotation(back_spike_14_2, 0.8028515F, 0.2792527F, 0.3665191F);
		Body.addChild(back_spike_14_2);
		PixelmonModelRenderer back_spike_15_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_15_2.addBox(2.133333F, -0.3333333F, 0F, 1, 1, 8);
		back_spike_15_2.setRotationPoint(0F, 1F, 3F);
		back_spike_15_2.setTextureSize(128, 64);
		back_spike_15_2.mirror = true;
		setRotation(back_spike_15_2, 0.1396263F, 0.4886922F, 0F);
		Body.addChild(back_spike_15_2);
		PixelmonModelRenderer back_spike_16_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_16_2.addBox(3F, -1.333333F, -1F, 1, 1, 8);
		back_spike_16_2.setRotationPoint(0F, 1F, 3F);
		back_spike_16_2.setTextureSize(128, 64);
		back_spike_16_2.mirror = true;
		setRotation(back_spike_16_2, 0.4537856F, 0.4886922F, 0F);
		Body.addChild(back_spike_16_2);
		PixelmonModelRenderer back_spike_17_2 = new PixelmonModelRenderer(this,
				22, 14);
		back_spike_17_2.addBox(3.733333F, -0.6666667F, 0F, 1, 1, 5);
		back_spike_17_2.setRotationPoint(0F, 1F, 3F);
		back_spike_17_2.setTextureSize(128, 64);
		back_spike_17_2.mirror = true;
		setRotation(back_spike_17_2, 0F, 1.029744F, 0.0349066F);
		Body.addChild(back_spike_17_2);
		PixelmonModelRenderer back_spike_18_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_18_2.addBox(3.733333F, -2.666667F, -2F, 1, 1, 8);
		back_spike_18_2.setRotationPoint(0F, 1F, 3F);
		back_spike_18_2.setTextureSize(128, 64);
		back_spike_18_2.mirror = true;
		setRotation(back_spike_18_2, 0.6457718F, 0.715585F, 0F);
		Body.addChild(back_spike_18_2);
		PixelmonModelRenderer back_spike_19_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_19_2.addBox(-1.466667F, -0.3333333F, 1F, 1, 1, 8);
		back_spike_19_2.setRotationPoint(0F, 1F, 3F);
		back_spike_19_2.setTextureSize(128, 64);
		back_spike_19_2.mirror = true;
		setRotation(back_spike_19_2, 0.3665191F, -0.2792527F, -0.1396263F);
		Body.addChild(back_spike_19_2);
		PixelmonModelRenderer back_spike_20_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_20_2.addBox(-1.466667F, -1.666667F, 0F, 1, 1, 8);
		back_spike_20_2.setRotationPoint(0F, 1F, 3F);
		back_spike_20_2.setTextureSize(128, 64);
		back_spike_20_2.mirror = true;
		setRotation(back_spike_20_2, 0.5934119F, -0.2792527F, -0.2443461F);
		Body.addChild(back_spike_20_2);
		PixelmonModelRenderer back_spike_21_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_21_2.addBox(-1.333333F, -3.666667F, -1F, 1, 1, 8);
		back_spike_21_2.setRotationPoint(0F, 1F, 3F);
		back_spike_21_2.setTextureSize(128, 64);
		back_spike_21_2.mirror = true;
		setRotation(back_spike_21_2, 0.7330383F, -0.2792527F, -0.296706F);
		Body.addChild(back_spike_21_2);
		PixelmonModelRenderer back_spike_22_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_22_2.addBox(-1.266667F, -5.666667F, -2F, 1, 1, 8);
		back_spike_22_2.setRotationPoint(0F, 1F, 3F);
		back_spike_22_2.setTextureSize(128, 64);
		back_spike_22_2.mirror = true;
		setRotation(back_spike_22_2, 0.8552113F, -0.2792527F, -0.3665191F);
		Body.addChild(back_spike_22_2);
		PixelmonModelRenderer back_spike_23_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_23_2.addBox(-2.666667F, -0.3333333F, 0F, 1, 1, 8);
		back_spike_23_2.setRotationPoint(0F, 1F, 3F);
		back_spike_23_2.setTextureSize(128, 64);
		back_spike_23_2.mirror = true;
		setRotation(back_spike_23_2, 0.1396263F, -0.4886922F, 0F);
		Body.addChild(back_spike_23_2);
		PixelmonModelRenderer back_spike_24_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_24_2.addBox(-4.066667F, -1.333333F, -1F, 1, 1, 8);
		back_spike_24_2.setRotationPoint(0F, 1F, 3F);
		back_spike_24_2.setTextureSize(128, 64);
		back_spike_24_2.mirror = true;
		setRotation(back_spike_24_2, 0.4712389F, -0.4886922F, 0F);
		Body.addChild(back_spike_24_2);
		PixelmonModelRenderer back_spike_25_2 = new PixelmonModelRenderer(this,
				0, 0);
		back_spike_25_2.addBox(-5.066667F, -2.666667F, -2F, 1, 1, 8);
		back_spike_25_2.setRotationPoint(0F, 1F, 3F);
		back_spike_25_2.setTextureSize(128, 64);
		back_spike_25_2.mirror = true;
		setRotation(back_spike_25_2, 0.6632251F, -0.715585F, 0F);
		Body.addChild(back_spike_25_2);
		PixelmonModelRenderer back_spike_26_2 = new PixelmonModelRenderer(this,
				22, 14);
		back_spike_26_2.addBox(-5.4F, -0.6666667F, 0F, 1, 1, 5);
		back_spike_26_2.setRotationPoint(0F, 1F, 3F);
		back_spike_26_2.setTextureSize(128, 64);
		back_spike_26_2.mirror = true;
		setRotation(back_spike_26_2, 0.0174533F, -1.029744F, -0.0349066F);
		Body.addChild(back_spike_26_2);

		ModuleHead headModule = new ModuleHead(Head);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left, 0, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right, 0, 0, 0);

		float legspeed = 0.65F;
		float legRotationLimit = 1.4F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleTailBasic tailModule = new ModuleTailBasic(Tail, .1F, .05F, legspeed);

		skeleton = new SkeletonBiped(Body, headModule, leftArmModule,
				rightArmModule, leftLegModule, rightLegModule, tailModule);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Body.render(f5);

	}

	private void setRotation(PixelmonModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
