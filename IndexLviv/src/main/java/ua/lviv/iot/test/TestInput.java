package main.java.ua.lviv.iot.test;

import org.junit.jupiter.api.Test;

import main.java.ua.lviv.iot.text.Input;

import static org.junit.jupiter.api.Assertions.*;

class TestInput {

    Input textInput;

    @Test
    void creatingTextInputPassingNull() {
        assertThrows(NullPointerException.class, () -> new Input(null));
    }

    @Test
    void getIndexWithEmptyInput() {
        String input = "";                             //empty input
        int actual;
        textInput = new Input(input);
        textInput.findIndex();
        textInput.findIndexesLviv();
        actual = textInput.getIndexLvivSet().size();
        assertEquals(0, actual);
    }

    @Test
    void getIndexesLviv() {
        String input = "79000" + "79001" + "79002" + "79003" + "79004" + "79005" + "79006" + "79007" + "79008" + "79009" + "79010"
                + "79011" + "79012" + "79013" + "79014" + "79015" + "79016" + "79017" + "79018" + "79019" + "79020"
                + "79021" + "79022" + "79023" + "79024" + "79025" + "79026" + "79027" + "79028" + "79029" + "79030"
                + "79031" + "79032" + "79033" + "79034" + "79035" + "79036" + "79037" + "79038" + "79039" + "79040"
                + "79041" + "79042" + "79043" + "79044" + "79045" + "79046" + "79047" + "79048" + "79049" + "79050"
                + "79051" + "79052" + "79053" + "79054" + "79055" + "79056" + "79057" + "79058" + "79059" + "79060"
                + "79061" + "79062" + "79063" + "79064" + "79065" + "79066" + "79067" + "79068" + "79069" + "79070"
                + "79071" + "79072" + "79073" + "79074" + "79075" + "79076" + "79077" + "79078" + "79079" + "79080"
                + "79081" + "79082" + "79083" + "79084" + "79085" + "79086" + "79087" + "79088" + "79089" + "79090"
                + "79091" + "79092" + "79093" + "79094" + "79095" + "79096" + "79097" + "79098" + "79099";

        int actual;

        textInput = new Input(input);
        textInput.findIndex();
        textInput.findIndexesLviv();
        actual = textInput.getIndexLvivSet().size();
        assertEquals(100, actual);
    }

}