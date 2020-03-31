public class Human extends Attacker {
//----- 定数
 private String strDEF_NAME = "名無しの勇者";
 private int intDEF_LIFE = 50;
 private int intDEF_ATTACK = 10;
 
//----- フィールド
 public int intAttack;
 
//----- コンストラクタ
 public Human() {
  setName(strDEF_NAME);
  setLife(intDEF_LIFE);
  setAttack(intDEF_ATTACK);
 }
 
 public Human(String str) {
  super(str, 50);
  setAttack(intDEF_ATTACK);
 }
 
//----- 動作メソッド
 
 //attackメソッド
 @Override
 public int attack(Attacker enemy) {
  int intDamage = getDamage();
  int intAfterLife = enemy.getLife() - intDamage;
  if( 0 < intAfterLife ) {
   enemy.setLife(intAfterLife);
  } else {
   enemy.setLife(0);
  }
  return intDamage;
 }
 
 //攻撃力算出メソッド
 public int getDamage() {
  return (int)(Math.random() * getAttack());
 }
 
//----- get・set メソッド
 
 //intAttack
 public void setAttack(int num) {
  intAttack = num;
 }
 public int getAttack() {
  return intAttack;
 }
 
 //strDEF_NAME
 public String getDEF_NAME() {
  return strDEF_NAME;
 }
 
}
