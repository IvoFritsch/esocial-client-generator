package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1270 - Contratação de Trabalhadores Avulsos Não Portuários */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtContratAvNP",
    })
@XmlRootElement(name = "eSocial")
public class Evento_ContratAvNP {

  /** Evento Contratação de Trabalhadores Avulsos Não Portuários. */
  private EvtContratAvNP evtContratAvNP;

  /**
   * Evento Contratação de Trabalhadores Avulsos Não Portuários.
   *
   * @return Conteúdo do campo evtContratAvNP
   */
  public EvtContratAvNP getEvtContratAvNP() {
    return this.evtContratAvNP;
  }

  /**
   * Evento Contratação de Trabalhadores Avulsos Não Portuários.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVE_FOPAG_IND_RETIFICACAO
   *
   * <p>REGRA:REGRA_EVE_FOPAG_PERMITE_EXCLUSAO
   *
   * <p>REGRA:REGRA_EVE_FOPAG_SIMPLIFICADO
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * @return O objeto EvtContratAvNP para população dos campos filhos
   */
  public EvtContratAvNP<Evento_ContratAvNP> setEvtContratAvNP() {
    if (this.evtContratAvNP == null) {
      this.evtContratAvNP = new EvtContratAvNP(this);
    }
    return this.evtContratAvNP;
  }

