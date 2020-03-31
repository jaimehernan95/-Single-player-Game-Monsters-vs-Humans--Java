public class Monster extends Attacker {
//----- 定数
 private String strDEF_NAME = "スライム";
 private int intDEF_LIFE = 10;
 private int intDEF_ATTACK = 5;
 
//----- フィールド
 public int intAttack;
 
//----- コンストラクタ
 public Monster() {
  setName(strDEF_NAME);
  setLife(intDEF_LIFE);
  setAttack(intDEF_ATTACK);
 }
 
 public Monster(String str, int num) {
  super(str, num);
  setAttack(intDEF_ATTACK);
 }
 
 public Monster(String str, int num1, int num2) {
  super(str, num1);
  setAttack(num2);
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
 
}