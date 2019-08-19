/*
 * The MIT License
 *
 * Copyright 2019 Intuit Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.intuit.karate.driver;

/**
 *
 * @author pthomas3
 */
public class MissingElement implements Element {

    private final Driver driver;
    private final String locator;

    public MissingElement(Driver driver, String locator) {
        this.driver = driver;
        this.locator = locator;
    }

    @Override
    public String getLocator() {
        return locator;
    }

    @Override
    public boolean isExists() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true; // hmm
    }        

    @Override
    public Element focus() {
        return this;
    }

    @Override
    public Element clear() {
        return this;
    }

    @Override
    public Element click() {
        return this;
    }

    @Override
    public Element submit() {
        return this;
    }        

    @Override
    public Mouse mouse() {
        return null;
    }        

    @Override
    public Element input(String text) {
        return this;
    }

    @Override
    public Element input(String[] values) {
        return this;
    }
    
    @Override
    public Element select(String text) {
        return this;
    }

    @Override
    public Element select(int index) {
        return this;
    }

    @Override
    public Element switchFrame() {
        return this;
    }        

    @Override
    public Element delay(int millis) {
        driver.delay(millis);
        return this;
    }        

    @Override
    public Element waitFor() {
        return this;
    }

    @Override
    public Element waitUntil(String expression) {
        return this;
    }

    @Override
    public Element waitUntilText(String text) {
        return this;
    }        

    @Override
    public Object script(String expression) {
        return null;
    }

    @Override
    public String getHtml() {
        return null;
    }

    @Override
    public void setHtml(String html) {

    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public void setText(String text) {

    }

    @Override
    public String getValue() {
        return null;
    }

    @Override
    public void setValue(String value) {

    }

}