  /**
   * Evento Contratação de Trabalhadores Avulsos Não Portuários.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "remunAvNP",
      })
  public static class EvtContratAvNP<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha_mensal ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /**
     * Remuneração dos trabalhadores avulsos não portuários
     *
     * <p>- Esse campo pode ser repetido até 999 vezes
     */
    private java.util.List<RemunAvNP> remunAvNP;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_folha_mensal getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * <p>CHAVE_GRUPO: {perApur}, {indGuia}
     *
     * @return O objeto Tipos.T_ideEvento_folha_mensal para população dos campos filhos
     */
    public Tipos.T_ideEvento_folha_mensal<EvtContratAvNP<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_folha_mensal(this);
      }
      return this.ideEvento;
    }

    /**
     * Informações de identificação do empregador.
     *
     * @return Conteúdo do campo ideEmpregador
     */
    public Tipos.T_ideEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto Tipos.T_ideEmpregador para população dos campos filhos
     */
    public Tipos.T_ideEmpregador<EvtContratAvNP<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Remuneração dos trabalhadores avulsos não portuários
     *
     * @return Conteúdo do campo remunAvNP
     */
    public java.util.List<RemunAvNP> getRemunAvNP() {
      return this.remunAvNP;
    }

    /**
     * Remuneração dos trabalhadores avulsos não portuários
     *
     * <p>- Esse campo pode ser repetido até 999 vezes
     *
     * <p>DESCRICAO_COMPLETA:Grupo que apresenta a remuneração dos trabalhadores avulsos não
     * portuários, de forma totalizada por estabelecimento contratante.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}, {codLotacao}
     *
     * @return O objeto RemunAvNP para população dos campos filhos
     */
    public RemunAvNP<EvtContratAvNP<T>> setRemunAvNP_Next() {
      if (this.remunAvNP == null) {
        this.remunAvNP = new java.util.ArrayList<>();
      }
      RemunAvNP toAdd = new RemunAvNP(this);
      this.remunAvNP.add(toAdd);
      return toAdd;
    }

    public EvtContratAvNP(Object pai) {
      this.pai = pai;
    }

    @XmlTransient private final Object pai;

    /**
     * Finaliza a população dos campos filhos desse nível
     *
     * @return O nível anterior da árvore
     */
    public T finish() {
      return (T) pai;
    }
    /**
     * Remuneração dos trabalhadores avulsos não portuários
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpInsc",
          "nrInsc",
          "codLotacao",
          "vrBcCp00",
          "vrBcCp15",
          "vrBcCp20",
          "vrBcCp25",
          "vrBcCp13",
          "vrBcFgts",
          "vrDescCP",
        })
    public static class RemunAvNP<T> {

      /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
      private String tpInsc;

      /**
       * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo de
       * inscrição indicado no campo {remunAvNP/tpInsc}(./tpInsc).
       */
      private String nrInsc;

      /** Informar o código atribuído pelo empregador para a lotação tributária. */
      private String codLotacao;

      /**
       * Valor da base de cálculo da contribuição previdenciária sobre a remuneração dos
       * trabalhadores avulsos não portuários.
       */
      private Double vrBcCp00;

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 15 anos de contribuição.
       */
      private Double vrBcCp15;

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 20 anos de contribuição.
       */
      private Double vrBcCp20;

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 25 anos de contribuição.
       */
      private Double vrBcCp25;

      /**
       * Valor da base de cálculo da contribuição previdenciária sobre o 13° salário dos
       * trabalhadores avulsos não portuários contratados.
       */
      private Double vrBcCp13;

      /**
       * Valor da base de cálculo do FGTS sobre a remuneração dos trabalhadores avulsos não
       * portuários contratados.
       */
      private Double vrBcFgts;

      /**
       * Preencher com o valor total da contribuição descontada dos trabalhadores avulsos não
       * portuários.
       */
      private Double vrDescCP;

      /**
       * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
       *
       * @return Conteúdo do campo tpInsc
       */
      public String getTpInsc() {
        return this.tpInsc;
      }

      /**
       * Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05.
       *
       * @param tpInsc Valor para atribuir ao campo tpInsc
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setTpInsc(String tpInsc) {
        if (!"1".equals(tpInsc) && !"3".equals(tpInsc) && !"4".equals(tpInsc))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
        this.tpInsc = tpInsc;
        return this;
      }
      /**
       * CNPJ
       *
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setTpInsc_1() {
        this.tpInsc = "1";
        return this;
      }
      /**
       * CAEPF
       *
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setTpInsc_3() {
        this.tpInsc = "3";
        return this;
      }
      /**
       * CNO
       *
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setTpInsc_4() {
        this.tpInsc = "4";
        return this;
      }

      /**
       * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo de
       * inscrição indicado no campo {remunAvNP/tpInsc}(./tpInsc).
       *
       * @return Conteúdo do campo nrInsc
       */
      public String getNrInsc() {
        return this.nrInsc;
      }

      /**
       * Informar o número de inscrição do estabelecimento do contribuinte de acordo com o tipo de
       * inscrição indicado no campo {remunAvNP/tpInsc}(./tpInsc).
       *
       * <p>Validação: Deve ser um número de inscrição válido e existente na Tabela de
       * Estabelecimentos (S-1005).
       *
       * @param nrInsc Valor para atribuir ao campo nrInsc
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
        return this;
      }

      /**
       * Informar o código atribuído pelo empregador para a lotação tributária.
       *
       * @return Conteúdo do campo codLotacao
       */
      public String getCodLotacao() {
        return this.codLotacao;
      }

      /**
       * Informar o código atribuído pelo empregador para a lotação tributária.
       *
       * <p>Validação: Deve ser um código válido e existente na Tabela de Lotações Tributárias
       * (S-1020).
       *
       * @param codLotacao Valor para atribuir ao campo codLotacao
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setCodLotacao(String codLotacao) {
        this.codLotacao = codLotacao;
        return this;
      }

      /**
       * Valor da base de cálculo da contribuição previdenciária sobre a remuneração dos
       * trabalhadores avulsos não portuários.
       *
       * @return Conteúdo do campo vrBcCp00
       */
      public Double getVrBcCp00() {
        return this.vrBcCp00;
      }

      /**
       * Valor da base de cálculo da contribuição previdenciária sobre a remuneração dos
       * trabalhadores avulsos não portuários.
       *
       * @param vrBcCp00 Valor para atribuir ao campo vrBcCp00
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setVrBcCp00(Double vrBcCp00) {
        this.vrBcCp00 = vrBcCp00;
        return this;
      }

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 15 anos de contribuição.
       *
       * @return Conteúdo do campo vrBcCp15
       */
      public Double getVrBcCp15() {
        return this.vrBcCp15;
      }

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 15 anos de contribuição.
       *
       * @param vrBcCp15 Valor para atribuir ao campo vrBcCp15
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setVrBcCp15(Double vrBcCp15) {
        this.vrBcCp15 = vrBcCp15;
        return this;
      }

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 20 anos de contribuição.
       *
       * @return Conteúdo do campo vrBcCp20
       */
      public Double getVrBcCp20() {
        return this.vrBcCp20;
      }

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 20 anos de contribuição.
       *
       * @param vrBcCp20 Valor para atribuir ao campo vrBcCp20
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setVrBcCp20(Double vrBcCp20) {
        this.vrBcCp20 = vrBcCp20;
        return this;
      }

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 25 anos de contribuição.
       *
       * @return Conteúdo do campo vrBcCp25
       */
      public Double getVrBcCp25() {
        return this.vrBcCp25;
      }

      /**
       * Valor da base de cálculo da contribuição adicional para o financiamento dos benefícios de
       * aposentadoria especial após 25 anos de contribuição.
       *
       * @param vrBcCp25 Valor para atribuir ao campo vrBcCp25
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setVrBcCp25(Double vrBcCp25) {
        this.vrBcCp25 = vrBcCp25;
        return this;
      }

      /**
       * Valor da base de cálculo da contribuição previdenciária sobre o 13° salário dos
       * trabalhadores avulsos não portuários contratados.
       *
       * @return Conteúdo do campo vrBcCp13
       */
      public Double getVrBcCp13() {
        return this.vrBcCp13;
      }

      /**
       * Valor da base de cálculo da contribuição previdenciária sobre o 13° salário dos
       * trabalhadores avulsos não portuários contratados.
       *
       * @param vrBcCp13 Valor para atribuir ao campo vrBcCp13
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setVrBcCp13(Double vrBcCp13) {
        this.vrBcCp13 = vrBcCp13;
        return this;
      }

      /**
       * Valor da base de cálculo do FGTS sobre a remuneração dos trabalhadores avulsos não
       * portuários contratados.
       *
       * @return Conteúdo do campo vrBcFgts
       */
      public Double getVrBcFgts() {
        return this.vrBcFgts;
      }

      /**
       * Valor da base de cálculo do FGTS sobre a remuneração dos trabalhadores avulsos não
       * portuários contratados.
       *
       * @param vrBcFgts Valor para atribuir ao campo vrBcFgts
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setVrBcFgts(Double vrBcFgts) {
        this.vrBcFgts = vrBcFgts;
        return this;
      }

      /**
       * Preencher com o valor total da contribuição descontada dos trabalhadores avulsos não
       * portuários.
       *
       * @return Conteúdo do campo vrDescCP
       */
      public Double getVrDescCP() {
        return this.vrDescCP;
      }

      /**
       * Preencher com o valor total da contribuição descontada dos trabalhadores avulsos não
       * portuários.
       *
       * @param vrDescCP Valor para atribuir ao campo vrDescCP
       * @return O próprio RemunAvNP para continuar populando outros campos
       */
      public RemunAvNP<T> setVrDescCP(Double vrDescCP) {
        this.vrDescCP = vrDescCP;
        return this;
      }

      public RemunAvNP(Object pai) {
        this.pai = pai;
      }

      @XmlTransient private final Object pai;

      /**
       * Finaliza a população dos campos filhos desse nível
       *
       * @return O nível anterior da árvore
       */
      public T finish() {
        return (T) pai;
      }
    }
  }
}
