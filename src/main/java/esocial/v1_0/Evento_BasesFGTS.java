package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-5003 - Informações do FGTS por Trabalhador */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtBasesFGTS",
    })
@XmlRootElement(name = "eSocial")
public class Evento_BasesFGTS {

  /** Evento Informações do FGTS por Trabalhador. */
  private EvtBasesFGTS evtBasesFGTS;

  /**
   * Evento Informações do FGTS por Trabalhador.
   *
   * @return Conteúdo do campo evtBasesFGTS
   */
  public EvtBasesFGTS getEvtBasesFGTS() {
    return this.evtBasesFGTS;
  }

  /**
   * Evento Informações do FGTS por Trabalhador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * @return O objeto EvtBasesFGTS para população dos campos filhos
   */
  public EvtBasesFGTS<Evento_BasesFGTS> setEvtBasesFGTS() {
    if (this.evtBasesFGTS == null) {
      this.evtBasesFGTS = new EvtBasesFGTS(this);
    }
    return this.evtBasesFGTS;
  }

  /**
   * Evento Informações do FGTS por Trabalhador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideTrabalhador",
        "infoFGTS",
      })
  public static class EvtBasesFGTS<T> {

    /** Identificação do evento de retorno. */
    private Tipos.T_ideEvento_retorno_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Identificação do trabalhador */
    private IdeTrabalhador ideTrabalhador;

    /** Informações relativas ao FGTS */
    private InfoFGTS infoFGTS;

    /**
     * Identificação do evento de retorno.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_retorno_trab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Identificação do evento de retorno.
     *
     * @return O objeto Tipos.T_ideEvento_retorno_trab para população dos campos filhos
     */
    public Tipos.T_ideEvento_retorno_trab<EvtBasesFGTS<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_retorno_trab(this);
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
    public Tipos.T_ideEmpregador<EvtBasesFGTS<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Identificação do trabalhador
     *
     * @return Conteúdo do campo ideTrabalhador
     */
    public IdeTrabalhador getIdeTrabalhador() {
      return this.ideTrabalhador;
    }

    /**
     * Identificação do trabalhador
     *
     * <p>DESCRICAO_COMPLETA:Grupo que apresenta a identificação básica do trabalhador ao qual se
     * refere o evento de retorno.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}
     *
     * @return O objeto IdeTrabalhador para população dos campos filhos
     */
    public IdeTrabalhador<EvtBasesFGTS<T>> setIdeTrabalhador() {
      if (this.ideTrabalhador == null) {
        this.ideTrabalhador = new IdeTrabalhador(this);
      }
      return this.ideTrabalhador;
    }

    /**
     * Informações relativas ao FGTS
     *
     * @return Conteúdo do campo infoFGTS
     */
    public InfoFGTS getInfoFGTS() {
      return this.infoFGTS;
    }

    /**
     * Informações relativas ao FGTS
     *
     * <p>DESCRICAO_COMPLETA:Informações relativas ao Fundo de Garantia do Tempo de Serviço - FGTS.
     *
     * @return O objeto InfoFGTS para população dos campos filhos
     */
    public InfoFGTS<EvtBasesFGTS<T>> setInfoFGTS() {
      if (this.infoFGTS == null) {
        this.infoFGTS = new InfoFGTS(this);
      }
      return this.infoFGTS;
    }

