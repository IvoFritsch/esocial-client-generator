package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-1260 - Comercialização da Produção Rural Pessoa Física */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtComProd",
    })
@XmlRootElement(name = "eSocial")
public class Evento_ComProd {

  /** Evento Comercialização da Produção Rural Pessoa Física. */
  private EvtComProd evtComProd;

  /**
   * Evento Comercialização da Produção Rural Pessoa Física.
   *
   * @return Conteúdo do campo evtComProd
   */
  public EvtComProd getEvtComProd() {
    return this.evtComProd;
  }

  /**
   * Evento Comercialização da Produção Rural Pessoa Física.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVE_FOPAG_COMERC_PROD
   *
   * <p>REGRA:REGRA_EVE_FOPAG_IND_RETIFICACAO
   *
   * <p>REGRA:REGRA_EVE_FOPAG_INFO_COMPAT_CLASSTRIB
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
   * @return O objeto EvtComProd para população dos campos filhos
   */
  public EvtComProd<Evento_ComProd> setEvtComProd() {
    if (this.evtComProd == null) {
      this.evtComProd = new EvtComProd(this);
    }
    return this.evtComProd;
  }

  /**
   * Evento Comercialização da Produção Rural Pessoa Física.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoComProd",
      })
  public static class EvtComProd<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_folha_mensal ideEvento;

    /** Informações de identificação do empregador. */
    private IdeEmpregador ideEmpregador;

