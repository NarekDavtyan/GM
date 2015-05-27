package com.globalgis.grand_marketing.models;

public class MySpinnerr<T> 
{
    /**
	 * @uml.property  name="text"
	 */
    private String text;
    /**
	 * @uml.property  name="item"
	 */
    private T item;
    public MySpinnerr(String text, T item) {
            this.text = text;
            this.item = item;
    }
    /**
	 * @return
	 * @uml.property  name="text"
	 */
    public String getText() {
        return text;
    }
    public T getItem() {
        return item;
    }
    @Override
    public String toString() {
        return getText();
    }
}