    public EvtBasesFGTS(Object pai) {
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
     * Identificação do trabalhador
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfTrab",
        })
    public static class IdeTrabalhador<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /**
       * Preencher com o número do CPF do trabalhador.
       *
       * @return Conteúdo do campo cpfTrab
       */
      public String getCpfTrab() {
        return this.cpfTrab;
      }

      /**
       * Preencher com o número do CPF do trabalhador.
       *
       * <p>Validação: Deve ser um CPF constante no arquivo gerado pelo empregador no evento de
       * origem.
       *
       * @param cpfTrab Valor para atribuir ao campo cpfTrab
       * @return O próprio IdeTrabalhador para continuar populando outros campos
       */
      public IdeTrabalhador<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

      public IdeTrabalhador(Object pai) {
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

    /**
     * Informações relativas ao FGTS
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtVenc",
          "ideEstab",
        })
    public static class InfoFGTS<T> {

      /** Data de vencimento do FGTS mensal. */
      private javax.xml.datatype.XMLGregorianCalendar dtVenc;

      /**
       * Identificação do estabelecimento
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       */
      private java.util.List<IdeEstab> ideEstab;

      /**
       * Data de vencimento do FGTS mensal.
       *
       * @return Conteúdo do campo dtVenc
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtVenc() {
        return this.dtVenc;
      }

      /**
       * Data de vencimento do FGTS mensal.
       *
       * <p>Validação: Preencher somente se houver informação no grupo
       * {infoBaseFGTS}(./ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS).
       *
       * <p>Se informada, deve corresponder ao dia 7 (sete) do mês subsequente ao indicado em
       * {perApur}(5003_ideEvento_perApur), se esse dia for útil. Caso não seja, deve corresponder
       * ao dia útil imediatamente anterior.
       *
       * <p>Considera-se como dia não útil o sábado, o domingo e todo aquele constante do Calendário
       * Nacional de feriados bancários divulgados pelo Banco Central do Brasil.
       *
       * @param dtVenc Valor para atribuir ao campo dtVenc
       * @return O próprio InfoFGTS para continuar populando outros campos
       */
      public InfoFGTS<T> setDtVenc(javax.xml.datatype.XMLGregorianCalendar dtVenc) {
        this.dtVenc = dtVenc;
        return this;
      }

      /**
       * Identificação do estabelecimento
       *
       * @return Conteúdo do campo ideEstab
       */
      public java.util.List<IdeEstab> getIdeEstab() {
        return this.ideEstab;
      }

      /**
       * Identificação do estabelecimento
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       *
       * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento ou obra de construção civil.
       *
       * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
       *
       * @return O objeto IdeEstab para população dos campos filhos
       */
      public IdeEstab<InfoFGTS<T>> setIdeEstab_Next() {
        if (this.ideEstab == null) {
          this.ideEstab = new java.util.ArrayList<>();
        }
        IdeEstab toAdd = new IdeEstab(this);
        this.ideEstab.add(toAdd);
        return toAdd;
      }

      public InfoFGTS(Object pai) {
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
       * Identificação do estabelecimento
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpInsc",
            "nrInsc",
            "ideLotacao",
          })
      public static class IdeEstab<T> {

        /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
        private String tpInsc;

        /**
         * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
         * no campo {ideEstab/tpInsc}(./tpInsc).
         */
        private String nrInsc;

        /**
         * Identificação da lotação tributária.
         *
         * <p>- Esse campo pode ser repetido indefinidas vezes
         */
        private java.util.List<IdeLotacao> ideLotacao;

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
         * <p>Origem: campo {ideEstabLot/tpInsc} de:
         *
         * <p>a) {infoPerApur}(1200_dmDev_infoPerApur) ou
         * {idePeriodo}(1200_dmDev_infoPerAnt_ideADC_idePeriodo) do S-1200;
         *
         * <p>b) {infoPerApur}(2299_infoDeslig_verbasResc_dmDev_infoPerApur) ou
         * {idePeriodo}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo) do S-2299;
         *
         * <p>c) {dmDev}(2399_infoTSVTermino_verbasResc_dmDev) do S-2399.
         *
         * @param tpInsc Valor para atribuir ao campo tpInsc
         * @return O próprio IdeEstab para continuar populando outros campos
         */
        public IdeEstab<T> setTpInsc(String tpInsc) {
          if (!"1".equals(tpInsc)
              && !"2".equals(tpInsc)
              && !"3".equals(tpInsc)
              && !"4".equals(tpInsc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
          this.tpInsc = tpInsc;
          return this;
        }
        /**
         * CNPJ
         *
         * @return O próprio IdeEstab para continuar populando outros campos
         */
        public IdeEstab<T> setTpInsc_1() {
          this.tpInsc = "1";
          return this;
        }
        /**
         * CPF
         *
         * @return O próprio IdeEstab para continuar populando outros campos
         */
        public IdeEstab<T> setTpInsc_2() {
          this.tpInsc = "2";
          return this;
        }
        /**
         * CAEPF
         *
         * @return O próprio IdeEstab para continuar populando outros campos
         */
        public IdeEstab<T> setTpInsc_3() {
          this.tpInsc = "3";
          return this;
        }
        /**
         * CNO
         *
         * @return O próprio IdeEstab para continuar populando outros campos
         */
        public IdeEstab<T> setTpInsc_4() {
          this.tpInsc = "4";
          return this;
        }

        /**
         * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
         * no campo {ideEstab/tpInsc}(./tpInsc).
         *
         * @return Conteúdo do campo nrInsc
         */
        public String getNrInsc() {
          return this.nrInsc;
        }

        /**
         * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
         * no campo {ideEstab/tpInsc}(./tpInsc).
         *
         * <p>Origem: campo {ideEstabLot/nrInsc} de:
         *
         * <p>a) {infoPerApur}(1200_dmDev_infoPerApur) ou
         * {idePeriodo}(1200_dmDev_infoPerAnt_ideADC_idePeriodo) do S-1200;
         *
         * <p>b) {infoPerApur}(2299_infoDeslig_verbasResc_dmDev_infoPerApur) ou
         * {idePeriodo}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo) do S-2299;
         *
         * <p>c) {dmDev}(2399_infoTSVTermino_verbasResc_dmDev) do S-2399.
         *
         * @param nrInsc Valor para atribuir ao campo nrInsc
         * @return O próprio IdeEstab para continuar populando outros campos
         */
        public IdeEstab<T> setNrInsc(String nrInsc) {
          this.nrInsc = nrInsc;
          return this;
        }

        /**
         * Identificação da lotação tributária.
         *
         * @return Conteúdo do campo ideLotacao
         */
        public java.util.List<IdeLotacao> getIdeLotacao() {
          return this.ideLotacao;
        }

        /**
         * Identificação da lotação tributária.
         *
         * <p>- Esse campo pode ser repetido indefinidas vezes
         *
         * <p>CHAVE_GRUPO: {codLotacao}, {tpLotacao}, {tpInsc}, {nrInsc}
         *
         * @return O objeto IdeLotacao para população dos campos filhos
         */
        public IdeLotacao<IdeEstab<T>> setIdeLotacao_Next() {
          if (this.ideLotacao == null) {
            this.ideLotacao = new java.util.ArrayList<>();
          }
          IdeLotacao toAdd = new IdeLotacao(this);
          this.ideLotacao.add(toAdd);
          return toAdd;
        }

        public IdeEstab(Object pai) {
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
         * Identificação da lotação tributária.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "codLotacao",
              "tpLotacao",
              "tpInsc",
              "nrInsc",
              "infoTrabFGTS",
            })
        public static class IdeLotacao<T> {

          /** Informar o código atribuído pelo empregador para a lotação tributária. */
          private String codLotacao;

          /** Preencher com o código correspondente ao tipo de lotação, conforme Tabela 10. */
          private String tpLotacao;

          /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
          private String tpInsc;

          /**
           * Preencher com o número de inscrição (CNPJ, CPF, CNO) ao qual pertence a lotação
           * tributária, conforme indicado na Tabela 10.
           */
          private String nrInsc;

          /**
           * Informações relativas à matrícula e categoria do trabalhador.
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           */
          private java.util.List<InfoTrabFGTS> infoTrabFGTS;

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
           * <p>Origem: campo {ideEstabLot/codLotacao} de:
           *
           * <p>a) {infoPerApur}(1200_dmDev_infoPerApur) ou
           * {idePeriodo}(1200_dmDev_infoPerAnt_ideADC_idePeriodo) do S-1200;
           *
           * <p>b) {infoPerApur}(2299_infoDeslig_verbasResc_dmDev_infoPerApur) ou
           * {idePeriodo}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo) do S-2299;
           *
           * <p>c) {dmDev}(2399_infoTSVTermino_verbasResc_dmDev) do S-2399.
           *
           * @param codLotacao Valor para atribuir ao campo codLotacao
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setCodLotacao(String codLotacao) {
            this.codLotacao = codLotacao;
            return this;
          }

          /**
           * Preencher com o código correspondente ao tipo de lotação, conforme Tabela 10.
           *
           * @return Conteúdo do campo tpLotacao
           */
          public String getTpLotacao() {
            return this.tpLotacao;
          }

          /**
           * Preencher com o código correspondente ao tipo de lotação, conforme Tabela 10.
           *
           * <p>Evento de origem: S-1020.
           *
           * <p>Validação: a) Se origem de {codLotacao}(./codLotacao) for
           * {infoPerApur}(1200_dmDev_infoPerApur) do S-1200,
           * {infoPerApur}(2299_infoDeslig_verbasResc_dmDev_infoPerApur) do S-2299 ou
           * {dmDev}(2399_infoTSVTermino_verbasResc_dmDev) do S-2399, retornar o tipo de lotação
           * vigente em {perApur}(5003_ideEvento_perApur);
           *
           * <p>b) Se origem de {codLotacao}(./codLotacao) for
           * {idePeriodo}(1200_dmDev_infoPerAnt_ideADC_idePeriodo) do S-1200, retornar o tipo de
           * lotação vigente em {perRef}(1200_dmDev_infoPerAnt_ideADC_idePeriodo_perRef) desse
           * evento;
           *
           * <p>c) Se origem de {codLotacao}(./codLotacao) for
           * {idePeriodo}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo) do S-2299,
           * retornar o tipo de lotação vigente em
           * {perRef}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo_perRef) desse
           * evento.
           *
           * @param tpLotacao Valor para atribuir ao campo tpLotacao
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setTpLotacao(String tpLotacao) {
            this.tpLotacao = tpLotacao;
            return this;
          }

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
           * <p>Evento de origem: S-1020.
           *
           * <p>Validação: a) Se origem de {codLotacao}(./codLotacao) for
           * {infoPerApur}(1200_dmDev_infoPerApur) do S-1200,
           * {infoPerApur}(2299_infoDeslig_verbasResc_dmDev_infoPerApur) do S-2299 ou
           * {dmDev}(2399_infoTSVTermino_verbasResc_dmDev) do S-2399, retornar o tipo de inscrição
           * vigente em {perApur}(5003_ideEvento_perApur);
           *
           * <p>b) Se origem de {codLotacao}(./codLotacao) for
           * {idePeriodo}(1200_dmDev_infoPerAnt_ideADC_idePeriodo) do S-1200, retornar o tipo de
           * inscrição vigente em {perRef}(1200_dmDev_infoPerAnt_ideADC_idePeriodo_perRef) desse
           * evento;
           *
           * <p>c) Se origem de {codLotacao}(./codLotacao) for
           * {idePeriodo}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo) do S-2299,
           * retornar o tipo de inscrição vigente em
           * {perRef}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo_perRef) desse
           * evento.
           *
           * @param tpInsc Valor para atribuir ao campo tpInsc
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setTpInsc(String tpInsc) {
            if (!"1".equals(tpInsc) && !"2".equals(tpInsc) && !"4".equals(tpInsc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
            this.tpInsc = tpInsc;
            return this;
          }
          /**
           * CNPJ
           *
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setTpInsc_1() {
            this.tpInsc = "1";
            return this;
          }
          /**
           * CPF
           *
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setTpInsc_2() {
            this.tpInsc = "2";
            return this;
          }
          /**
           * CNO
           *
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setTpInsc_4() {
            this.tpInsc = "4";
            return this;
          }

          /**
           * Preencher com o número de inscrição (CNPJ, CPF, CNO) ao qual pertence a lotação
           * tributária, conforme indicado na Tabela 10.
           *
           * @return Conteúdo do campo nrInsc
           */
          public String getNrInsc() {
            return this.nrInsc;
          }

          /**
           * Preencher com o número de inscrição (CNPJ, CPF, CNO) ao qual pertence a lotação
           * tributária, conforme indicado na Tabela 10.
           *
           * <p>Evento de origem: S-1020.
           *
           * <p>Validação: a) Se origem de {codLotacao}(./codLotacao) for
           * {infoPerApur}(1200_dmDev_infoPerApur) do S-1200,
           * {infoPerApur}(2299_infoDeslig_verbasResc_dmDev_infoPerApur) do S-2299 ou
           * {dmDev}(2399_infoTSVTermino_verbasResc_dmDev) do S-2399, retornar o número de inscrição
           * vigente em {perApur}(5003_ideEvento_perApur);
           *
           * <p>b) Se origem de {codLotacao}(./codLotacao) for
           * {idePeriodo}(1200_dmDev_infoPerAnt_ideADC_idePeriodo) do S-1200, retornar o número de
           * inscrição vigente em {perRef}(1200_dmDev_infoPerAnt_ideADC_idePeriodo_perRef) desse
           * evento;
           *
           * <p>c) Se origem de {codLotacao}(./codLotacao) for
           * {idePeriodo}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo) do S-2299,
           * retornar o número de inscrição vigente em
           * {perRef}(2299_infoDeslig_verbasResc_dmDev_infoPerAnt_ideADC_idePeriodo_perRef) desse
           * evento.
           *
           * @param nrInsc Valor para atribuir ao campo nrInsc
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
          }

          /**
           * Informações relativas à matrícula e categoria do trabalhador.
           *
           * @return Conteúdo do campo infoTrabFGTS
           */
          public java.util.List<InfoTrabFGTS> getInfoTrabFGTS() {
            return this.infoTrabFGTS;
          }

          /**
           * Informações relativas à matrícula e categoria do trabalhador.
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           *
           * <p>CHAVE_GRUPO: {matricula}, {codCateg}
           *
           * @return O objeto InfoTrabFGTS para população dos campos filhos
           */
          public InfoTrabFGTS<IdeLotacao<T>> setInfoTrabFGTS_Next() {
            if (this.infoTrabFGTS == null) {
              this.infoTrabFGTS = new java.util.ArrayList<>();
            }
            InfoTrabFGTS toAdd = new InfoTrabFGTS(this);
            this.infoTrabFGTS.add(toAdd);
            return toAdd;
          }

          public IdeLotacao(Object pai) {
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
           * Informações relativas à matrícula e categoria do trabalhador.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "matricula",
                "codCateg",
                "categOrig",
                "tpRegTrab",
                "remunSuc",
                "dtDeslig",
                "mtvDeslig",
                "dtTerm",
                "mtvDesligTSV",
                "sucessaoVinc",
                "infoBaseFGTS",
                "procCS",
              })
          public static class InfoTrabFGTS<T> {

            /**
             * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
             * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
             */
            private String matricula;

            /** Preencher com o código da categoria do trabalhador, conforme Tabela 01. */
            private Integer codCateg;

            /**
             * Preencher com o código correspondente à categoria de origem do dirigente sindical ou
             * do trabalhador cedido.
             */
            private Integer categOrig;

            /** Tipo de regime trabalhista. */
            private String tpRegTrab;

            /**
             * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial
             * devidas pela empresa sucessora a empregados desligados ainda na sucedida.
             */
            private String remunSuc;

            /** Preencher com a data de desligamento do vínculo (último dia trabalhado). */
            private javax.xml.datatype.XMLGregorianCalendar dtDeslig;

            /** Código de motivo do desligamento, conforme Tabela 19. */
            private String mtvDeslig;

            /** Data do término. */
            private javax.xml.datatype.XMLGregorianCalendar dtTerm;

            /** Código de motivo do término do TSVE. */
            private String mtvDesligTSV;

            /** Grupo de informações da sucessão de vínculo trabalhista */
            private Tipos.T_sucessaoVinc sucessaoVinc;

            /** Bases de cálculo e valores do FGTS */
            private InfoBaseFGTS infoBaseFGTS;

            /**
             * Informação sobre processo judicial que suspende a exigibilidade da Contribuição
             * Social Rescisória
             */
            private ProcCS procCS;

            /**
             * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
             * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
             *
             * @return Conteúdo do campo matricula
             */
            public String getMatricula() {
              return this.matricula;
            }

            /**
             * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
             * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
             *
             * <p>Evento de origem: S-1200, S-2299, S-2399 ou S-3000.
             *
             * <p>Validação: a) Se o evento de origem for S-1200/S-2299/S-2399, retornar a matrícula
             * informada nesse evento;
             *
             * <p>b) Se o evento de origem for S-3000, retornar a matrícula informada no evento
             * objeto da exclusão.
             *
             * @param matricula Valor para atribuir ao campo matricula
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setMatricula(String matricula) {
              this.matricula = matricula;
              return this;
            }

            /**
             * Preencher com o código da categoria do trabalhador, conforme Tabela 01.
             *
             * @return Conteúdo do campo codCateg
             */
            public Integer getCodCateg() {
              return this.codCateg;
            }

            /**
             * Preencher com o código da categoria do trabalhador, conforme Tabela 01.
             *
             * <p>Evento de origem: S-1200, S-2299, S-2399 ou S-3000.
             *
             * <p>Validação: a) Se o evento de origem for S-1200, retornar o código de categoria
             * informado nesse evento;
             *
             * <p>b) Se o evento de origem for S-2299 ou S-2399, retornar o código de categoria
             * existente no Registro de Eventos Trabalhistas - RET;
             *
             * <p>c) Se o evento de origem for S-3000 (referente a exclusão de S-1200), retornar o
             * código de categoria informado no evento S-1200 (objeto da exclusão);
             *
             * <p>d) Se o evento de origem for S-3000 (referente a exclusão de S-2299 ou S-2399),
             * retornar o código de categoria existente no RET relativo ao contrato informado em
             * S-2299 ou S-2399 (objeto da exclusão).
             *
             * @param codCateg Valor para atribuir ao campo codCateg
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setCodCateg(Integer codCateg) {
              this.codCateg = codCateg;
              return this;
            }

            /**
             * Preencher com o código correspondente à categoria de origem do dirigente sindical ou
             * do trabalhador cedido.
             *
             * @return Conteúdo do campo categOrig
             */
            public Integer getCategOrig() {
              return this.categOrig;
            }

            /**
             * Preencher com o código correspondente à categoria de origem do dirigente sindical ou
             * do trabalhador cedido.
             *
             * <p>Origem: campo
             * {infoDirigenteSindical/categOrig}(2300_infoTSVInicio_infoComplementares_infoDirigenteSindical_categOrig)
             * ou
             * {infoTrabCedido/categOrig}(2300_infoTSVInicio_infoComplementares_infoTrabCedido_categOrig)
             * de S-2300.
             *
             * @param categOrig Valor para atribuir ao campo categOrig
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setCategOrig(Integer categOrig) {
              this.categOrig = categOrig;
              return this;
            }

            /**
             * Tipo de regime trabalhista.
             *
             * @return Conteúdo do campo tpRegTrab
             */
            public String getTpRegTrab() {
              return this.tpRegTrab;
            }

            /**
             * Tipo de regime trabalhista.
             *
             * <p>Validação: Deve corresponder ao tipo de regime trabalhista existente no RET.
             *
             * @param tpRegTrab Valor para atribuir ao campo tpRegTrab
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setTpRegTrab(String tpRegTrab) {
              if (!"1".equals(tpRegTrab) && !"2".equals(tpRegTrab))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpRegTrab) + " inválido para o campo tpRegTrab");
              this.tpRegTrab = tpRegTrab;
              return this;
            }
            /**
             * CLT - Consolidação das Leis de Trabalho e legislações trabalhistas específicas
             *
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setTpRegTrab_1() {
              this.tpRegTrab = "1";
              return this;
            }
            /**
             * Estatutário/legislações específicas (servidor temporário, militar, agente político,
             * etc.)
             *
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setTpRegTrab_2() {
              this.tpRegTrab = "2";
              return this;
            }

            /**
             * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial
             * devidas pela empresa sucessora a empregados desligados ainda na sucedida.
             *
             * @return Conteúdo do campo remunSuc
             */
            public String getRemunSuc() {
              return this.remunSuc;
            }

            /**
             * Indicar se a remuneração é relativa a verbas de natureza salarial ou não salarial
             * devidas pela empresa sucessora a empregados desligados ainda na sucedida.
             *
             * <p>Evento de origem: S-1200.
             *
             * @param remunSuc Valor para atribuir ao campo remunSuc
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setRemunSuc(String remunSuc) {
              if (!"S".equals(remunSuc) && !"N".equals(remunSuc))
                throw new RuntimeException(
                    "Valor " + String.valueOf(remunSuc) + " inválido para o campo remunSuc");
              this.remunSuc = remunSuc;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setRemunSuc_S() {
              this.remunSuc = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setRemunSuc_N() {
              this.remunSuc = "N";
              return this;
            }

            /**
             * Preencher com a data de desligamento do vínculo (último dia trabalhado).
             *
             * @return Conteúdo do campo dtDeslig
             */
            public javax.xml.datatype.XMLGregorianCalendar getDtDeslig() {
              return this.dtDeslig;
            }

            /**
             * Preencher com a data de desligamento do vínculo (último dia trabalhado).
             *
             * <p>Validação: Deve corresponder à data de desligamento existente no RET. Não retornar
             * caso haja reintegração com data posterior ao desligamento.
             *
             * @param dtDeslig Valor para atribuir ao campo dtDeslig
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setDtDeslig(javax.xml.datatype.XMLGregorianCalendar dtDeslig) {
              this.dtDeslig = dtDeslig;
              return this;
            }

            /**
             * Código de motivo do desligamento, conforme Tabela 19.
             *
             * @return Conteúdo do campo mtvDeslig
             */
            public String getMtvDeslig() {
              return this.mtvDeslig;
            }

            /**
             * Código de motivo do desligamento, conforme Tabela 19.
             *
             * <p>Validação: Deve corresponder ao motivo do desligamento existente no RET. Não
             * retornar caso haja reintegração com data posterior ao desligamento.
             *
             * @param mtvDeslig Valor para atribuir ao campo mtvDeslig
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setMtvDeslig(String mtvDeslig) {
              this.mtvDeslig = mtvDeslig;
              return this;
            }

            /**
             * Data do término.
             *
             * @return Conteúdo do campo dtTerm
             */
            public javax.xml.datatype.XMLGregorianCalendar getDtTerm() {
              return this.dtTerm;
            }

            /**
             * Data do término.
             *
             * <p>Validação: Deve corresponder à data do término existente no RET.
             *
             * @param dtTerm Valor para atribuir ao campo dtTerm
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setDtTerm(javax.xml.datatype.XMLGregorianCalendar dtTerm) {
              this.dtTerm = dtTerm;
              return this;
            }

            /**
             * Código de motivo do término do TSVE.
             *
             * @return Conteúdo do campo mtvDesligTSV
             */
            public String getMtvDesligTSV() {
              return this.mtvDesligTSV;
            }

            /**
             * Código de motivo do término do TSVE.
             *
             * <p>Validação: Deve corresponder ao motivo do término existente no RET.
             *
             * @param mtvDesligTSV Valor para atribuir ao campo mtvDesligTSV
             * @return O próprio InfoTrabFGTS para continuar populando outros campos
             */
            public InfoTrabFGTS<T> setMtvDesligTSV(String mtvDesligTSV) {
              this.mtvDesligTSV = mtvDesligTSV;
              return this;
            }

            /**
             * Grupo de informações da sucessão de vínculo trabalhista
             *
             * @return Conteúdo do campo sucessaoVinc
             */
            public Tipos.T_sucessaoVinc getSucessaoVinc() {
              return this.sucessaoVinc;
            }

            /**
             * Grupo de informações da sucessão de vínculo trabalhista
             *
             * <p>DESCRICAO_COMPLETA:Grupo de informações da sucessão de vínculo trabalhista.
             *
             * <p>Evento de origem: S-1200.
             *
             * <p>CONDICAO_GRUPO: O (se {remunSuc}(../remunSuc) = [S]); N (nos demais casos)
             *
             * @return O objeto Tipos.T_sucessaoVinc para população dos campos filhos
             */
            public Tipos.T_sucessaoVinc<InfoTrabFGTS<T>> setSucessaoVinc() {
              if (this.sucessaoVinc == null) {
                this.sucessaoVinc = new Tipos.T_sucessaoVinc(this);
              }
              return this.sucessaoVinc;
            }

            /**
             * Bases de cálculo e valores do FGTS
             *
             * @return Conteúdo do campo infoBaseFGTS
             */
            public InfoBaseFGTS getInfoBaseFGTS() {
              return this.infoBaseFGTS;
            }

            /**
             * Bases de cálculo e valores do FGTS
             *
             * <p>DESCRICAO_COMPLETA:Informações referentes a bases de cálculo e valores do FGTS.
             *
             * <p>CONDICAO_GRUPO: OC ((se {codCateg}(../codCateg) = [1XX, 301, 302, 303, 304, 306,
             * 307, 309, 310, 312] com {tpRegTrab}(../tpRegTrab) = [1] ou não informado) OU (se
             * {codCateg}(../codCateg) = [201, 202, 721]) OU (se {codCateg}(../codCateg) = [401,
             * 410] com {categOrig}(../categOrig) = [1XX, 301, 302, 303, 304, 306, 307, 309, 310,
             * 312] ou não informada e com {tpRegTrab}(../tpRegTrab) = [1] ou não informado)); N
             * (nos demais casos)
             *
             * @return O objeto InfoBaseFGTS para população dos campos filhos
             */
            public InfoBaseFGTS<InfoTrabFGTS<T>> setInfoBaseFGTS() {
              if (this.infoBaseFGTS == null) {
                this.infoBaseFGTS = new InfoBaseFGTS(this);
              }
              return this.infoBaseFGTS;
            }

            /**
             * Informação sobre processo judicial que suspende a exigibilidade da Contribuição
             * Social Rescisória
             *
             * @return Conteúdo do campo procCS
             */
            public ProcCS getProcCS() {
              return this.procCS;
            }

            /**
             * Informação sobre processo judicial que suspende a exigibilidade da Contribuição
             * Social Rescisória
             *
             * <p>DESCRICAO_COMPLETA:Informação sobre processo judicial que suspende a exigibilidade
             * da Contribuição Social Rescisória.
             *
             * <p>Evento de origem: S-2299.
             *
             * <p>CONDICAO_GRUPO: OC
             *
             * @return O objeto ProcCS para população dos campos filhos
             */
            public ProcCS<InfoTrabFGTS<T>> setProcCS() {
              if (this.procCS == null) {
                this.procCS = new ProcCS(this);
              }
              return this.procCS;
            }

            public InfoTrabFGTS(Object pai) {
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
             * Bases de cálculo e valores do FGTS
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "basePerApur",
                  "infoBasePerAntE",
                })
            public static class InfoBaseFGTS<T> {

              /**
               * Bases de cálculo e valores, exceto se {tpAcConv} = [E]
               *
               * <p>- Esse campo pode ser repetido até 99 vezes
               */
              private java.util.List<BasePerApur> basePerApur;

              /**
               * Informações sobre bases e valores do FGTS quando {tpAcConv} = [E]
               *
               * <p>- Esse campo pode ser repetido até 180 vezes
               */
              private java.util.List<InfoBasePerAntE> infoBasePerAntE;

              /**
               * Bases de cálculo e valores, exceto se {tpAcConv} = [E]
               *
               * @return Conteúdo do campo basePerApur
               */
              public java.util.List<BasePerApur> getBasePerApur() {
                return this.basePerApur;
              }

              /**
               * Bases de cálculo e valores, exceto se {tpAcConv} = [E]
               *
               * <p>- Esse campo pode ser repetido até 99 vezes
               *
               * <p>DESCRICAO_COMPLETA:Informações sobre bases de cálculo e valores do FGTS
               * referentes à remuneração do período de apuração e de períodos anteriores, exceto se
               * {tpAcConv} = [E].
               *
               * <p>Evento de origem: S-1200, S-2299 ou S-2399.
               *
               * <p>CHAVE_GRUPO: {tpValor}, {indIncid}
               *
               * <p>CONDICAO_GRUPO: OC
               *
               * @return O objeto BasePerApur para população dos campos filhos
               */
              public BasePerApur<InfoBaseFGTS<T>> setBasePerApur_Next() {
                if (this.basePerApur == null) {
                  this.basePerApur = new java.util.ArrayList<>();
                }
                BasePerApur toAdd = new BasePerApur(this);
                this.basePerApur.add(toAdd);
                return toAdd;
              }

              /**
               * Informações sobre bases e valores do FGTS quando {tpAcConv} = [E]
               *
               * @return Conteúdo do campo infoBasePerAntE
               */
              public java.util.List<InfoBasePerAntE> getInfoBasePerAntE() {
                return this.infoBasePerAntE;
              }

              /**
               * Informações sobre bases e valores do FGTS quando {tpAcConv} = [E]
               *
               * <p>- Esse campo pode ser repetido até 180 vezes
               *
               * <p>DESCRICAO_COMPLETA:Informações referentes a bases de cálculo e valores do FGTS
               * de períodos anteriores quando {tpAcConv} = [E].
               *
               * <p>CHAVE_GRUPO: {perRef}
               *
               * <p>CONDICAO_GRUPO: OC
               *
               * @return O objeto InfoBasePerAntE para população dos campos filhos
               */
              public InfoBasePerAntE<InfoBaseFGTS<T>> setInfoBasePerAntE_Next() {
                if (this.infoBasePerAntE == null) {
                  this.infoBasePerAntE = new java.util.ArrayList<>();
                }
                InfoBasePerAntE toAdd = new InfoBasePerAntE(this);
                this.infoBasePerAntE.add(toAdd);
                return toAdd;
              }

              public InfoBaseFGTS(Object pai) {
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
               * Bases de cálculo e valores, exceto se {tpAcConv} = [E]
               *
               * @param <T> Tipo do retorno do método finish()
               */
              @XmlAccessorType(XmlAccessType.FIELD)
              @XmlType(
                  name = "",
                  propOrder = {
                    "tpValor",
                    "indIncid",
                    "remFGTS",
                    "dpsFGTS",
                    "detRubrSusp",
                  })
              public static class BasePerApur<T> {

                /** Tipo de valor que influi na apuração do FGTS. */
                private String tpValor;

                /** Indicativo de incidência de FGTS. */
                private String indIncid;

                /**
                 * Remuneração (valor da base de cálculo) do FGTS, conforme definido nos campos
                 * {tpValor}(./tpValor) e {indIncid}(./indIncid).
                 */
                private Double remFGTS;

                /** Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador. */
                private Double dpsFGTS;

                /**
                 * Detalhamento da(s) rubrica(s) com incidência de FGTS suspensa
                 *
                 * <p>- Esse campo pode ser repetido indefinidas vezes
                 */
                private java.util.List<T_detRubrSusp> detRubrSusp;

                /**
                 * Tipo de valor que influi na apuração do FGTS.
                 *
                 * @return Conteúdo do campo tpValor
                 */
                public String getTpValor() {
                  return this.tpValor;
                }

                /**
                 * Tipo de valor que influi na apuração do FGTS.
                 *
                 * @param tpValor Valor para atribuir ao campo tpValor
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor(String tpValor) {
                  if (!"11".equals(tpValor)
                      && !"12".equals(tpValor)
                      && !"13".equals(tpValor)
                      && !"14".equals(tpValor)
                      && !"15".equals(tpValor)
                      && !"16".equals(tpValor)
                      && !"17".equals(tpValor)
                      && !"18".equals(tpValor)
                      && !"21".equals(tpValor)
                      && !"22".equals(tpValor)
                      && !"23".equals(tpValor)
                      && !"24".equals(tpValor)
                      && !"25".equals(tpValor)
                      && !"26".equals(tpValor)
                      && !"27".equals(tpValor)
                      && !"28".equals(tpValor)
                      && !"29".equals(tpValor)
                      && !"30".equals(tpValor)
                      && !"31".equals(tpValor)
                      && !"32".equals(tpValor)
                      && !"41".equals(tpValor)
                      && !"42".equals(tpValor)
                      && !"43".equals(tpValor)
                      && !"44".equals(tpValor)
                      && !"45".equals(tpValor)
                      && !"46".equals(tpValor)
                      && !"47".equals(tpValor)
                      && !"48".equals(tpValor)
                      && !"49".equals(tpValor)
                      && !"50".equals(tpValor))
                    throw new RuntimeException(
                        "Valor " + String.valueOf(tpValor) + " inválido para o campo tpValor");
                  this.tpValor = tpValor;
                  return this;
                }
                /**
                 * FGTS mensal
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_11() {
                  this.tpValor = "11";
                  return this;
                }
                /**
                 * FGTS 13° salário
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_12() {
                  this.tpValor = "12";
                  return this;
                }
                /**
                 * FGTS dissídio mensal
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_13() {
                  this.tpValor = "13";
                  return this;
                }
                /**
                 * FGTS dissídio 13º salário
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_14() {
                  this.tpValor = "14";
                  return this;
                }
                /**
                 * FGTS mensal - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_15() {
                  this.tpValor = "15";
                  return this;
                }
                /**
                 * FGTS 13° salário - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_16() {
                  this.tpValor = "16";
                  return this;
                }
                /**
                 * FGTS dissídio mensal - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_17() {
                  this.tpValor = "17";
                  return this;
                }
                /**
                 * FGTS dissídio 13º salário - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_18() {
                  this.tpValor = "18";
                  return this;
                }
                /**
                 * FGTS mês da rescisão
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_21() {
                  this.tpValor = "21";
                  return this;
                }
                /**
                 * FGTS 13° salário rescisório
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_22() {
                  this.tpValor = "22";
                  return this;
                }
                /**
                 * FGTS aviso prévio indenizado
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_23() {
                  this.tpValor = "23";
                  return this;
                }
                /**
                 * FGTS dissídio mês da rescisão
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_24() {
                  this.tpValor = "24";
                  return this;
                }
                /**
                 * FGTS dissídio 13º salário rescisório
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_25() {
                  this.tpValor = "25";
                  return this;
                }
                /**
                 * FGTS dissídio aviso prévio indenizado
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_26() {
                  this.tpValor = "26";
                  return this;
                }
                /**
                 * FGTS mês da rescisão - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_27() {
                  this.tpValor = "27";
                  return this;
                }
                /**
                 * FGTS 13° salário rescisório - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_28() {
                  this.tpValor = "28";
                  return this;
                }
                /**
                 * FGTS aviso prévio indenizado - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_29() {
                  this.tpValor = "29";
                  return this;
                }
                /**
                 * FGTS dissídio mês da rescisão - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_30() {
                  this.tpValor = "30";
                  return this;
                }
                /**
                 * FGTS dissídio 13° salário rescisório - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_31() {
                  this.tpValor = "31";
                  return this;
                }
                /**
                 * FGTS dissídio aviso prévio indenizado - Aprendiz/Contrato Verde e Amarelo
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_32() {
                  this.tpValor = "32";
                  return this;
                }
                /**
                 * FGTS mensal - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_41() {
                  this.tpValor = "41";
                  return this;
                }
                /**
                 * FGTS 13° salário - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_42() {
                  this.tpValor = "42";
                  return this;
                }
                /**
                 * FGTS dissídio mensal - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_43() {
                  this.tpValor = "43";
                  return this;
                }
                /**
                 * FGTS dissídio 13º salário - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_44() {
                  this.tpValor = "44";
                  return this;
                }
                /**
                 * FGTS mês da rescisão - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_45() {
                  this.tpValor = "45";
                  return this;
                }
                /**
                 * FGTS 13° salário rescisório - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_46() {
                  this.tpValor = "46";
                  return this;
                }
                /**
                 * FGTS aviso prévio indenizado - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_47() {
                  this.tpValor = "47";
                  return this;
                }
                /**
                 * FGTS dissídio mês da rescisão - Indenização compensatória do empregado doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_48() {
                  this.tpValor = "48";
                  return this;
                }
                /**
                 * FGTS dissídio 13º salário rescisório - Indenização compensatória do empregado
                 * doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_49() {
                  this.tpValor = "49";
                  return this;
                }
                /**
                 * FGTS dissídio aviso prévio indenizado - Indenização compensatória do empregado
                 * doméstico
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setTpValor_50() {
                  this.tpValor = "50";
                  return this;
                }

                /**
                 * Indicativo de incidência de FGTS.
                 *
                 * @return Conteúdo do campo indIncid
                 */
                public String getIndIncid() {
                  return this.indIncid;
                }

                /**
                 * Indicativo de incidência de FGTS.
                 *
                 * <p>Validação: Se {codIncFGTS}(1010_infoRubrica_inclusao_dadosRubrica_codIncFGTS)
                 * em S-1010 for igual a [11, 12, 21], deve ser retornado [1].
                 *
                 * <p>Se {codIncFGTS}(1010_infoRubrica_inclusao_dadosRubrica_codIncFGTS) em S-1010
                 * for igual a [91, 92, 93], deve ser retornado [9].
                 *
                 * @param indIncid Valor para atribuir ao campo indIncid
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setIndIncid(String indIncid) {
                  if (!"1".equals(indIncid) && !"9".equals(indIncid))
                    throw new RuntimeException(
                        "Valor " + String.valueOf(indIncid) + " inválido para o campo indIncid");
                  this.indIncid = indIncid;
                  return this;
                }
                /**
                 * Normal (incidência de FGTS)
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setIndIncid_1() {
                  this.indIncid = "1";
                  return this;
                }
                /**
                 * Incidência de FGTS suspensa em decorrência de decisão judicial
                 *
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setIndIncid_9() {
                  this.indIncid = "9";
                  return this;
                }

                /**
                 * Remuneração (valor da base de cálculo) do FGTS, conforme definido nos campos
                 * {tpValor}(./tpValor) e {indIncid}(./indIncid).
                 *
                 * @return Conteúdo do campo remFGTS
                 */
                public Double getRemFGTS() {
                  return this.remFGTS;
                }

                /**
                 * Remuneração (valor da base de cálculo) do FGTS, conforme definido nos campos
                 * {tpValor}(./tpValor) e {indIncid}(./indIncid).
                 *
                 * <p>Validação: Deve ser maior que 0 (zero).
                 *
                 * <p>Deve corresponder ao somatório dos valores informados no campo {vrRubr} em
                 * S-1200 e S-2299 (grupos {infoPerApur} e {infoPerAnt}, quando {tpAcConv} for
                 * diferente de [E]), e também em S-2399, devendo somar os valores das rubricas cujo
                 * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a
                 * [1, 3] e subtrair os valores das rubricas cujo
                 * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a
                 * [2, 4], observando a Tabela 23.
                 *
                 * @param remFGTS Valor para atribuir ao campo remFGTS
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setRemFGTS(Double remFGTS) {
                  this.remFGTS = remFGTS;
                  return this;
                }

                /**
                 * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
                 *
                 * @return Conteúdo do campo dpsFGTS
                 */
                public Double getDpsFGTS() {
                  return this.dpsFGTS;
                }

                /**
                 * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
                 *
                 * <p>Validação: Deve ser maior que 0 (zero) e informado somente se
                 * {indIncid}(./indIncid) = [1].
                 *
                 * <p>Deve corresponder à multiplicação de {remFGTS}(./remFGTS) pela alíquota
                 * abaixo:
                 *
                 * <p>a) Se {tpValor}(./tpValor) = [11, 12, 13, 14, 21, 22, 23, 24, 25, 26],
                 * alíquota de 8%;
                 *
                 * <p>b) Se {tpValor}(./tpValor) = [15, 16, 17, 18, 27, 28, 29, 30, 31, 32],
                 * alíquota de 2%;
                 *
                 * <p>c) Se {tpValor}(./tpValor) = [41, 42, 43, 44, 45, 46, 47, 48, 49, 50],
                 * alíquota de 3,2%.
                 *
                 * @param dpsFGTS Valor para atribuir ao campo dpsFGTS
                 * @return O próprio BasePerApur para continuar populando outros campos
                 */
                public BasePerApur<T> setDpsFGTS(Double dpsFGTS) {
                  this.dpsFGTS = dpsFGTS;
                  return this;
                }

                /**
                 * Detalhamento da(s) rubrica(s) com incidência de FGTS suspensa
                 *
                 * @return Conteúdo do campo detRubrSusp
                 */
                public java.util.List<T_detRubrSusp> getDetRubrSusp() {
                  return this.detRubrSusp;
                }

                /**
                 * Detalhamento da(s) rubrica(s) com incidência de FGTS suspensa
                 *
                 * <p>- Esse campo pode ser repetido indefinidas vezes
                 *
                 * <p>DESCRICAO_COMPLETA:Detalhamento da(s) rubrica(s) com incidência de FGTS
                 * suspensa em decorrência de decisão judicial.
                 *
                 * <p>CHAVE_GRUPO: {codRubr}, {ideTabRubr}
                 *
                 * <p>CONDICAO_GRUPO: O (se {indIncid}(../indIncid) = [9]); N (nos demais casos)
                 *
                 * @return O objeto T_detRubrSusp para população dos campos filhos
                 */
                public T_detRubrSusp<BasePerApur<T>> setDetRubrSusp_Next() {
                  if (this.detRubrSusp == null) {
                    this.detRubrSusp = new java.util.ArrayList<>();
                  }
                  T_detRubrSusp toAdd = new T_detRubrSusp(this);
                  this.detRubrSusp.add(toAdd);
                  return toAdd;
                }

                public BasePerApur(Object pai) {
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

              /**
               * Informações sobre bases e valores do FGTS quando {tpAcConv} = [E]
               *
               * @param <T> Tipo do retorno do método finish()
               */
              @XmlAccessorType(XmlAccessType.FIELD)
              @XmlType(
                  name = "",
                  propOrder = {
                    "perRef",
                    "basePerAntE",
                  })
              public static class InfoBasePerAntE<T> {

                /** Informar o período ao qual se refere a remuneração, no formato AAAA-MM. */
                private String perRef;

                /**
                 * Bases de cálculo e valores quando {tpAcConv} = [E]
                 *
                 * <p>- Esse campo pode ser repetido até 99 vezes
                 */
                private java.util.List<BasePerAntE> basePerAntE;

                /**
                 * Informar o período ao qual se refere a remuneração, no formato AAAA-MM.
                 *
                 * @return Conteúdo do campo perRef
                 */
                public String getPerRef() {
                  return this.perRef;
                }

                /**
                 * Informar o período ao qual se refere a remuneração, no formato AAAA-MM.
                 *
                 * <p>Evento de origem: S-1200 ou S-2299.
                 *
                 * <p>Validação: Deve corresponder ao período informado no evento de origem.
                 *
                 * @param perRef Valor para atribuir ao campo perRef
                 * @return O próprio InfoBasePerAntE para continuar populando outros campos
                 */
                public InfoBasePerAntE<T> setPerRef(String perRef) {
                  this.perRef = perRef;
                  return this;
                }

                /**
                 * Bases de cálculo e valores quando {tpAcConv} = [E]
                 *
                 * @return Conteúdo do campo basePerAntE
                 */
                public java.util.List<BasePerAntE> getBasePerAntE() {
                  return this.basePerAntE;
                }

                /**
                 * Bases de cálculo e valores quando {tpAcConv} = [E]
                 *
                 * <p>- Esse campo pode ser repetido até 99 vezes
                 *
                 * <p>DESCRICAO_COMPLETA:Informações sobre bases de cálculo e valores do FGTS
                 * referentes à remuneração de períodos anteriores quando {tpAcConv} = [E].
                 *
                 * <p>CHAVE_GRUPO: {tpValorE}, {indIncidE}
                 *
                 * @return O objeto BasePerAntE para população dos campos filhos
                 */
                public BasePerAntE<InfoBasePerAntE<T>> setBasePerAntE_Next() {
                  if (this.basePerAntE == null) {
                    this.basePerAntE = new java.util.ArrayList<>();
                  }
                  BasePerAntE toAdd = new BasePerAntE(this);
                  this.basePerAntE.add(toAdd);
                  return toAdd;
                }

                public InfoBasePerAntE(Object pai) {
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
                 * Bases de cálculo e valores quando {tpAcConv} = [E]
                 *
                 * @param <T> Tipo do retorno do método finish()
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(
                    name = "",
                    propOrder = {
                      "tpValorE",
                      "indIncidE",
                      "remFGTSE",
                      "dpsFGTSE",
                      "detRubrSusp",
                    })
                public static class BasePerAntE<T> {

                  /** Tipo de valor que influi na apuração do FGTS. */
                  private String tpValorE;

                  /** Indicativo de incidência de FGTS. */
                  private String indIncidE;

                  /**
                   * Remuneração (valor da base de cálculo) do FGTS, conforme definido nos campos
                   * {tpValorE}(./tpValorE) e {indIncidE}(./indIncidE).
                   */
                  private Double remFGTSE;

                  /** Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador. */
                  private Double dpsFGTSE;

                  /**
                   * Detalhamento da(s) rubrica(s) com incidência de FGTS suspensa
                   *
                   * <p>- Esse campo pode ser repetido indefinidas vezes
                   */
                  private java.util.List<T_detRubrSusp> detRubrSusp;

                  /**
                   * Tipo de valor que influi na apuração do FGTS.
                   *
                   * @return Conteúdo do campo tpValorE
                   */
                  public String getTpValorE() {
                    return this.tpValorE;
                  }

                  /**
                   * Tipo de valor que influi na apuração do FGTS.
                   *
                   * @param tpValorE Valor para atribuir ao campo tpValorE
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE(String tpValorE) {
                    if (!"13".equals(tpValorE)
                        && !"14".equals(tpValorE)
                        && !"17".equals(tpValorE)
                        && !"18".equals(tpValorE)
                        && !"24".equals(tpValorE)
                        && !"25".equals(tpValorE)
                        && !"26".equals(tpValorE)
                        && !"30".equals(tpValorE)
                        && !"31".equals(tpValorE)
                        && !"32".equals(tpValorE)
                        && !"43".equals(tpValorE)
                        && !"44".equals(tpValorE)
                        && !"48".equals(tpValorE)
                        && !"49".equals(tpValorE)
                        && !"50".equals(tpValorE))
                      throw new RuntimeException(
                          "Valor " + String.valueOf(tpValorE) + " inválido para o campo tpValorE");
                    this.tpValorE = tpValorE;
                    return this;
                  }
                  /**
                   * FGTS dissídio mensal
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_13() {
                    this.tpValorE = "13";
                    return this;
                  }
                  /**
                   * FGTS dissídio 13º salário
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_14() {
                    this.tpValorE = "14";
                    return this;
                  }
                  /**
                   * FGTS dissídio mensal - Aprendiz/Contrato Verde e Amarelo
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_17() {
                    this.tpValorE = "17";
                    return this;
                  }
                  /**
                   * FGTS dissídio 13º salário - Aprendiz/Contrato Verde e Amarelo
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_18() {
                    this.tpValorE = "18";
                    return this;
                  }
                  /**
                   * FGTS dissídio mês da rescisão
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_24() {
                    this.tpValorE = "24";
                    return this;
                  }
                  /**
                   * FGTS dissídio 13º salário rescisório
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_25() {
                    this.tpValorE = "25";
                    return this;
                  }
                  /**
                   * FGTS dissídio aviso prévio indenizado
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_26() {
                    this.tpValorE = "26";
                    return this;
                  }
                  /**
                   * FGTS dissídio mês da rescisão - Aprendiz/Contrato Verde e Amarelo
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_30() {
                    this.tpValorE = "30";
                    return this;
                  }
                  /**
                   * FGTS dissídio 13° salário rescisório - Aprendiz/Contrato Verde e Amarelo
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_31() {
                    this.tpValorE = "31";
                    return this;
                  }
                  /**
                   * FGTS dissídio aviso prévio indenizado - Aprendiz/Contrato Verde e Amarelo
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_32() {
                    this.tpValorE = "32";
                    return this;
                  }
                  /**
                   * FGTS dissídio mensal - Indenização compensatória do empregado doméstico
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_43() {
                    this.tpValorE = "43";
                    return this;
                  }
                  /**
                   * FGTS dissídio 13º salário - Indenização compensatória do empregado doméstico
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_44() {
                    this.tpValorE = "44";
                    return this;
                  }
                  /**
                   * FGTS dissídio mês da rescisão - Indenização compensatória do empregado
                   * doméstico
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_48() {
                    this.tpValorE = "48";
                    return this;
                  }
                  /**
                   * FGTS dissídio 13º salário rescisório - Indenização compensatória do empregado
                   * doméstico
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_49() {
                    this.tpValorE = "49";
                    return this;
                  }
                  /**
                   * FGTS dissídio aviso prévio indenizado - Indenização compensatória do empregado
                   * doméstico
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setTpValorE_50() {
                    this.tpValorE = "50";
                    return this;
                  }

                  /**
                   * Indicativo de incidência de FGTS.
                   *
                   * @return Conteúdo do campo indIncidE
                   */
                  public String getIndIncidE() {
                    return this.indIncidE;
                  }

                  /**
                   * Indicativo de incidência de FGTS.
                   *
                   * <p>Validação: Se
                   * {codIncFGTS}(1010_infoRubrica_inclusao_dadosRubrica_codIncFGTS) em S-1010 for
                   * igual a [11, 12, 21], deve ser retornado [1].
                   *
                   * <p>Se {codIncFGTS}(1010_infoRubrica_inclusao_dadosRubrica_codIncFGTS) em S-1010
                   * for igual a [91, 92, 93], deve ser retornado [9].
                   *
                   * @param indIncidE Valor para atribuir ao campo indIncidE
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setIndIncidE(String indIncidE) {
                    if (!"1".equals(indIncidE) && !"9".equals(indIncidE))
                      throw new RuntimeException(
                          "Valor "
                              + String.valueOf(indIncidE)
                              + " inválido para o campo indIncidE");
                    this.indIncidE = indIncidE;
                    return this;
                  }
                  /**
                   * Normal (incidência de FGTS)
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setIndIncidE_1() {
                    this.indIncidE = "1";
                    return this;
                  }
                  /**
                   * Incidência de FGTS suspensa em decorrência de decisão judicial
                   *
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setIndIncidE_9() {
                    this.indIncidE = "9";
                    return this;
                  }

                  /**
                   * Remuneração (valor da base de cálculo) do FGTS, conforme definido nos campos
                   * {tpValorE}(./tpValorE) e {indIncidE}(./indIncidE).
                   *
                   * @return Conteúdo do campo remFGTSE
                   */
                  public Double getRemFGTSE() {
                    return this.remFGTSE;
                  }

                  /**
                   * Remuneração (valor da base de cálculo) do FGTS, conforme definido nos campos
                   * {tpValorE}(./tpValorE) e {indIncidE}(./indIncidE).
                   *
                   * <p>Validação: Deve ser maior que 0 (zero).
                   *
                   * <p>Deve corresponder ao somatório dos valores informados no campo {vrRubr} em
                   * S-1200 e S-2299 (grupo {infoPerAnt}, quando {tpAcConv} = [E]), devendo somar os
                   * valores das rubricas cujo
                   * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a
                   * [1, 3] e subtrair os valores das rubricas cujo
                   * {tpRubr}(1010_infoRubrica_inclusao_dadosRubrica_tpRubr) em S-1010 seja igual a
                   * [2, 4], observando a Tabela 23.
                   *
                   * @param remFGTSE Valor para atribuir ao campo remFGTSE
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setRemFGTSE(Double remFGTSE) {
                    this.remFGTSE = remFGTSE;
                    return this;
                  }

                  /**
                   * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
                   *
                   * @return Conteúdo do campo dpsFGTSE
                   */
                  public Double getDpsFGTSE() {
                    return this.dpsFGTSE;
                  }

                  /**
                   * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
                   *
                   * <p>Validação: Deve ser maior que 0 (zero) e informado somente se
                   * {indIncidE}(./indIncidE) = [1].
                   *
                   * <p>Deve corresponder à multiplicação de {remFGTSE}(./remFGTSE) pela alíquota
                   * abaixo:
                   *
                   * <p>a) Se {tpValorE}(./tpValorE) = [13, 14, 24, 25, 26], alíquota de 8%;
                   *
                   * <p>b) Se {tpValorE}(./tpValorE) = [17, 18, 30, 31, 32], alíquota de 2%;
                   *
                   * <p>c) Se {tpValorE}(./tpValorE) = [43, 44, 48, 49, 50], alíquota de 3,2%.
                   *
                   * @param dpsFGTSE Valor para atribuir ao campo dpsFGTSE
                   * @return O próprio BasePerAntE para continuar populando outros campos
                   */
                  public BasePerAntE<T> setDpsFGTSE(Double dpsFGTSE) {
                    this.dpsFGTSE = dpsFGTSE;
                    return this;
                  }

                  /**
                   * Detalhamento da(s) rubrica(s) com incidência de FGTS suspensa
                   *
                   * @return Conteúdo do campo detRubrSusp
                   */
                  public java.util.List<T_detRubrSusp> getDetRubrSusp() {
                    return this.detRubrSusp;
                  }

                  /**
                   * Detalhamento da(s) rubrica(s) com incidência de FGTS suspensa
                   *
                   * <p>- Esse campo pode ser repetido indefinidas vezes
                   *
                   * <p>DESCRICAO_COMPLETA:Detalhamento da(s) rubrica(s) com incidência de FGTS
                   * suspensa em decorrência de decisão judicial.
                   *
                   * <p>CHAVE_GRUPO: {codRubr}, {ideTabRubr}
                   *
                   * <p>CONDICAO_GRUPO: O (se {indIncidE}(../indIncidE) = [9]); N (nos demais casos)
                   *
                   * @return O objeto T_detRubrSusp para população dos campos filhos
                   */
                  public T_detRubrSusp<BasePerAntE<T>> setDetRubrSusp_Next() {
                    if (this.detRubrSusp == null) {
                      this.detRubrSusp = new java.util.ArrayList<>();
                    }
                    T_detRubrSusp toAdd = new T_detRubrSusp(this);
                    this.detRubrSusp.add(toAdd);
                    return toAdd;
                  }

                  public BasePerAntE(Object pai) {
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

            /**
             * Informação sobre processo judicial que suspende a exigibilidade da Contribuição
             * Social Rescisória
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "nrProcJud",
                })
            public static class ProcCS<T> {

              /** Informar o número de processo judicial cadastrado. */
              private String nrProcJud;

              /**
               * Informar o número de processo judicial cadastrado.
               *
               * @return Conteúdo do campo nrProcJud
               */
              public String getNrProcJud() {
                return this.nrProcJud;
              }

              /**
               * Informar o número de processo judicial cadastrado.
               *
               * @param nrProcJud Valor para atribuir ao campo nrProcJud
               * @return O próprio ProcCS para continuar populando outros campos
               */
              public ProcCS<T> setNrProcJud(String nrProcJud) {
                this.nrProcJud = nrProcJud;
                return this;
              }

              public ProcCS(Object pai) {
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
      }
    }
  }

  /**
   * Detalhamento da(s) rubrica(s) com incidência de FGTS suspensa
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "codRubr",
        "ideTabRubr",
        "vrRubr",
        "ideProcessoFGTS",
      })
  public static class T_detRubrSusp<T> {

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     */
    private String codRubr;

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     */
    private String ideTabRubr;

    /** Valor total da rubrica. */
    private Double vrRubr;

    /**
     * Identificação de processo - Incidência de FGTS
     *
     * <p>- Esse campo pode ser repetido indefinidas vezes
     */
    private java.util.List<IdeProcessoFGTS> ideProcessoFGTS;

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     *
     * @return Conteúdo do campo codRubr
     */
    public String getCodRubr() {
      return this.codRubr;
    }

    /**
     * Informar o código atribuído pelo empregador que identifica a rubrica em sua folha de
     * pagamento.
     *
     * <p>Evento de origem: S-1200, S-2299 ou S-2399.
     *
     * @param codRubr Valor para atribuir ao campo codRubr
     * @return O próprio T_detRubrSusp para continuar populando outros campos
     */
    public T_detRubrSusp<T> setCodRubr(String codRubr) {
      this.codRubr = codRubr;
      return this;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     *
     * @return Conteúdo do campo ideTabRubr
     */
    public String getIdeTabRubr() {
      return this.ideTabRubr;
    }

    /**
     * Preencher com o identificador da Tabela de Rubricas para a rubrica definida em
     * {codRubr}(./codRubr).
     *
     * <p>Evento de origem: S-1200, S-2299 ou S-2399.
     *
     * @param ideTabRubr Valor para atribuir ao campo ideTabRubr
     * @return O próprio T_detRubrSusp para continuar populando outros campos
     */
    public T_detRubrSusp<T> setIdeTabRubr(String ideTabRubr) {
      this.ideTabRubr = ideTabRubr;
      return this;
    }

    /**
     * Valor total da rubrica.
     *
     * @return Conteúdo do campo vrRubr
     */
    public Double getVrRubr() {
      return this.vrRubr;
    }

    /**
     * Valor total da rubrica.
     *
     * <p>Evento de origem: S-1200, S-2299 ou S-2399.
     *
     * <p>Validação: Deve corresponder ao somatório dos valores informados no campo {vrRubr} dos
     * eventos de origem para a respectiva rubrica.
     *
     * @param vrRubr Valor para atribuir ao campo vrRubr
     * @return O próprio T_detRubrSusp para continuar populando outros campos
     */
    public T_detRubrSusp<T> setVrRubr(Double vrRubr) {
      this.vrRubr = vrRubr;
      return this;
    }

    /**
     * Identificação de processo - Incidência de FGTS
     *
     * @return Conteúdo do campo ideProcessoFGTS
     */
    public java.util.List<IdeProcessoFGTS> getIdeProcessoFGTS() {
      return this.ideProcessoFGTS;
    }

    /**
     * Identificação de processo - Incidência de FGTS
     *
     * <p>- Esse campo pode ser repetido indefinidas vezes
     *
     * <p>DESCRICAO_COMPLETA:Processo(s) judicial(is) com decisão/sentença favorável, determinando a
     * não incidência de FGTS.
     *
     * <p>Evento de origem: S-1010.
     *
     * <p>CHAVE_GRUPO: {nrProc}
     *
     * @return O objeto IdeProcessoFGTS para população dos campos filhos
     */
    public IdeProcessoFGTS<T_detRubrSusp<T>> setIdeProcessoFGTS_Next() {
      if (this.ideProcessoFGTS == null) {
        this.ideProcessoFGTS = new java.util.ArrayList<>();
      }
      IdeProcessoFGTS toAdd = new IdeProcessoFGTS(this);
      this.ideProcessoFGTS.add(toAdd);
      return toAdd;
    }

    public T_detRubrSusp(Object pai) {
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
     * Identificação de processo - Incidência de FGTS
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "nrProc",
        })
    public static class IdeProcessoFGTS<T> {

      /** Informar o número do processo. */
      private String nrProc;

      /**
       * Informar o número do processo.
       *
       * @return Conteúdo do campo nrProc
       */
      public String getNrProc() {
        return this.nrProc;
      }

      /**
       * Informar o número do processo.
       *
       * @param nrProc Valor para atribuir ao campo nrProc
       * @return O próprio IdeProcessoFGTS para continuar populando outros campos
       */
      public IdeProcessoFGTS<T> setNrProc(String nrProc) {
        this.nrProc = nrProc;
        return this;
      }

      public IdeProcessoFGTS(Object pai) {
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
