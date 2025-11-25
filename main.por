variaveis
    despertadorTocando : logico
    vontadeDeLevantar : inteiro
    minutosSoneca : inteiro
    higieneFeita : logico
    roupaEscolhida : logico
    saiuDaCama : logico

inicio
    despertadorTocando <- verdadeiro
    vontadeDeLevantar <- 0
    minutosSoneca <- 0
    higieneFeita <- falso
    roupaEscolhida <- falso
    saiuDaCama <- falso

    enquanto despertadorTocando = verdadeiro faca
        escreva("Despertador tocando...")

        escreva("Avaliar vontade de levantar (0 a 10): ")
        leia(vontadeDeLevantar)

        se vontadeDeLevantar < 5 entao
            escreva("Pouca vontade de levantar. Ativando soneca.\n")
            minutosSoneca <- minutosSoneca + 5
            escreva("Dormindo por mais 5 minutos...\n")
        senao
            escreva("Decisão: levantar agora!\n")
            despertadorTocando <- falso
        fimse
    fimenquanto

    escreva("Tentando sair da cama...\n")
    se minutosSoneca > 15 entao
        escreva("Você está atrasado! Levantando rapidamente!\n")
        saiuDaCama <- verdadeiro
    senao
        escreva("Levantando com calma.\n")
        saiuDaCama <- verdadeiro
    fimse

    enquanto higieneFeita = falso faca
        escreva("Realizando higiene pessoal...\n")
        escreva("- Escovar dentes\n")
        escreva("- Lavar rosto\n")
        escreva("- Tomar banho (opcional)\n")
        higieneFeita <- verdadeiro
    fimenquanto

    enquanto roupaEscolhida = falso faca
        escreva("Escolhendo roupa adequada para o dia...\n")
        escreva("Roupa escolhida!\n")
        roupaEscolhida <- verdadeiro
    fimenquanto

    se saiuDaCama E higieneFeita E roupaEscolhida entao
        escreva("\nVocê acordou completamente e está pronto para o dia!")
    senao
        escreva("\nAlgo não foi concluído, revise sua rotina.")
    fimse

fimprograma
