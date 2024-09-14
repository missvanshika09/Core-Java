class UIComponent
{
}
class Button extends UIComponent
{
public String toString() {
return "buttton";
}
}
class TextField extends UIComponent
{
public String toString() {
return "textfield";
}
}
class CheckBox extends UIComponent
{
public String toString() {
return "checkbox";
}
}
abstract class UIComponentCreator
{
public void show(String type)
{
UIComponent comp=createUIComponent(type);
add(comp);
}
public void add(UIComponent component)
{
System.out.println("Added the component\t"+component);
}
public abstract UIComponent createUIComponent(String type);
}
class WindowsUIComponentCreator extends UIComponentCreator{
public UIComponent createUIComponent(String type) {
switch(type){
case "button":
return new Button();
case "textfield":
return new TextField();
case "checkbox":
return new CheckBox();
default:
return null;
}
}
}
class LinuxUIComponentCreator extends UIComponentCreator{
public UIComponent createUIComponent(String type) {
switch(type){
case "button":
return new Button();
case "textfield":
return new TextField();
case "checkbox":
return new CheckBox();
default:
return null;
}
}
}
class MacUIComponentCreator extends UIComponentCreator{
public UIComponent createUIComponent(String type) {
switch(type){
case "button":
return new Button();
case "textfield":
return new TextField();
case "checkbox":
return new CheckBox();
default:
return null;
}
}
}
public class UIComponentCreatorDemo {
public static void perform(UIComponentCreator ref) {
ref.show("button");
ref.show("textfield");
ref.show("checkbox");
}
public static void main(String[] args) {
perform(new WindowsUIComponentCreator());
perform(new LinuxUIComponentCreator());
perform(new MacUIComponentCreator());
}
}


/* Commandline Argument:
public class commandline{
public static void main(String[]args){
int sum=0;
for (int i=0;i<args.length;i++)
{
sum=sum+Integer.parseInt(args[i]);
}

System.out.println("Sum="+sum);
}
}
*/
