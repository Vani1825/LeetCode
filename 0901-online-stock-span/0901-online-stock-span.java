import java.util.Stack;
class StockSpanner {
private Stack<int[]> stack;
    public StockSpanner() {
        stack=new Stack<>();
    }
    public int next(int price) {
        int span=1;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            span+=stack.peek()[1];
            stack.pop();
        }
            stack.push(new int []{price,span});
            return span;
    }
}
//Is problem me stock prices ek-ek karke (stream) aati hain aur har naye price ke liye hume uska span return karna hota hai.
// Hum sirf ek stack use karte hain jisme har element pair (price, span) ke form me store hota hai.
// Jab naya price aata hai:
// Sabse pehle span ko 1 se initialize karte hain, kyunki current day to hamesha include hota hai.
// Phir jab tak stack empty nahi hai aur stack ke top par jo price hai wo current price se chhota ya equal hai,hum us element ka span current span me add kar dete hain aur us element ko pop kar dete hain.
// Is popping ka matlab ye hai ki wo previous days current day ke span me include ho gaye hain.
// Jab popping complete ho jaati hai:
// Hum (current price, updated span) ko stack me push kar dete hain, taaki ye future prices ke liye span stop kar sake.
// Aur finally current span return kar dete hain.
// Stack hamesha decreasing order of prices maintain karta hai.