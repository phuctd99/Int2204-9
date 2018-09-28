/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.ArrayList;

/**
 *
 * @author CACLV
 */

public class Word {
    private String word_target; // từ mới tiếng anh
    private String word_explain; // giải nghĩa
    
    // contructor ko tham số truyền vào
    public Word(){ 
        this.word_target = "hello";
        this.word_explain = "xin chao";         
    }

    // contructor có tham số truyền vào
    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
    
    // các phương thức get/set
    public String getWord_target() {
        return word_target;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    
    // hàm in ra từ trên 1 dòng 
    public void showWord(){
        System.out.printf("%15s",this.word_target);
        System.out.printf(": %s\n", this.word_explain);
    }
    
    public static void main(String[] args) {
        
        // tạ một danh sách từ và in chúng ra màn hình
        ArrayList <Word> wordList = new ArrayList<>();
        wordList.add(new Word("add", "thêm"));
        wordList.add(new Word("baby", "trẻ nhỏ"));
        wordList.add(new Word("change", "thay đổi"));
        wordList.add(new Word("dolphin", "cá heo"));
        wordList.add(new Word("edit", "sửa"));
        wordList.add(new Word("fish", "cá"));
        wordList.add(new Word("goverment", "chính phủ"));
        wordList.forEach((eleWord) -> {
            eleWord.showWord();
        });
    }
    
}
