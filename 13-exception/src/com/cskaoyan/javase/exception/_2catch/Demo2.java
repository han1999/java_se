package com.cskaoyan.javase.exception._2catch;

/**
 * @description: 多分支的try...catch
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 多分支的try...catch可以类比多分支的if...else
 * 语法:
 *      try {
 *          //可能出现异常的，正常的代码逻辑
 *      } catch(要捕捉的异常对象1) {
 *          //每一个catch分支对应一个异常处理器
 *          //在catch分支中处理具体类型的代码异常
 *      }catch(要捕捉的异常对象2) {
 *          //每一个catch分支对应一个异常处理器
 *          //在catch分支中处理具体类型的代码异常
 *      }
 * .....
 *
 * 多分支try...catch可以使用不同的方式处理不同的异常,但是需要明确try当中最多产生一个异常
 * 这个异常会从上到下去匹配异常,如果能够匹配上就执行catch代码块,如果都不能匹配,做默认处理
 * > 多分支try...catch使用注意事项
 * - 多分支的异常处理的执行，有点类似于多分支if-else的执行，一次匹配，只会执行多个catch分支中的一个
 * - 如果多个catch中处理的是毫无关系的异常，那么catch的顺序并不需要特别注意
 * - 如果多个catch中处理的异常有父子关系，那么就必须要注意了
 *   - 如果父类异常写在了上面，那么子类异常的catch分支就永远没有机会执行了，并且会报错
 * - 所以，应该把具体子类放在catch分支的上面作类型匹配，父类放在后面作兜底
 * - catch()括号当中，尽量不要写Exception这种大而宽泛的异常
 *   - 而是应该写具体的异常，越具体越好
 *   - 这样对处理异常有帮助，能够清晰定位异常的类型，能够准确针对不同异常做出处理
 *
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = null;
        Demo2 d = new Demo2();
        try {
            //System.out.println(10 / 0);
            //System.out.println(arr.length);
            arr = new int[3];
            //System.out.println(arr[3]);

            //编译时异常也是可以做try...catch处理的
            d.clone();
        }
        catch (ArithmeticException ae){
            System.out.println("发生了算术异常");
        }catch (NullPointerException e){
            System.out.println("发生了空指针异常");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("发生了数组下标越界异常");
        }
        catch (CloneNotSupportedException e){
            System.out.println("发生了克隆不支持异常");
        }
        catch (Exception e){
            //多分支catch中可以在最后写一个Exception的匹配,作为兜底的作用
        }
        System.out.println("after");
    }
}
