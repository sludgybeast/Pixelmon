// Date: 4/18/2013 12:45:47 AM
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
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelSeel extends PixelmonModelBase
{
  //fields
    
    
    PixelmonModelRenderer Body;
  
  public ModelSeel()
  {
    textureWidth = 128;
    textureHeight = 64;
    
    
      Body = new PixelmonModelRenderer(this, "Body");
      Body.setRotationPoint(0, 21.9F, -1.8F);
      PixelmonModelRenderer Middle_Body_Middle = new PixelmonModelRenderer(this, 0, 0);
      Middle_Body_Middle.addBox(-2F, -3F, -4F, 4, 6, 8);
      Middle_Body_Middle.setRotationPoint(0F, -0.9F, 1.8F);
      Middle_Body_Middle.setTextureSize(128, 64);
      Middle_Body_Middle.mirror = true;
      setRotation(Middle_Body_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer Middle_Body_Left = new PixelmonModelRenderer(this, 24, 0);
      Middle_Body_Left.addBox(0F, -2F, -3F, 1, 4, 7);
      Middle_Body_Left.setRotationPoint(2F, -0.9F, 1.8F);
      Middle_Body_Left.setTextureSize(128, 64);
      Middle_Body_Left.mirror = true;
      setRotation(Middle_Body_Left, 0F, 0F, 0F);
      PixelmonModelRenderer  Middle_Body_Right = new PixelmonModelRenderer(this, 24, 0);
      Middle_Body_Right.addBox(-1F, -2F, -3F, 1, 4, 7);
      Middle_Body_Right.setRotationPoint(-2F, -0.9F, 1.8F);
      Middle_Body_Right.setTextureSize(128, 64);
      Middle_Body_Right.mirror = true;
      setRotation(Middle_Body_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Front_Body_Middle = new PixelmonModelRenderer(this, 0, 14);
      Front_Body_Middle.addBox(-2F, -3F, -6F, 4, 6, 6);
      Front_Body_Middle.setTextureSize(128, 64);
      Front_Body_Middle.mirror = true;
      setRotation(Front_Body_Middle, -0.7853982F, 0F, 0F);
      PixelmonModelRenderer Front_Body_Left = new PixelmonModelRenderer(this, 24, 11);
      Front_Body_Left.addBox(0F, -2F, -6F, 1, 4, 6);
      Front_Body_Left.setRotationPoint(2F, 0F, 0F);
      Front_Body_Left.setTextureSize(128, 64);
      Front_Body_Left.mirror = true;
      setRotation(Front_Body_Left, -0.7853982F, 0F, 0F);
      PixelmonModelRenderer Front_Body_Right = new PixelmonModelRenderer(this, 24, 11);
      Front_Body_Right.addBox(-1F, -2F, -6F, 1, 4, 6);
      Front_Body_Right.setRotationPoint(-2F, 0F, 0F);
      Front_Body_Right.setTextureSize(128, 64);
      Front_Body_Right.mirror = true;
      setRotation(Front_Body_Right, -0.7853982F, 0F, 0F);
      PixelmonModelRenderer Back_Body_Middle = new PixelmonModelRenderer(this, 40, 0);
      Back_Body_Middle.addBox(-1.5F, -2.5F, 0F, 3, 5, 4);
      Back_Body_Middle.setRotationPoint(0F, -0.9F, 5.8F);
      Back_Body_Middle.setTextureSize(128, 64);
      Back_Body_Middle.mirror = true;
      setRotation(Back_Body_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer Back_Body_Left = new PixelmonModelRenderer(this, 54, 0);
      Back_Body_Left.addBox(0F, -1.5F, 0F, 1, 3, 4);
      Back_Body_Left.setRotationPoint(1.5F, -0.9F, 5.8F);
      Back_Body_Left.setTextureSize(128, 64);
      Back_Body_Left.mirror = true;
      setRotation(Back_Body_Left, 0F, 0F, 0F);
      PixelmonModelRenderer Back_Body_Right = new PixelmonModelRenderer(this, 54, 0);
      Back_Body_Right.addBox(-1F, -1.5F, 0F, 1, 3, 4);
      Back_Body_Right.setRotationPoint(-1.5F, -0.9F, 5.8F);
      Back_Body_Right.setTextureSize(128, 64);
      Back_Body_Right.mirror = true;
      setRotation(Back_Body_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Tail_Middle = new PixelmonModelRenderer(this, 40, 9);
      Tail_Middle.addBox(-1F, -2F, 0F, 2, 4, 4);
      Tail_Middle.setRotationPoint(0F, -0.9F, 9.8F);
      Tail_Middle.setTextureSize(128, 64);
      Tail_Middle.mirror = true;
      setRotation(Tail_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer Tail_Left = new PixelmonModelRenderer(this, 54, 7);
      Tail_Left.addBox(0F, -1F, 0F, 1, 2, 4);
      Tail_Left.setRotationPoint(1F, -0.9F, 9.8F);
      Tail_Left.setTextureSize(128, 64);
      Tail_Left.mirror = true;
      setRotation(Tail_Left, 0F, 0F, 0F);
      PixelmonModelRenderer Tail_Right = new PixelmonModelRenderer(this, 54, 7);
      Tail_Right.addBox(-1F, -1F, 0F, 1, 2, 4);
      Tail_Right.setRotationPoint(-1F, -0.9F, 9.8F);
      Tail_Right.setTextureSize(128, 64);
      Tail_Right.mirror = true;
      setRotation(Tail_Right, 0F, 0F, 0F);
      PixelmonModelRenderer Tail_Tip = new PixelmonModelRenderer(this, 40, 17);
      Tail_Tip.addBox(-1F, -0.5F, 0F, 2, 1, 3);
      Tail_Tip.setRotationPoint(0F, -0.9F, 13.9F);
      Tail_Tip.setTextureSize(128, 64);
      Tail_Tip.mirror = true;
      setRotation(Tail_Tip, 0F, 0F, 0F);
      PixelmonModelRenderer Tail_Fin_Back_Left = new PixelmonModelRenderer(this, 40, 21);
      Tail_Fin_Back_Left.addBox(-4F, -0.5F, -0.5F, 4, 1, 1);
      Tail_Fin_Back_Left.setRotationPoint(-0.5F, -0.9F, 16.3F);
      Tail_Fin_Back_Left.setTextureSize(128, 64);
      Tail_Fin_Back_Left.mirror = true;
      setRotation(Tail_Fin_Back_Left, 0F, 0.5235988F, 0F);
      PixelmonModelRenderer Tail_Fin_Middle_Left = new PixelmonModelRenderer(this, 40, 21);
      Tail_Fin_Middle_Left.addBox(-4F, -0.5F, -0.5F, 4, 1, 1);
      Tail_Fin_Middle_Left.setRotationPoint(-0.5F, -0.9F, 15.3F);
      Tail_Fin_Middle_Left.setTextureSize(128, 64);
      Tail_Fin_Middle_Left.mirror = true;
      setRotation(Tail_Fin_Middle_Left, 0F, 0.3490659F, 0F);
      PixelmonModelRenderer Tail_Fin_Front_Left = new PixelmonModelRenderer(this, 40, 21);
      Tail_Fin_Front_Left.addBox(-4F, -0.5F, -0.5F, 4, 1, 1);
      Tail_Fin_Front_Left.setRotationPoint(-0.5F, -0.9F, 14.3F);
      Tail_Fin_Front_Left.setTextureSize(128, 64);
      Tail_Fin_Front_Left.mirror = true;
      setRotation(Tail_Fin_Front_Left, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer Tail_Fin_Back_Right = new PixelmonModelRenderer(this, 40, 21);
      Tail_Fin_Back_Right.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
      Tail_Fin_Back_Right.setRotationPoint(0.5F, -0.9F, 16.3F);
      Tail_Fin_Back_Right.setTextureSize(128, 64);
      Tail_Fin_Back_Right.mirror = true;
      setRotation(Tail_Fin_Back_Right, 0F, -0.5235988F, 0F);
      PixelmonModelRenderer Tail_Fin_Middle_Right = new PixelmonModelRenderer(this, 40, 21);
      Tail_Fin_Middle_Right.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
      Tail_Fin_Middle_Right.setRotationPoint(0.5F, -0.9F, 15.3F);
      Tail_Fin_Middle_Right.setTextureSize(128, 64);
      Tail_Fin_Middle_Right.mirror = true;
      setRotation(Tail_Fin_Middle_Right, 0F, -0.3490659F, 0F);
      PixelmonModelRenderer Tail_Fin_Front_Right = new PixelmonModelRenderer(this, 40, 21);
      Tail_Fin_Front_Right.addBox(0F, -0.5F, -0.5F, 4, 1, 1);
      Tail_Fin_Front_Right.setRotationPoint(0.5F, -0.9F, 14.3F);
      Tail_Fin_Front_Right.setTextureSize(128, 64);
      Tail_Fin_Front_Right.mirror = true;
      setRotation(Tail_Fin_Front_Right, 0F, -0.1745329F, 0F);
      Body.addChild(Middle_Body_Middle);
      Body.addChild(Middle_Body_Left);
      Body.addChild(Middle_Body_Right);
      Body.addChild(Front_Body_Middle);
      Body.addChild(Front_Body_Left);
      Body.addChild(Front_Body_Right);
      Body.addChild(Back_Body_Middle);
      Body.addChild(Back_Body_Left);
      Body.addChild(Back_Body_Right);
      Body.addChild(Tail_Middle);
      Body.addChild(Tail_Left);
      Body.addChild(Tail_Right);
      Body.addChild(Tail_Tip);
      Body.addChild(Tail_Fin_Back_Left);
      Body.addChild(Tail_Fin_Middle_Left);
      Body.addChild(Tail_Fin_Front_Left);
      Body.addChild(Tail_Fin_Back_Right);
      Body.addChild(Tail_Fin_Middle_Right);
      Body.addChild(Tail_Fin_Front_Right);
      
      
      PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
      Head.setRotationPoint(0, -3, -4.2F);
      PixelmonModelRenderer  Head_Middle = new PixelmonModelRenderer(this, 0, 26);
      Head_Middle.addBox(-2F, -6F, -2F, 4, 6, 4);
      Head_Middle.setTextureSize(128, 64);
      Head_Middle.mirror = true;
      setRotation(Head_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer  Head_Front = new PixelmonModelRenderer(this, 24, 21);
      Head_Front.addBox(-2F, -2F, -1F, 4, 4, 1);
      Head_Front.setRotationPoint(0F, -3F, -2F);
      Head_Front.setTextureSize(128, 64);
      Head_Front.mirror = true;
      setRotation(Head_Front, 0F, 0F, 0F);
      PixelmonModelRenderer  Head_Back = new PixelmonModelRenderer(this, 24, 26);
      Head_Back.addBox(-2F, -2F, 0F, 4, 4, 1);
      Head_Back.setRotationPoint(0F, -3F, 2F);
      Head_Back.setTextureSize(128, 64);
      Head_Back.mirror = true;
      setRotation(Head_Back, 0F, 0F, 0F);
      PixelmonModelRenderer  Head_left = new PixelmonModelRenderer(this, 0, 36);
      Head_left.addBox(0F, -2F, -2F, 1, 4, 4);
      Head_left.setRotationPoint(2F, -3F, 0F);
      Head_left.setTextureSize(128, 64);
      Head_left.mirror = true;
      setRotation(Head_left, 0F, 0F, 0F);
      PixelmonModelRenderer      Head_Right = new PixelmonModelRenderer(this, 0, 36);
      Head_Right.addBox(-1F, -2F, -2F, 1, 4, 4);
      Head_Right.setRotationPoint(-2F, -3F, 0F);
      Head_Right.setTextureSize(128, 64);
      Head_Right.mirror = true;
      setRotation(Head_Right, 0F, 0F, 0F);
      PixelmonModelRenderer      Mouth_Left = new PixelmonModelRenderer(this, 10, 36);
      Mouth_Left.addBox(-1F, -1F, -1F, 2, 2, 1);
      Mouth_Left.setRotationPoint(1.5F, -2F, -2.7F);
      Mouth_Left.setTextureSize(128, 64);
      Mouth_Left.mirror = true;
      setRotation(Mouth_Left, 0F, 0F, 0F);
      PixelmonModelRenderer      Mouth_Right = new PixelmonModelRenderer(this, 10, 36);
      Mouth_Right.addBox(-1F, -1F, -1F, 2, 2, 1);
      Mouth_Right.setRotationPoint(-1.5F, -2F, -2.7F);
      Mouth_Right.setTextureSize(128, 64);
      Mouth_Right.mirror = true;
      setRotation(Mouth_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Mouth_Middle = new PixelmonModelRenderer(this, 10, 39);
      Mouth_Middle.addBox(-1F, -1F, -1F, 2, 2, 1);
      Mouth_Middle.setRotationPoint(0F, -1.5F, -2.6F);
      Mouth_Middle.setTextureSize(128, 64);
      Mouth_Middle.mirror = true;
      setRotation(Mouth_Middle, 0F, 0F, 0F);
      PixelmonModelRenderer  Head_Spike_Base = new PixelmonModelRenderer(this, 16, 26);
      Head_Spike_Base.addBox(-1F, -2F, -1F, 2, 2, 2);
      Head_Spike_Base.setRotationPoint(0F, -5F, 0F);
      Head_Spike_Base.setTextureSize(128, 64);
      Head_Spike_Base.mirror = true;
      setRotation(Head_Spike_Base, 0F, 0F, 0F);
      PixelmonModelRenderer  Head_Spike_Tip = new PixelmonModelRenderer(this, 20, 23);
      Head_Spike_Tip.addBox(-0.5F, -2F, -0.5F, 1, 2, 1);
      Head_Spike_Tip.setRotationPoint(0F, -6F, 0F);
      Head_Spike_Tip.setTextureSize(128, 64);
      Head_Spike_Tip.mirror = true;
      setRotation(Head_Spike_Tip, 0F, 0F, 0F);
      PixelmonModelRenderer  Tongue = new PixelmonModelRenderer(this, 0, 44);
      Tongue.addBox(-1.5F, 0F, -1F, 3, 3, 1);
      Tongue.setRotationPoint(0F, -1F, -2.7F);
      Tongue.setTextureSize(128, 64);
      Tongue.mirror = true;
      setRotation(Tongue, -0.7853982F, 0F, 0F);
      PixelmonModelRenderer  Fang_Base_Left = new PixelmonModelRenderer(this, 10, 42);
      Fang_Base_Left.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Fang_Base_Left.setRotationPoint(2F, -1.5F, -3.2F);
      Fang_Base_Left.setTextureSize(128, 64);
      Fang_Base_Left.mirror = true;
      setRotation(Fang_Base_Left, 0F, 0F, 0F);
      PixelmonModelRenderer  Fang_Tip_Left = new PixelmonModelRenderer(this, 8, 44);
      Fang_Tip_Left.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Fang_Tip_Left.setRotationPoint(2F, -2.5F, -3.2F);
      Fang_Tip_Left.setTextureSize(128, 64);
      Fang_Tip_Left.mirror = true;
      setRotation(Fang_Tip_Left, 0F, 0F, 0F);
      PixelmonModelRenderer  Fang_Base_Right = new PixelmonModelRenderer(this, 10, 42);
      Fang_Base_Right.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Fang_Base_Right.setRotationPoint(-2F, -1.5F, -3.2F);
      Fang_Base_Right.setTextureSize(128, 64);
      Fang_Base_Right.mirror = true;
      setRotation(Fang_Base_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Fang_Tip_Right = new PixelmonModelRenderer(this, 8, 44);
      Fang_Tip_Right.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Fang_Tip_Right.setRotationPoint(-2F, -2.5F, -3.2F);
      Fang_Tip_Right.setTextureSize(128, 64);
      Fang_Tip_Right.mirror = true;
      setRotation(Fang_Tip_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Nose = new PixelmonModelRenderer(this, 8, 46);
      Nose.addBox(-0.5F, -0.5F, -1F, 1, 1, 1);
      Nose.setRotationPoint(0F, -2.3F, -2.4F);
      Nose.setTextureSize(128, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      Head.addChild(Head_Middle);
      Head.addChild(Head_Front);
      Head.addChild(Head_Back);
      Head.addChild(Head_left);
      Head.addChild(Head_Right);
      Head.addChild(Mouth_Left);
      Head.addChild(Mouth_Right);
      Head.addChild(Mouth_Middle);
      Head.addChild(Head_Spike_Base);
      Head.addChild(Head_Spike_Tip);
      Head.addChild(Tongue);
      Head.addChild(Fang_Base_Left);
      Head.addChild(Fang_Tip_Left);
      Head.addChild(Fang_Base_Right);
      Head.addChild(Fang_Tip_Right);
      Head.addChild(Nose);
      Body.addChild(Head);
      
      PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
      LeftArm.setRotationPoint(2.2F, -1.4F, -1);
      PixelmonModelRenderer Fin_Base_Left = new PixelmonModelRenderer(this, 64, 0);
      Fin_Base_Left.addBox(0F, 0F, -1.5F, 1, 4, 3);
      Fin_Base_Left.setTextureSize(128, 64);
      Fin_Base_Left.mirror = true;
      setRotation(Fin_Base_Left, 0F, 0F, -0.5235988F);
      PixelmonModelRenderer Fin_Tip_Front_Left = new PixelmonModelRenderer(this, 72, 0);
      Fin_Tip_Front_Left.addBox(0F, 2.5F, -0.5F, 3, 1, 1);
      Fin_Tip_Front_Left.setRotationPoint(2F, 0F, -1F);
      Fin_Tip_Front_Left.setTextureSize(128, 64);
      Fin_Tip_Front_Left.mirror = true;
      setRotation(Fin_Tip_Front_Left, 0F, 0.1745329F, 0F);
      PixelmonModelRenderer Fin_Tip_Middle_Left = new PixelmonModelRenderer(this, 72, 0);
      Fin_Tip_Middle_Left.addBox(0F, 2.5F, -0.5F, 3, 1, 1);
      Fin_Tip_Middle_Left.setRotationPoint(2F, 0F, -0F);
      Fin_Tip_Middle_Left.setTextureSize(128, 64);
      Fin_Tip_Middle_Left.mirror = true;
      setRotation(Fin_Tip_Middle_Left, 0F, 0F, 0F);
      PixelmonModelRenderer Fin_Tip_Back_Left = new PixelmonModelRenderer(this, 72, 0);
      Fin_Tip_Back_Left.addBox(0F, 2.5F, -0.5F, 3, 1, 1);
      Fin_Tip_Back_Left.setRotationPoint(2F, 0F, 1F);
      Fin_Tip_Back_Left.setTextureSize(128, 64);
      Fin_Tip_Back_Left.mirror = true;
      setRotation(Fin_Tip_Back_Left, 0F, -0.1745329F, 0F);
      LeftArm.addChild(Fin_Base_Left);
      LeftArm.addChild(Fin_Tip_Front_Left);
      LeftArm.addChild(Fin_Tip_Middle_Left);
      LeftArm.addChild(Fin_Tip_Back_Left);
      Body.addChild(LeftArm);
      
      
      PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
      RightArm.setRotationPoint(-2.2F, -1.4F, -1);
      PixelmonModelRenderer  Fin_Base_Right = new PixelmonModelRenderer(this, 64, 0);
      Fin_Base_Right.addBox(-1F, 0F, -1.5F, 1, 4, 3);
      Fin_Base_Right.setTextureSize(128, 64);
      Fin_Base_Right.mirror = true;
      setRotation(Fin_Base_Right, 0F, 0F, 0.5235988F);
      PixelmonModelRenderer  Fin_Tip_Middle_Right = new PixelmonModelRenderer(this, 72, 0);
      Fin_Tip_Middle_Right.addBox(-3F, 2.5F, -0.5F, 3, 1, 1);
      Fin_Tip_Middle_Right.setRotationPoint(-2F, 0F, 0F);
      Fin_Tip_Middle_Right.setTextureSize(128, 64);
      Fin_Tip_Middle_Right.mirror = true;
      setRotation(Fin_Tip_Middle_Right, 0F, 0F, 0F);
      PixelmonModelRenderer  Fin_Tip_Front_Right = new PixelmonModelRenderer(this, 72, 0);
      Fin_Tip_Front_Right.addBox(-3F, 2.5F, -0.5F, 3, 1, 1);
      Fin_Tip_Front_Right.setRotationPoint(-2F, 0F, -1F);
      Fin_Tip_Front_Right.setTextureSize(128, 64);
      Fin_Tip_Front_Right.mirror = true;
      setRotation(Fin_Tip_Front_Right, 0F, -0.1745329F, 0F);
      PixelmonModelRenderer  Fin_Tip_Back_Right = new PixelmonModelRenderer(this, 72, 0);
      Fin_Tip_Back_Right.addBox(-3F, 2.5F, -0.5F, 3, 1, 1);
      Fin_Tip_Back_Right.setRotationPoint(-2F, 0F, 1F);
      Fin_Tip_Back_Right.setTextureSize(128, 64);
      Fin_Tip_Back_Right.mirror = true;
      setRotation(Fin_Tip_Back_Right, 0F, 0.1745329F, 0F);
      RightArm.addChild(Fin_Base_Right);
      RightArm.addChild(Fin_Tip_Middle_Right);
      RightArm.addChild(Fin_Tip_Front_Right);
      RightArm.addChild(Fin_Tip_Back_Right);
      Body.addChild(RightArm);
      
      ModuleArm leftArmModule = new ModuleArm(LeftArm, EnumArm.Left, 0, 0, 0);
		ModuleArm rightArmModule = new ModuleArm(RightArm, EnumArm.Right, 0, 0, 0);

		ModuleHead headModule = new ModuleHead(Head);
		
		skeleton = new SkeletonBiped(Body, headModule, leftArmModule, rightArmModule,
				null, null, null);
      
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
  }
  
  private void setRotation(PixelmonModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
