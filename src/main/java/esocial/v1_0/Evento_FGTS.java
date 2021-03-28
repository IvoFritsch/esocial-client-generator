package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-5013 - Informações do FGTS Consolidadas por Contribuinte */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtFGTS",
    })
@XmlRootElement(name = "eSocial")
public class Evento_FGTS {

  /** Evento Informações do FGTS Consolidadas por Contribuinte. */
  private EvtFGTS evtFGTS;

  /**
   * Evento Informações do FGTS Consolidadas por Contribuinte.
   *
   * @return Conteúdo do campo evtFGTS
   */
  public EvtFGTS getEvtFGTS() {
    return this.evtFGTS;
  }

  /**
   * Evento Informações do FGTS Consolidadas por Contribuinte.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * @return O objeto EvtFGTS para população dos campos filhos
   */
  public EvtFGTS<Evento_FGTS> setEvtFGTS() {
    if (this.evtFGTS == null) {
      this.evtFGTS = new EvtFGTS(this);
    }
    return this.evtFGTS;
  }

  /**
   * Evento Informações do FGTS Consolidadas por Contribuinte.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoFGTS",
      })
  public static class EvtFGTS<T> {

    /** Identificação do evento de retorno. */
    private Tipos.T_ideEvento_retorno_contrib ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações relativas ao FGTS */
    private InfoFGTS infoFGTS;

    /**
     * Identificação do evento de retorno.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_retorno_contrib getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Identificação do evento de retorno.
     *
     * <p>DESCRICAO_COMPLETA:Identificação do evento de retorno.
     *
     * <p>Evento de origem: S-1299.
     *
     * @return O objeto Tipos.T_ideEvento_retorno_contrib para população dos campos filhos
     */
    public Tipos.T_ideEvento_retorno_contrib<EvtFGTS<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_retorno_contrib(this);
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
    public Tipos.T_ideEmpregador<EvtFGTS<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
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
    public InfoFGTS<EvtFGTS<T>> setInfoFGTS() {
      if (this.infoFGTS == null) {
        this.infoFGTS = new InfoFGTS(this);
      }
      return this.infoFGTS;
    }