    /** Informação da comercialização de produção. */
    private InfoComProd infoComProd;

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
    public Tipos.T_ideEvento_folha_mensal<EvtComProd<T>> setIdeEvento() {
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
    public IdeEmpregador getIdeEmpregador() {
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do empregador.
     *
     * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
     *
     * @return O objeto IdeEmpregador para população dos campos filhos
     */
    public IdeEmpregador<EvtComProd<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new IdeEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informação da comercialização de produção.
     *
     * @return Conteúdo do campo infoComProd
     */
    public InfoComProd getInfoComProd() {
      return this.infoComProd;
    }

    /**
     * Informação da comercialização de produção.
     *
     * @return O objeto InfoComProd para população dos campos filhos
     */
    public InfoComProd<EvtComProd<T>> setInfoComProd() {
      if (this.infoComProd == null) {
        this.infoComProd = new InfoComProd(this);
      }
      return this.infoComProd;
    }

    public EvtComProd(Object pai) {
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
     * Informações de identificação do empregador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "tpInsc", "nrInsc",
        })
    public static class IdeEmpregador<T> {

      /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
      private String tpInsc;

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
       */
      private String nrInsc;

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
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setTpInsc(String tpInsc) {
        if (!"2".equals(tpInsc))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
        this.tpInsc = tpInsc;
        return this;
      }
      /**
       * CPF
       *
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setTpInsc_2() {
        this.tpInsc = "2";
        return this;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
       *
       * @return Conteúdo do campo nrInsc
       */
      public String getNrInsc() {
        return this.nrInsc;
      }

      /**
       * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
       * no campo {ideEmpregador/tpInsc}(./tpInsc) e conforme informado em S-1000.
       *
       * @param nrInsc Valor para atribuir ao campo nrInsc
       * @return O próprio IdeEmpregador para continuar populando outros campos
       */
      public IdeEmpregador<T> setNrInsc(String nrInsc) {
        this.nrInsc = nrInsc;
        return this;
      }

      public IdeEmpregador(Object pai) {
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
     * Informação da comercialização de produção.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "ideEstabel",
        })
    public static class InfoComProd<T> {

      /** Identificação do estabelecimento que comercializou a produção. */
      private IdeEstabel ideEstabel;

      /**
       * Identificação do estabelecimento que comercializou a produção.
       *
       * @return Conteúdo do campo ideEstabel
       */
      public IdeEstabel getIdeEstabel() {
        return this.ideEstabel;
      }

      /**
       * Identificação do estabelecimento que comercializou a produção.
       *
       * <p>CHAVE_GRUPO: {nrInscEstabRural}
       *
       * @return O objeto IdeEstabel para população dos campos filhos
       */
      public IdeEstabel<InfoComProd<T>> setIdeEstabel() {
        if (this.ideEstabel == null) {
          this.ideEstabel = new IdeEstabel(this);
        }
        return this.ideEstabel;
      }

      public InfoComProd(Object pai) {
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
       * Identificação do estabelecimento que comercializou a produção.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "nrInscEstabRural",
            "tpComerc",
          })
      public static class IdeEstabel<T> {

        /** Preencher com o número de inscrição no CAEPF do estabelecimento rural. */
        private String nrInscEstabRural;

        /**
         * Valor total da comercialização por "tipo" de comercialização.
         *
         * <p>- Esse campo pode ser repetido até 5 vezes
         */
        private java.util.List<TpComerc> tpComerc;

        /**
         * Preencher com o número de inscrição no CAEPF do estabelecimento rural.
         *
         * @return Conteúdo do campo nrInscEstabRural
         */
        public String getNrInscEstabRural() {
          return this.nrInscEstabRural;
        }

        /**
         * Preencher com o número de inscrição no CAEPF do estabelecimento rural.
         *
         * <p>Validação: Deve ser um número de inscrição válido e existente na Tabela de
         * Estabelecimentos (S-1005). Se {indGuia}(1260_ideEvento_indGuia) estiver preenchido, o
         * número de inscrição deve possuir
         * {tpCaepf}(1005_infoEstab_inclusao_dadosEstab_infoCaepf_tpCaepf) em S-1005 = [3].
         *
         * @param nrInscEstabRural Valor para atribuir ao campo nrInscEstabRural
         * @return O próprio IdeEstabel para continuar populando outros campos
         */
        public IdeEstabel<T> setNrInscEstabRural(String nrInscEstabRural) {
          this.nrInscEstabRural = nrInscEstabRural;
          return this;
        }

        /**
         * Valor total da comercialização por "tipo" de comercialização.
         *
         * @return Conteúdo do campo tpComerc
         */
        public java.util.List<TpComerc> getTpComerc() {
          return this.tpComerc;
        }

        /**
         * Valor total da comercialização por "tipo" de comercialização.
         *
         * <p>- Esse campo pode ser repetido até 5 vezes
         *
         * <p>CHAVE_GRUPO: {indComerc}
         *
         * @return O objeto TpComerc para população dos campos filhos
         */
        public TpComerc<IdeEstabel<T>> setTpComerc_Next() {
          if (this.tpComerc == null) {
            this.tpComerc = new java.util.ArrayList<>();
          }
          TpComerc toAdd = new TpComerc(this);
          this.tpComerc.add(toAdd);
          return toAdd;
        }

        public IdeEstabel(Object pai) {
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
         * Valor total da comercialização por "tipo" de comercialização.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "indComerc",
              "vrTotCom",
              "ideAdquir",
              "infoProcJud",
            })
        public static class TpComerc<T> {

          /** Indicativo de comercialização. */
          private String indComerc;

          /** Preencher com o valor total da comercialização. */
          private Double vrTotCom;

          /**
           * Identificação dos adquirentes da produção.
           *
           * <p>- Esse campo pode ser repetido até 9.999 vezes
           */
          private java.util.List<IdeAdquir> ideAdquir;

          /**
           * Informação de processos judiciais
           *
           * <p>- Esse campo pode ser repetido até 10 vezes
           */
          private java.util.List<InfoProcJud> infoProcJud;

          /**
           * Indicativo de comercialização.
           *
           * @return Conteúdo do campo indComerc
           */
          public String getIndComerc() {
            return this.indComerc;
          }

          /**
           * Indicativo de comercialização.
           *
           * @param indComerc Valor para atribuir ao campo indComerc
           * @return O próprio TpComerc para continuar populando outros campos
           */
          public TpComerc<T> setIndComerc(String indComerc) {
            if (!"2".equals(indComerc)
                && !"3".equals(indComerc)
                && !"7".equals(indComerc)
                && !"8".equals(indComerc)
                && !"9".equals(indComerc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indComerc) + " inválido para o campo indComerc");
            this.indComerc = indComerc;
            return this;
          }
          /**
           * Comercialização da produção efetuada diretamente no varejo a consumidor final ou a
           * outro produtor rural pessoa física por produtor rural pessoa física, inclusive por
           * segurado especial, ou por pessoa física não produtor rural
           *
           * @return O próprio TpComerc para continuar populando outros campos
           */
          public TpComerc<T> setIndComerc_2() {
            this.indComerc = "2";
            return this;
          }
          /**
           * Comercialização da produção por prod. rural PF/seg. especial - Vendas a PJ (exceto
           * entidade inscrita no Programa de Aquisição de Alimentos - PAA) ou a intermediário PF
           *
           * @return O próprio TpComerc para continuar populando outros campos
           */
          public TpComerc<T> setIndComerc_3() {
            this.indComerc = "3";
            return this;
          }
          /**
           * Comercialização da produção isenta de acordo com a Lei 13.606/2018
           *
           * @return O próprio TpComerc para continuar populando outros campos
           */
          public TpComerc<T> setIndComerc_7() {
            this.indComerc = "7";
            return this;
          }
          /**
           * Comercialização da produção da pessoa física/segurado especial para entidade inscrita
           * no PAA
           *
           * @return O próprio TpComerc para continuar populando outros campos
           */
          public TpComerc<T> setIndComerc_8() {
            this.indComerc = "8";
            return this;
          }
          /**
           * Comercialização da produção no mercado externo
           *
           * @return O próprio TpComerc para continuar populando outros campos
           */
          public TpComerc<T> setIndComerc_9() {
            this.indComerc = "9";
            return this;
          }

          /**
           * Preencher com o valor total da comercialização.
           *
           * @return Conteúdo do campo vrTotCom
           */
          public Double getVrTotCom() {
            return this.vrTotCom;
          }

          /**
           * Preencher com o valor total da comercialização.
           *
           * <p>Validação: Deve ser maior que 0 (zero).
           *
           * <p>Se {indComerc}(./indComerc) for igual a [3, 7], deve corresponder à soma do campo
           * {vrComerc}(1260_infoComProd_ideEstabel_tpComerc_ideAdquir_vrComerc) dos registros
           * vinculados.
           *
           * @param vrTotCom Valor para atribuir ao campo vrTotCom
           * @return O próprio TpComerc para continuar populando outros campos
           */
          public TpComerc<T> setVrTotCom(Double vrTotCom) {
            this.vrTotCom = vrTotCom;
            return this;
          }

          /**
           * Identificação dos adquirentes da produção.
           *
           * @return Conteúdo do campo ideAdquir
           */
          public java.util.List<IdeAdquir> getIdeAdquir() {
            return this.ideAdquir;
          }

          /**
           * Identificação dos adquirentes da produção.
           *
           * <p>- Esse campo pode ser repetido até 9.999 vezes
           *
           * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
           *
           * <p>CONDICAO_GRUPO: F (se {indComerc}(../indComerc) = [3, 7, 8]); N (nos demais casos)
           *
           * @return O objeto IdeAdquir para população dos campos filhos
           */
          public IdeAdquir<TpComerc<T>> setIdeAdquir_Next() {
            if (this.ideAdquir == null) {
              this.ideAdquir = new java.util.ArrayList<>();
            }
            IdeAdquir toAdd = new IdeAdquir(this);
            this.ideAdquir.add(toAdd);
            return toAdd;
          }

          /**
           * Informação de processos judiciais
           *
           * @return Conteúdo do campo infoProcJud
           */
          public java.util.List<InfoProcJud> getInfoProcJud() {
            return this.infoProcJud;
          }

          /**
           * Informação de processos judiciais
           *
           * <p>- Esse campo pode ser repetido até 10 vezes
           *
           * <p>DESCRICAO_COMPLETA:Informações de processos judiciais com decisão/sentença favorável
           * ao contribuinte e relativos à contribuição incidente sobre a comercialização.
           *
           * <p>CHAVE_GRUPO: {tpProc}, {nrProc}, {codSusp}
           *
           * <p>CONDICAO_GRUPO: OC
           *
           * @return O objeto InfoProcJud para população dos campos filhos
           */
          public InfoProcJud<TpComerc<T>> setInfoProcJud_Next() {
            if (this.infoProcJud == null) {
              this.infoProcJud = new java.util.ArrayList<>();
            }
            InfoProcJud toAdd = new InfoProcJud(this);
            this.infoProcJud.add(toAdd);
            return toAdd;
          }

          public TpComerc(Object pai) {
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
           * Identificação dos adquirentes da produção.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "tpInsc",
                "nrInsc",
                "vrComerc",
                "nfs",
              })
          public static class IdeAdquir<T> {

            /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
            private String tpInsc;

            /**
             * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição
             * indicado no campo {ideAdquir/tpInsc}(./tpInsc).
             */
            private String nrInsc;

            /** Valor bruto da comercialização da produção. */
            private Double vrComerc;

            /**
             * Notas fiscais da aquisição de produção
             *
             * <p>- Esse campo pode ser repetido até 999 vezes
             */
            private java.util.List<Nfs> nfs;

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
             * <p>Validação: Se {indComerc}(../indComerc) for igual a [3, 7], deve ser igual a [1,
             * 2]. Se {indComerc}(../indComerc) for igual a [8], deve ser igual a [1].
             *
             * @param tpInsc Valor para atribuir ao campo tpInsc
             * @return O próprio IdeAdquir para continuar populando outros campos
             */
            public IdeAdquir<T> setTpInsc(String tpInsc) {
              if (!"1".equals(tpInsc) && !"2".equals(tpInsc))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
              this.tpInsc = tpInsc;
              return this;
            }
            /**
             * CNPJ
             *
             * @return O próprio IdeAdquir para continuar populando outros campos
             */
            public IdeAdquir<T> setTpInsc_1() {
              this.tpInsc = "1";
              return this;
            }
            /**
             * CPF
             *
             * @return O próprio IdeAdquir para continuar populando outros campos
             */
            public IdeAdquir<T> setTpInsc_2() {
              this.tpInsc = "2";
              return this;
            }

            /**
             * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição
             * indicado no campo {ideAdquir/tpInsc}(./tpInsc).
             *
             * @return Conteúdo do campo nrInsc
             */
            public String getNrInsc() {
              return this.nrInsc;
            }

            /**
             * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição
             * indicado no campo {ideAdquir/tpInsc}(./tpInsc).
             *
             * <p>Validação: A inscrição informada deve ser compatível com o
             * {ideAdquir/tpInsc}(./tpInsc) e diferente da inscrição do declarante.
             *
             * @param nrInsc Valor para atribuir ao campo nrInsc
             * @return O próprio IdeAdquir para continuar populando outros campos
             */
            public IdeAdquir<T> setNrInsc(String nrInsc) {
              this.nrInsc = nrInsc;
              return this;
            }

            /**
             * Valor bruto da comercialização da produção.
             *
             * @return Conteúdo do campo vrComerc
             */
            public Double getVrComerc() {
              return this.vrComerc;
            }

            /**
             * Valor bruto da comercialização da produção.
             *
             * <p>Validação: Deve ser maior que 0 (zero).
             *
             * @param vrComerc Valor para atribuir ao campo vrComerc
             * @return O próprio IdeAdquir para continuar populando outros campos
             */
            public IdeAdquir<T> setVrComerc(Double vrComerc) {
              this.vrComerc = vrComerc;
              return this;
            }

            /**
             * Notas fiscais da aquisição de produção
             *
             * @return Conteúdo do campo nfs
             */
            public java.util.List<Nfs> getNfs() {
              return this.nfs;
            }

            /**
             * Notas fiscais da aquisição de produção
             *
             * <p>- Esse campo pode ser repetido até 999 vezes
             *
             * <p>DESCRICAO_COMPLETA:Detalhamento das notas fiscais relativas à comercialização de
             * produção com o adquirente identificado no grupo superior.
             *
             * <p>CHAVE_GRUPO: {serie}, {nrDocto}
             *
             * <p>CONDICAO_GRUPO: F
             *
             * @return O objeto Nfs para população dos campos filhos
             */
            public Nfs<IdeAdquir<T>> setNfs_Next() {
              if (this.nfs == null) {
                this.nfs = new java.util.ArrayList<>();
              }
              Nfs toAdd = new Nfs(this);
              this.nfs.add(toAdd);
              return toAdd;
            }

            public IdeAdquir(Object pai) {
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
             * Notas fiscais da aquisição de produção
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "serie",
                  "nrDocto",
                  "dtEmisNF",
                  "vlrBruto",
                  "vrCPDescPR",
                  "vrRatDescPR",
                  "vrSenarDesc",
                })
            public static class Nfs<T> {

              /** Informar o número de série da nota fiscal/fatura. */
              private String serie;

              /** Número da nota fiscal/fatura. */
              private String nrDocto;

              /** Data de emissão da nota fiscal/fatura. */
              private javax.xml.datatype.XMLGregorianCalendar dtEmisNF;

              /** Preencher com o valor bruto da(s) nota(s) fiscal(is). */
              private Double vlrBruto;

              /**
               * Preencher com o valor da contribuição previdenciária descontada pelo adquirente na
               * comercialização de produção. Se não houver informação, preencher com 0 (zero).
               */
              private Double vrCPDescPR;

              /**
               * Valor da contribuição destinada ao financiamento dos benefícios concedidos em razão
               * do grau de incidência da incapacidade laborativa decorrente dos riscos ambientais
               * do trabalho, incidente sobre a comercialização de produção rural de produtor rural.
               * Se não houver informação, preencher com 0 (zero).
               */
              private Double vrRatDescPR;

              /**
               * Valor da contribuição destinada ao SENAR, incidente sobre a comercialização de
               * produção rural de produtor rural pessoa física/segurado especial. Se não houver
               * informação, preencher com 0 (zero).
               */
              private Double vrSenarDesc;

              /**
               * Informar o número de série da nota fiscal/fatura.
               *
               * @return Conteúdo do campo serie
               */
              public String getSerie() {
                return this.serie;
              }

              /**
               * Informar o número de série da nota fiscal/fatura.
               *
               * @param serie Valor para atribuir ao campo serie
               * @return O próprio Nfs para continuar populando outros campos
               */
              public Nfs<T> setSerie(String serie) {
                this.serie = serie;
                return this;
              }

              /**
               * Número da nota fiscal/fatura.
               *
               * @return Conteúdo do campo nrDocto
               */
              public String getNrDocto() {
                return this.nrDocto;
              }

              /**
               * Número da nota fiscal/fatura.
               *
               * @param nrDocto Valor para atribuir ao campo nrDocto
               * @return O próprio Nfs para continuar populando outros campos
               */
              public Nfs<T> setNrDocto(String nrDocto) {
                this.nrDocto = nrDocto;
                return this;
              }

              /**
               * Data de emissão da nota fiscal/fatura.
               *
               * @return Conteúdo do campo dtEmisNF
               */
              public javax.xml.datatype.XMLGregorianCalendar getDtEmisNF() {
                return this.dtEmisNF;
              }

              /**
               * Data de emissão da nota fiscal/fatura.
               *
               * <p>Validação: O mês/ano da emissão da nota fiscal deve ser igual ao mês/ano
               * indicado no registro de abertura do arquivo.
               *
               * @param dtEmisNF Valor para atribuir ao campo dtEmisNF
               * @return O próprio Nfs para continuar populando outros campos
               */
              public Nfs<T> setDtEmisNF(javax.xml.datatype.XMLGregorianCalendar dtEmisNF) {
                this.dtEmisNF = dtEmisNF;
                return this;
              }

              /**
               * Preencher com o valor bruto da(s) nota(s) fiscal(is).
               *
               * @return Conteúdo do campo vlrBruto
               */
              public Double getVlrBruto() {
                return this.vlrBruto;
              }

              /**
               * Preencher com o valor bruto da(s) nota(s) fiscal(is).
               *
               * @param vlrBruto Valor para atribuir ao campo vlrBruto
               * @return O próprio Nfs para continuar populando outros campos
               */
              public Nfs<T> setVlrBruto(Double vlrBruto) {
                this.vlrBruto = vlrBruto;
                return this;
              }

              /**
               * Preencher com o valor da contribuição previdenciária descontada pelo adquirente na
               * comercialização de produção. Se não houver informação, preencher com 0 (zero).
               *
               * @return Conteúdo do campo vrCPDescPR
               */
              public Double getVrCPDescPR() {
                return this.vrCPDescPR;
              }

              /**
               * Preencher com o valor da contribuição previdenciária descontada pelo adquirente na
               * comercialização de produção. Se não houver informação, preencher com 0 (zero).
               *
               * @param vrCPDescPR Valor para atribuir ao campo vrCPDescPR
               * @return O próprio Nfs para continuar populando outros campos
               */
              public Nfs<T> setVrCPDescPR(Double vrCPDescPR) {
                this.vrCPDescPR = vrCPDescPR;
                return this;
              }

              /**
               * Valor da contribuição destinada ao financiamento dos benefícios concedidos em razão
               * do grau de incidência da incapacidade laborativa decorrente dos riscos ambientais
               * do trabalho, incidente sobre a comercialização de produção rural de produtor rural.
               * Se não houver informação, preencher com 0 (zero).
               *
               * @return Conteúdo do campo vrRatDescPR
               */
              public Double getVrRatDescPR() {
                return this.vrRatDescPR;
              }

              /**
               * Valor da contribuição destinada ao financiamento dos benefícios concedidos em razão
               * do grau de incidência da incapacidade laborativa decorrente dos riscos ambientais
               * do trabalho, incidente sobre a comercialização de produção rural de produtor rural.
               * Se não houver informação, preencher com 0 (zero).
               *
               * @param vrRatDescPR Valor para atribuir ao campo vrRatDescPR
               * @return O próprio Nfs para continuar populando outros campos
               */
              public Nfs<T> setVrRatDescPR(Double vrRatDescPR) {
                this.vrRatDescPR = vrRatDescPR;
                return this;
              }

              /**
               * Valor da contribuição destinada ao SENAR, incidente sobre a comercialização de
               * produção rural de produtor rural pessoa física/segurado especial. Se não houver
               * informação, preencher com 0 (zero).
               *
               * @return Conteúdo do campo vrSenarDesc
               */
              public Double getVrSenarDesc() {
                return this.vrSenarDesc;
              }

              /**
               * Valor da contribuição destinada ao SENAR, incidente sobre a comercialização de
               * produção rural de produtor rural pessoa física/segurado especial. Se não houver
               * informação, preencher com 0 (zero).
               *
               * @param vrSenarDesc Valor para atribuir ao campo vrSenarDesc
               * @return O próprio Nfs para continuar populando outros campos
               */
              public Nfs<T> setVrSenarDesc(Double vrSenarDesc) {
                this.vrSenarDesc = vrSenarDesc;
                return this;
              }

              public Nfs(Object pai) {
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

          /**
           * Informação de processos judiciais
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "tpProc",
                "nrProc",
                "codSusp",
                "vrCPSusp",
                "vrRatSusp",
                "vrSenarSusp",
              })
          public static class InfoProcJud<T> {

            /** Preencher com o código correspondente ao tipo de processo. */
            private String tpProc;

            /**
             * Informar um número de processo cadastrado através do evento S-1070, cujo
             * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
             */
            private String nrProc;

            /** Código do indicativo da suspensão, atribuído pelo empregador em S-1070. */
            private Integer codSusp;

            /** Valor da contribuição previdenciária com exigibilidade suspensa. */
            private Double vrCPSusp;

            /** Valor da contribuição para GILRAT com exigibilidade suspensa. */
            private Double vrRatSusp;

            /** Valor da contribuição para o SENAR com exigibilidade suspensa. */
            private Double vrSenarSusp;

            /**
             * Preencher com o código correspondente ao tipo de processo.
             *
             * @return Conteúdo do campo tpProc
             */
            public String getTpProc() {
              return this.tpProc;
            }

            /**
             * Preencher com o código correspondente ao tipo de processo.
             *
             * @param tpProc Valor para atribuir ao campo tpProc
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setTpProc(String tpProc) {
              if (!"1".equals(tpProc) && !"2".equals(tpProc))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpProc) + " inválido para o campo tpProc");
              this.tpProc = tpProc;
              return this;
            }
            /**
             * Administrativo
             *
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setTpProc_1() {
              this.tpProc = "1";
              return this;
            }
            /**
             * Judicial
             *
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setTpProc_2() {
              this.tpProc = "2";
              return this;
            }

            /**
             * Informar um número de processo cadastrado através do evento S-1070, cujo
             * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
             *
             * @return Conteúdo do campo nrProc
             */
            public String getNrProc() {
              return this.nrProc;
            }

            /**
             * Informar um número de processo cadastrado através do evento S-1070, cujo
             * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) seja igual a [1].
             *
             * <p>Validação: Deve ser um número de processo administrativo ou judicial válido e
             * existente na Tabela de Processos (S-1070), com
             * {indMatProc}(1070_infoProcesso_inclusao_dadosProc_indMatProc) = [1].
             *
             * @param nrProc Valor para atribuir ao campo nrProc
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setNrProc(String nrProc) {
              this.nrProc = nrProc;
              return this;
            }

            /**
             * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
             *
             * @return Conteúdo do campo codSusp
             */
            public Integer getCodSusp() {
              return this.codSusp;
            }

            /**
             * Código do indicativo da suspensão, atribuído pelo empregador em S-1070.
             *
             * <p>Validação: A informação prestada deve estar de acordo com o que foi informado em
             * S-1070.
             *
             * @param codSusp Valor para atribuir ao campo codSusp
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setCodSusp(Integer codSusp) {
              this.codSusp = codSusp;
              return this;
            }

            /**
             * Valor da contribuição previdenciária com exigibilidade suspensa.
             *
             * @return Conteúdo do campo vrCPSusp
             */
            public Double getVrCPSusp() {
              return this.vrCPSusp;
            }

            /**
             * Valor da contribuição previdenciária com exigibilidade suspensa.
             *
             * <p>Validação: Preenchimento obrigatório se {vrRatSusp}(./vrRatSusp) e
             * {vrSenarSusp}(./vrSenarSusp) não tiverem sido preenchidos.
             *
             * <p>Deve ser um valor maior que 0 (zero).
             *
             * @param vrCPSusp Valor para atribuir ao campo vrCPSusp
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setVrCPSusp(Double vrCPSusp) {
              this.vrCPSusp = vrCPSusp;
              return this;
            }

            /**
             * Valor da contribuição para GILRAT com exigibilidade suspensa.
             *
             * @return Conteúdo do campo vrRatSusp
             */
            public Double getVrRatSusp() {
              return this.vrRatSusp;
            }

            /**
             * Valor da contribuição para GILRAT com exigibilidade suspensa.
             *
             * <p>Validação: Preenchimento obrigatório se {vrCPSusp}(./vrCPSusp) e
             * {vrSenarSusp}(./vrSenarSusp) não tiverem sido preenchidos.
             *
             * <p>Deve ser um valor maior que 0 (zero).
             *
             * @param vrRatSusp Valor para atribuir ao campo vrRatSusp
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setVrRatSusp(Double vrRatSusp) {
              this.vrRatSusp = vrRatSusp;
              return this;
            }

            /**
             * Valor da contribuição para o SENAR com exigibilidade suspensa.
             *
             * @return Conteúdo do campo vrSenarSusp
             */
            public Double getVrSenarSusp() {
              return this.vrSenarSusp;
            }

            /**
             * Valor da contribuição para o SENAR com exigibilidade suspensa.
             *
             * <p>Validação: Preenchimento obrigatório se {vrCPSusp}(./vrCPSusp) e
             * {vrRatSusp}(./vrRatSusp) não tiverem sido preenchidos.
             *
             * <p>Deve ser um valor maior que 0 (zero).
             *
             * @param vrSenarSusp Valor para atribuir ao campo vrSenarSusp
             * @return O próprio InfoProcJud para continuar populando outros campos
             */
            public InfoProcJud<T> setVrSenarSusp(Double vrSenarSusp) {
              this.vrSenarSusp = vrSenarSusp;
              return this;
            }

            public InfoProcJud(Object pai) {
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
