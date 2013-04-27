// Date: 2/10/2013 10:05:39 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.animations.EnumArm;
import pixelmon.client.models.animations.EnumLeg;
import pixelmon.client.models.animations.EnumPhase;
import pixelmon.client.models.animations.ModuleArm;
import pixelmon.client.models.animations.ModuleLeg;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelClefairy extends PixelmonModelBase {
	// fields
	ModelRenderer Body;

	public ModelClefairy() {
		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this, "Body");
		Body.setRotationPoint(0, 14, -1);
		ModelRenderer body_1 = new ModelRenderer(this, 0, 48);
		body_1.addBox(-3.5F, -0.5F, -4F, 8, 8, 8);
		body_1.setTextureSize(128, 64);
		body_1.mirror = true;
		setRotation(body_1, -0.0349066F, 0F, 0F);
		Body.addChild(body_1);
		ModelRenderer body_2 = new ModelRenderer(this, 0, 25);
		body_2.addBox(-2.966667F, -0.8666667F, -2.666667F, 7, 2, 6);
		body_2.setTextureSize(128, 64);
		body_2.mirror = true;
		setRotation(body_2, -0.1047198F, 0F, 0F);
		Body.addChild(body_2);
		ModelRenderer body_3 = new ModelRenderer(this, 33, 54);
		body_3.addBox(-2.966667F, 5.6F, -3.533333F, 7, 3, 7);
		body_3.setTextureSize(128, 64);
		body_3.mirror = true;
		setRotation(body_3, 0.0349066F, 0F, 0F);
		Body.addChild(body_3);
		ModelRenderer body_4 = new ModelRenderer(this, 0, 34);
		body_4.addBox(2.966667F, 1F, -3.533333F, 2, 6, 7);
		body_4.setTextureSize(128, 64);
		body_4.mirror = true;
		setRotation(body_4, -0.0349066F, 0F, 0F);
		Body.addChild(body_4);
		ModelRenderer body_5 = new ModelRenderer(this, 0, 34);
		body_5.addBox(-4.1F, 1F, -3.533333F, 2, 6, 7);
		body_5.setTextureSize(128, 64);
		body_5.mirror = true;
		setRotation(body_5, -0.0174533F, 0F, 0F);
		Body.addChild(body_5);
		ModelRenderer body_6 = new ModelRenderer(this, 0, 15);
		body_6.addBox(-2.9F, 0.4666667F, 2.733333F, 7, 7, 2);
		body_6.setTextureSize(128, 64);
		body_6.mirror = true;
		setRotation(body_6, 0F, 0F, 0F);
		Body.addChild(body_6);
		ModelRenderer hair_curl = new ModelRenderer(this, 101, 59);
		hair_curl.addBox(-2F, -2F, -4.5F, 4, 4, 1);
		hair_curl.setTextureSize(128, 64);
		hair_curl.mirror = true;
		setRotation(hair_curl, -0.3665191F, -0.1570796F, 0.296706F);
		Body.addChild(hair_curl);
		ModelRenderer L_ear_1 = new ModelRenderer(this, 54, 0);
		L_ear_1.addBox(0F, -0.6F, -1.466667F, 4, 3, 4);
		L_ear_1.setRotationPoint(2F, -1, 0);
		L_ear_1.setTextureSize(128, 64);
		L_ear_1.mirror = true;
		setRotation(L_ear_1, 0.1396263F, 0F, 0.418879F);
		Body.addChild(L_ear_1);
		ModelRenderer L_ear_2 = new ModelRenderer(this, 56, 8);
		L_ear_2.addBox(0.4F, -1.933333F, -0.3333333F, 3, 3, 2);
		L_ear_2.setRotationPoint(2F, -1, 0);
		L_ear_2.setTextureSize(128, 64);
		L_ear_2.mirror = true;
		setRotation(L_ear_2, 0.0349066F, -0.0349066F, 0.7330383F);
		Body.addChild(L_ear_2);
		ModelRenderer L_ear_3 = new ModelRenderer(this, 28, 0);
		L_ear_3.addBox(-1F, -5.466667F, 0.5333334F, 7, 8, 0);
		L_ear_3.setRotationPoint(2F, -1, 0);
		L_ear_3.setTextureSize(128, 64);
		L_ear_3.mirror = true;
		setRotation(L_ear_3, 0.1396263F, 0F, 0.418879F);
		Body.addChild(L_ear_3);
		ModelRenderer R_ear_1 = new ModelRenderer(this, 54, 0);
		R_ear_1.addBox(-4F, -0.6F, -1.466667F, 4, 3, 4);
		R_ear_1.setRotationPoint(-1F, -1, 0);
		R_ear_1.setTextureSize(128, 64);
		R_ear_1.mirror = true;
		setRotation(R_ear_1, 0.122173F, 0F, -0.418879F);
		Body.addChild(R_ear_1);
		ModelRenderer R_ear_2 = new ModelRenderer(this, 56, 8);
		R_ear_2.addBox(-3.6F, -1.933333F, -0.3333333F, 3, 3, 2);
		R_ear_2.setRotationPoint(-1F, -1, -1F);
		R_ear_2.setTextureSize(128, 64);
		R_ear_2.mirror = true;
		setRotation(R_ear_2, 0.0349066F, 0.0349066F, -0.418879F);
		Body.addChild(R_ear_2);
		ModelRenderer R_ear_3 = new ModelRenderer(this, 35, 0);
		R_ear_3.addBox(-6F, -5.466667F, 0.5333334F, 7, 8, 0);
		R_ear_3.setRotationPoint(-1F, -1, 0);
		R_ear_3.setTextureSize(128, 64);
		R_ear_3.mirror = true;
		setRotation(R_ear_3, 0.1396263F, 0F, -0.418879F);
		Body.addChild(R_ear_3);
		ModelRenderer R_wing = new ModelRenderer(this, 114, 0);
		R_wing.addBox(-6.466667F, 0F, -1F, 7, 5, 0);
		R_wing.setRotationPoint(0.5F, 2, 5);
		R_wing.setTextureSize(128, 64);
		R_wing.mirror = true;
		setRotation(R_wing, 0F, 0.6457718F, 0.3141593F);
		Body.addChild(R_wing);
		ModelRenderer L_wing = new ModelRenderer(this, 107, 0);
		L_wing.addBox(-0.4666667F, 0F, -1F, 7, 5, 0);
		L_wing.setRotationPoint(0.5F, 2F, 5);
		L_wing.setTextureSize(128, 64);
		L_wing.mirror = true;
		setRotation(L_wing, 0F, -0.6457718F, -0.3141593F);
		Body.addChild(L_wing);

		ModelRenderer RightLeg = new ModelRenderer(this, "Right Leg");
		RightLeg.setRotationPoint(-3, 8, 1);
		ModelRenderer R_leg_1 = new ModelRenderer(this, 32, 32);
		R_leg_1.addBox(-1.133333F, -2.733333F, -3.4F, 3, 4, 5);
		R_leg_1.setTextureSize(128, 64);
		R_leg_1.mirror = true;
		setRotation(R_leg_1, 0F, 0F, -0.0698132F);
		RightLeg.addChild(R_leg_1);
		ModelRenderer R_leg_2 = new ModelRenderer(this, 32, 42);
		R_leg_2.addBox(-1.4F, -1.333333F, -2.333333F, 1, 2, 3);
		R_leg_2.setTextureSize(128, 64);
		R_leg_2.mirror = true;
		setRotation(R_leg_2, 0F, 0F, -0.1396263F);
		RightLeg.addChild(R_leg_2);
		ModelRenderer R_leg_3 = new ModelRenderer(this, 42, 42);
		R_leg_3.addBox(-0.4666667F, -0.7333333F, -2.5F, 2, 3, 3);
		R_leg_3.setTextureSize(128, 64);
		R_leg_3.mirror = true;
		setRotation(R_leg_3, 0F, 0F, 0F);
		RightLeg.addChild(R_leg_3);
		ModelRenderer R_claw = new ModelRenderer(this, 0, 0);
		R_claw.addBox(-0.1333333F, 1.1F, -3.133333F, 1, 1, 1);
		R_claw.setTextureSize(128, 64);
		R_claw.mirror = true;
		setRotation(R_claw, 0.1396263F, 0F, 0F);
		RightLeg.addChild(R_claw);
		Body.addChild(RightLeg);

		ModelRenderer LeftLeg = new ModelRenderer(this, "Left Leg");
		LeftLeg.setRotationPoint(4, 8, 1);
		ModelRenderer L_leg_1 = new ModelRenderer(this, 32, 32);
		L_leg_1.addBox(-1.5F, -2.733333F, -3.4F, 3, 4, 5);
		L_leg_1.setTextureSize(128, 64);
		L_leg_1.mirror = true;
		setRotation(L_leg_1, 0F, 0F, 0.0698132F);
		LeftLeg.addChild(L_leg_1);
		ModelRenderer L_leg_2 = new ModelRenderer(this, 32, 42);
		L_leg_2.addBox(0.8F, -1.333333F, -2.333333F, 1, 2, 3);
		L_leg_2.setTextureSize(128, 64);
		L_leg_2.mirror = true;
		setRotation(L_leg_2, 0F, 0F, 0.1396263F);
		LeftLeg.addChild(L_leg_2);
		ModelRenderer L_leg_3 = new ModelRenderer(this, 42, 42);
		L_leg_3.addBox(-0.9333333F, -0.7333333F, -2.466667F, 2, 3, 3);
		L_leg_3.setTextureSize(128, 64);
		L_leg_3.mirror = true;
		setRotation(L_leg_3, 0F, 0F, 0F);
		LeftLeg.addChild(L_leg_3);
		ModelRenderer L_claw = new ModelRenderer(this, 0, 0);
		L_claw.addBox(-0.2666667F, 1.1F, -3.1F, 1, 1, 1);
		L_claw.setTextureSize(128, 64);
		L_claw.mirror = true;
		setRotation(L_claw, 0.1396263F, 0F, 0F);
		LeftLeg.addChild(L_claw);
		Body.addChild(LeftLeg);

		ModelRenderer Tail = new ModelRenderer(this, "Tail");
		Tail.setRotationPoint(0, 6, 5);
		ModelRenderer tail = new ModelRenderer(this, 112, 52);
		tail.addBox(-0.5F, -3F, -1F, 2, 6, 6);
		tail.setTextureSize(128, 64);
		tail.mirror = true;
		setRotation(tail, -0.2268928F, 0F, 0F);
		Tail.addChild(tail);
		Body.addChild(Tail);

		ModelRenderer LeftArm = new ModelRenderer(this, "Left Arm");
		LeftArm.setRotationPoint(5, 4, -1);
		ModelRenderer L_arm_1 = new ModelRenderer(this, 32, 22);
		L_arm_1.addBox(-1F, -0.5333334F, -2F, 3, 3, 3);
		L_arm_1.setTextureSize(128, 64);
		L_arm_1.mirror = true;
		setRotation(L_arm_1, 0.2268928F, 0F, 0.4363323F);
		LeftArm.addChild(L_arm_1);
		ModelRenderer L_arm_2 = new ModelRenderer(this, 45, 22);
		L_arm_2.addBox(0.9333333F, -0.6666667F, -1.6F, 2, 2, 2);
		L_arm_2.setTextureSize(128, 64);
		L_arm_2.mirror = true;
		setRotation(L_arm_2, 0.2094395F, 0F, 0.7504916F);
		LeftArm.addChild(L_arm_2);
		ModelRenderer L_finger_1 = new ModelRenderer(this, 0, 62);
		L_finger_1.addBox(2.6F, -0.4F, -1.2F, 1, 1, 1);
		L_finger_1.setTextureSize(128, 64);
		L_finger_1.mirror = true;
		setRotation(L_finger_1, 0.7330383F, 0.1570796F, 0.7504916F);
		LeftArm.addChild(L_finger_1);
		ModelRenderer L_finger_2 = new ModelRenderer(this, 0, 0);
		L_finger_2.addBox(2.6F, -0.4F, -1.2F, 1, 1, 1);
		L_finger_2.setTextureSize(128, 64);
		L_finger_2.mirror = true;
		setRotation(L_finger_2, 0.7330383F, -0.2094395F, 0.5759587F);
		LeftArm.addChild(L_finger_2);
		Body.addChild(LeftArm);

		ModelRenderer RightArm = new ModelRenderer(this, "Right Arm");
		RightArm.setRotationPoint(-4, 4, -1);
		ModelRenderer R_arm_1 = new ModelRenderer(this, 32, 22);
		R_arm_1.addBox(-2F, -0.5333334F, -2F, 3, 3, 3);
		R_arm_1.setTextureSize(128, 64);
		R_arm_1.mirror = true;
		setRotation(R_arm_1, 0.2268928F, 0F, -0.4363323F);
		RightArm.addChild(R_arm_1);
		ModelRenderer R_arm_2 = new ModelRenderer(this, 45, 22);
		R_arm_2.addBox(-3.066667F, -0.6666667F, -1.6F, 2, 2, 2);
		R_arm_2.setTextureSize(128, 64);
		R_arm_2.mirror = true;
		setRotation(R_arm_2, 0.2094395F, 0F, -0.6457718F);
		RightArm.addChild(R_arm_2);
		ModelRenderer R_finger_1 = new ModelRenderer(this, 0, 62);
		R_finger_1.addBox(-3.866667F, -0.4F, -1.2F, 1, 1, 1);
		R_finger_1.setTextureSize(128, 64);
		R_finger_1.mirror = true;
		setRotation(R_finger_1, 0.7330383F, -0.1570796F, -0.7504916F);
		RightArm.addChild(R_finger_1);
		ModelRenderer R_finger_2 = new ModelRenderer(this, 0, 0);
		R_finger_2.addBox(-3.8F, -0.4F, -1.2F, 1, 1, 1);
		R_finger_2.setTextureSize(128, 64);
		R_finger_2.mirror = true;
		setRotation(R_finger_2, 0.7330383F, 0.2094395F, -0.5759587F);
		RightArm.addChild(R_finger_2);
		Body.addChild(RightArm);

		ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left, 0, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right, 0, 0, 0);

		float legspeed = 0.65F;
		float legRotationLimit = 1.4F;

		ModuleLeg leftLegModule = new ModuleLeg(LeftLeg, EnumLeg.FrontLeft,
				EnumPhase.InPhase, legRotationLimit, legspeed);
		ModuleLeg rightLegModule = new ModuleLeg(RightLeg, EnumLeg.FrontRight,
				EnumPhase.InPhase, legRotationLimit, legspeed);

		skeleton = new SkeletonBiped(Body, null, leftArmModule, rightArmModule,
				leftLegModule, rightLegModule, null);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
