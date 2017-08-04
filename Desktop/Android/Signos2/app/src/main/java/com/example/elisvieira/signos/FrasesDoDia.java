package com.example.elisvieira.signos;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by elisvieira on 04/08/2017.
 */

public class FrasesDoDia {

    public static String  gerarFraseAleatoria() {

        int qtdeMaximaFrase = 1;

        String[] frases = {"Não importa a cor do céu. Quem faz o dia bonito é você.",
            "Bom dia! Que seu dia seja igual a vontade de Deus: bom, perfeito e agradável.",
            "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.",
            "Que o dia seja leve, que a tristeza seja breve e que o dia seja feliz.",
            "Que o dia comece bem e termine ainda melhor.",
            "A cada nova manhã, nasce junto uma nova chance. Bom dia!",
            "Sempre que o sol nasce, você tem uma nova oportunidade de ser feliz.",
            "Pra todo game-over existe um play again.",
            "Que todo mal vire amor, que toda dor vire flor.",
            "Imagine uma nova história para sua vida e acredite nela.",
            "Se for pra ser, será. Se tá demorando, é porque o melhor ainda está por vir.",
            "E que nunca nos falte a esperança de dias melhores.",
           "Simplesmente viva a vida!",
            "Aprenda a rir dos seus tropeços.",
            "O melhor está por vir. Acredite!",
            "E que venham novas histórias, novos sorrisos e novas pessoas.",
            "Eu nasci para ser feliz, não para ser normal.",
            "Não acumule o que escurece a alma e amarela o sorriso. Acumule o que perfuma a vida!",
            "Amanhã será um dia melhor!",
            "O seu sorriso me traz tanta paz, você nem imagina o bem que você me faz.",
            "Hoje vou escolher sorrir porque só a felicidade combina comigo.",
            "Sorria, sem motivo, com motivo, sozinho ou quando alguém faz você rir. Apenas sorria, o sorriso abre portas, contagia e diverte!",
            "Nunca perca esse sorriso que dá vida ao seu rosto e paz à sua alma.",
            "Já que os bons momentos da vida sempre passam rápido, faço o possível para que sejam inesquecíveis e acompanhados de muitos sorrisos.",
            "Sorrir é a melhor arma para enfrentar a conquista de nossos sonhos!",
            "Pouca coisa é necessária para transformar inteiramente uma vida: amor no coração e sorriso nos lábios.",
            "Amanheci vestindo o meu melhor sorriso… Tristeza aqui não tem vez!",
            "Um sorriso tem sempre o poder de enfraquecer a tristeza e, consequentemente, transmite aos que emitem muito mais beleza!",
            "Simpatia para ganhar dinheiro: acorde cedo, tome banho e vá trabalhar.",
            "Se você quer saber o quão rico você é, procure por coisas que você tem e que o dinheiro não pode comprar.",
            "Que o vento leve o necessário e me traga o suficiente.",
            "Deixe pra trás o que não te leva pra frente.",
            "Algumas pessoas surgem em nossas vidas como uma benção, outras como lição.",
            "Algumas vezes coisas ruins acontecem em nossas vidas para nos colocar na direção das melhores coisas que poderíamos viver."
        };

                StringBuilder senha = new StringBuilder();

                for (int i = 0; i < qtdeMaximaFrase; i++) {
                    int posicao = (int) (Math.random() * frases.length );
                    senha.append(frases[posicao]);
                }
        return senha.toString();

    }


}