    public EvtFGTS(Object pai) {
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
     * Informações relativas ao FGTS
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "nrRecArqBase",
          "indExistInfo",
          "ideEstab",
        })
    public static class InfoFGTS<T> {

      /**
       * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno
       * ao empregador.
       */
      private String nrRecArqBase;

      /** Indicativo de existência de FGTS. */
      private String indExistInfo;

      /**
       * Identificação do estabelecimento
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       */
      private java.util.List<IdeEstab> ideEstab;

      /**
       * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno
       * ao empregador.
       *
       * @return Conteúdo do campo nrRecArqBase
       */
      public String getNrRecArqBase() {
        return this.nrRecArqBase;
      }

      /**
       * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno
       * ao empregador.
       *
       * <p>Validação: Deve ser um recibo de entrega válido, correspondente ao arquivo que deu
       * origem ao presente arquivo de retorno (S-1299).
       *
       * @param nrRecArqBase Valor para atribuir ao campo nrRecArqBase
       * @return O próprio InfoFGTS para continuar populando outros campos
       */
      public InfoFGTS<T> setNrRecArqBase(String nrRecArqBase) {
        this.nrRecArqBase = nrRecArqBase;
        return this;
      }

      /**
       * Indicativo de existência de FGTS.
       *
       * @return Conteúdo do campo indExistInfo
       */
      public String getIndExistInfo() {
        return this.indExistInfo;
      }

      /**
       * Indicativo de existência de FGTS.
       *
       * @param indExistInfo Valor para atribuir ao campo indExistInfo
       * @return O próprio InfoFGTS para continuar populando outros campos
       */
      public InfoFGTS<T> setIndExistInfo(String indExistInfo) {
        if (!"1".equals(indExistInfo) && !"2".equals(indExistInfo) && !"3".equals(indExistInfo))
          throw new RuntimeException(
              "Valor " + String.valueOf(indExistInfo) + " inválido para o campo indExistInfo");
        this.indExistInfo = indExistInfo;
        return this;
      }
      /**
       * Há informações de FGTS
       *
       * @return O próprio InfoFGTS para continuar populando outros campos
       */
      public InfoFGTS<T> setIndExistInfo_1() {
        this.indExistInfo = "1";
        return this;
      }
      /**
       * Há movimento, porém não há informações de FGTS
       *
       * @return O próprio InfoFGTS para continuar populando outros campos
       */
      public InfoFGTS<T> setIndExistInfo_2() {
        this.indExistInfo = "2";
        return this;
      }
      /**
       * Não há movimento no período informado em {perApur}(5013_ideEvento_perApur)
       *
       * @return O próprio InfoFGTS para continuar populando outros campos
       */
      public InfoFGTS<T> setIndExistInfo_3() {
        this.indExistInfo = "3";
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
       * <p>CONDICAO_GRUPO: OC
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
         * <p>Evento de origem: S-1270 ou S-5003.
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
              "infoBaseFGTS",
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

          /** Bases de cálculo e valores do FGTS */
          private InfoBaseFGTS infoBaseFGTS;

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
           * <p>Evento de origem: S-1270 ou S-5003.
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
           * <p>Evento de origem: S-1020 ou S-5003.
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
           * <p>Evento de origem: S-1020 ou S-5003.
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
           * <p>Evento de origem: S-1020 ou S-5003.
           *
           * @param nrInsc Valor para atribuir ao campo nrInsc
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setNrInsc(String nrInsc) {
            this.nrInsc = nrInsc;
            return this;
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
           * <p>DESCRICAO_COMPLETA:Informações referentes a bases de cálculo e valores do FGTS no
           * estabelecimento/lotação.
           *
           * <p>CONDICAO_GRUPO: OC
           *
           * @return O objeto InfoBaseFGTS para população dos campos filhos
           */
          public InfoBaseFGTS<IdeLotacao<T>> setInfoBaseFGTS() {
            if (this.infoBaseFGTS == null) {
              this.infoBaseFGTS = new InfoBaseFGTS(this);
            }
            return this.infoBaseFGTS;
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
             * Bases de cálculo e valores do FGTS, exceto se {tpAcConv} = [E]
             *
             * <p>- Esse campo pode ser repetido até 99 vezes
             */
            private java.util.List<BasePerApur> basePerApur;

            /**
             * Informações sobre bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
             *
             * <p>- Esse campo pode ser repetido até 180 vezes
             */
            private java.util.List<InfoBasePerAntE> infoBasePerAntE;

            /**
             * Bases de cálculo e valores do FGTS, exceto se {tpAcConv} = [E]
             *
             * @return Conteúdo do campo basePerApur
             */
            public java.util.List<BasePerApur> getBasePerApur() {
              return this.basePerApur;
            }

            /**
             * Bases de cálculo e valores do FGTS, exceto se {tpAcConv} = [E]
             *
             * <p>- Esse campo pode ser repetido até 99 vezes
             *
             * <p>DESCRICAO_COMPLETA:Informações consolidadas das bases de cálculo e valores do FGTS
             * do período de apuração e de períodos anteriores, exceto se {tpAcConv} = [E].
             *
             * <p>Evento de origem: S-1270 ou S-5003.
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
             * Informações sobre bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
             *
             * @return Conteúdo do campo infoBasePerAntE
             */
            public java.util.List<InfoBasePerAntE> getInfoBasePerAntE() {
              return this.infoBasePerAntE;
            }

            /**
             * Informações sobre bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
             *
             * <p>- Esse campo pode ser repetido até 180 vezes
             *
             * <p>DESCRICAO_COMPLETA:Informações referentes a bases de cálculo e valores do FGTS de
             * períodos anteriores quando {tpAcConv} = [E].
             *
             * <p>Evento de origem: S-5003.
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
             * Bases de cálculo e valores do FGTS, exceto se {tpAcConv} = [E]
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "tpValor",
                  "indIncid",
                  "baseFGTS",
                  "vrFGTS",
                })
            public static class BasePerApur<T> {

              /** Tipo de valor que influi na apuração do FGTS. */
              private String tpValor;

              /** Indicativo de incidência de FGTS. */
              private String indIncid;

              /** Remuneração (valor da base de cálculo) do FGTS. */
              private Double baseFGTS;

              /** Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador. */
              private Double vrFGTS;

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
               * <p>Validação: Se o evento de origem for S-5003, deve corresponder ao valor
               * informado no campo
               * {tpValor}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_basePerApur_tpValor)
               * desse evento.
               *
               * <p>Se o evento de origem for S-1270, deve ser retornado [19].
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
                    && !"19".equals(tpValor)
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
               * FGTS - Avulsos não portuários
               *
               * @return O próprio BasePerApur para continuar populando outros campos
               */
              public BasePerApur<T> setTpValor_19() {
                this.tpValor = "19";
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
               * <p>Validação: Se {tpValor}(./tpValor) for diferente de [19], deve corresponder ao
               * valor informado no campo
               * {indIncid}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_basePerApur_indIncid)
               * do evento S-5003.
               *
               * <p>Se {tpValor}(./tpValor) = [19], deve ser retornado [1].
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
               * Remuneração (valor da base de cálculo) do FGTS.
               *
               * @return Conteúdo do campo baseFGTS
               */
              public Double getBaseFGTS() {
                return this.baseFGTS;
              }

              /**
               * Remuneração (valor da base de cálculo) do FGTS.
               *
               * <p>Validação: Deve ser maior que 0 (zero).
               *
               * <p>Se {tpValor}(./tpValor) for diferente de [19], deve corresponder ao somatório
               * dos valores informados no campo
               * {remFGTS}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_basePerApur_remFGTS)
               * do evento S-5003, agrupados por {tpValor}(./tpValor) e {indIncid}(./indIncid).
               *
               * <p>Se {tpValor}(./tpValor) = [19], deve corresponder à remuneração dos
               * trabalhadores avulsos não portuários contratados, conforme informado no campo
               * {vrBcFGTS}(1270_remunAvNP_vrBcFgts) do evento S-1270.
               *
               * @param baseFGTS Valor para atribuir ao campo baseFGTS
               * @return O próprio BasePerApur para continuar populando outros campos
               */
              public BasePerApur<T> setBaseFGTS(Double baseFGTS) {
                this.baseFGTS = baseFGTS;
                return this;
              }

              /**
               * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
               *
               * @return Conteúdo do campo vrFGTS
               */
              public Double getVrFGTS() {
                return this.vrFGTS;
              }

              /**
               * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
               *
               * <p>Validação: Deve ser maior que 0 (zero).
               *
               * <p>Se {tpValor}(./tpValor) for diferente de [19], deve corresponder ao somatório
               * dos valores informados no campo
               * {dpsFGTS}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_basePerApur_dpsFGTS)
               * do evento S-5003, agrupados por {tpValor}(./tpValor).
               *
               * <p>Se {tpValor}(./tpValor) = [19], deve corresponder ao somatório dos valores
               * informados no campo {baseFGTS}(./baseFGTS), e aplicar a alíquota de 8%.
               *
               * @param vrFGTS Valor para atribuir ao campo vrFGTS
               * @return O próprio BasePerApur para continuar populando outros campos
               */
              public BasePerApur<T> setVrFGTS(Double vrFGTS) {
                this.vrFGTS = vrFGTS;
                return this;
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
             * Informações sobre bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
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

              /** Informar o período ao qual se refere a remuneração no formato AAAA-MM. */
              private String perRef;

              /**
               * Bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
               *
               * <p>- Esse campo pode ser repetido até 99 vezes
               */
              private java.util.List<BasePerAntE> basePerAntE;

              /**
               * Informar o período ao qual se refere a remuneração no formato AAAA-MM.
               *
               * @return Conteúdo do campo perRef
               */
              public String getPerRef() {
                return this.perRef;
              }

              /**
               * Informar o período ao qual se refere a remuneração no formato AAAA-MM.
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
               * Bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
               *
               * @return Conteúdo do campo basePerAntE
               */
              public java.util.List<BasePerAntE> getBasePerAntE() {
                return this.basePerAntE;
              }

              /**
               * Bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
               *
               * <p>- Esse campo pode ser repetido até 99 vezes
               *
               * <p>DESCRICAO_COMPLETA:Informações consolidadas das bases de cálculo e valores do
               * FGTS de períodos anteriores quando {tpAcConv} = [E].
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
               * Bases de cálculo e valores do FGTS, quando {tpAcConv} = [E]
               *
               * @param <T> Tipo do retorno do método finish()
               */
              @XmlAccessorType(XmlAccessType.FIELD)
              @XmlType(
                  name = "",
                  propOrder = {
                    "tpValorE",
                    "indIncidE",
                    "baseFGTSE",
                    "vrFGTSE",
                  })
              public static class BasePerAntE<T> {

                /** Tipo de valor que influi na apuração do FGTS. */
                private String tpValorE;

                /** Indicativo de incidência de FGTS. */
                private String indIncidE;

                /** Remuneração (valor da base de cálculo) do FGTS. */
                private Double baseFGTSE;

                /** Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador. */
                private Double vrFGTSE;

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
                 * <p>Validação: Deve corresponder ao valor informado no campo
                 * {tpValorE}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_infoBasePerAntE_basePerAntE_tpValorE)
                 * do evento de origem.
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
                 * FGTS dissídio mês da rescisão - Indenização compensatória do empregado doméstico
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
                 * <p>Validação: Deve corresponder ao valor informado no campo
                 * {indIncidE}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_infoBasePerAntE_basePerAntE_indIncidE)
                 * do evento de origem.
                 *
                 * @param indIncidE Valor para atribuir ao campo indIncidE
                 * @return O próprio BasePerAntE para continuar populando outros campos
                 */
                public BasePerAntE<T> setIndIncidE(String indIncidE) {
                  if (!"1".equals(indIncidE) && !"9".equals(indIncidE))
                    throw new RuntimeException(
                        "Valor " + String.valueOf(indIncidE) + " inválido para o campo indIncidE");
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
                 * Remuneração (valor da base de cálculo) do FGTS.
                 *
                 * @return Conteúdo do campo baseFGTSE
                 */
                public Double getBaseFGTSE() {
                  return this.baseFGTSE;
                }

                /**
                 * Remuneração (valor da base de cálculo) do FGTS.
                 *
                 * <p>Validação: Deve ser maior que 0 (zero).
                 *
                 * <p>Deve corresponder ao somatório dos valores informados no campo
                 * {remFGTSE}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_infoBasePerAntE_basePerAntE_remFGTSE)
                 * do evento de origem, agrupados por {tpValorE}(./tpValorE) e
                 * {indIncidE}(./indIncidE).
                 *
                 * @param baseFGTSE Valor para atribuir ao campo baseFGTSE
                 * @return O próprio BasePerAntE para continuar populando outros campos
                 */
                public BasePerAntE<T> setBaseFGTSE(Double baseFGTSE) {
                  this.baseFGTSE = baseFGTSE;
                  return this;
                }

                /**
                 * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
                 *
                 * @return Conteúdo do campo vrFGTSE
                 */
                public Double getVrFGTSE() {
                  return this.vrFGTSE;
                }

                /**
                 * Valor histórico do FGTS a ser depositado na conta vinculada do trabalhador.
                 *
                 * <p>Validação: Deve ser maior que 0 (zero).
                 *
                 * <p>Deve corresponder ao somatório dos valores informados no campo
                 * {dpsFGTSE}(5003_infoFGTS_ideEstab_ideLotacao_infoTrabFGTS_infoBaseFGTS_infoBasePerAntE_basePerAntE_dpsFGTSE)
                 * do evento de origem, agrupados por {tpValorE}(./tpValorE).
                 *
                 * @param vrFGTSE Valor para atribuir ao campo vrFGTSE
                 * @return O próprio BasePerAntE para continuar populando outros campos
                 */
                public BasePerAntE<T> setVrFGTSE(Double vrFGTSE) {
                  this.vrFGTSE = vrFGTSE;
                  return this;
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
        }
      }
    }
  }
}
