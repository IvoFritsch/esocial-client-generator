package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-5011 - Informações das Contribuições Sociais Consolidadas por Contribuinte */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtCS",
    })
@XmlRootElement(name = "eSocial")
public class Evento_CS {

  /** Evento Informações das Contribuições Sociais Consolidadas por Contribuinte. */
  private EvtCS evtCS;

  /**
   * Evento Informações das Contribuições Sociais Consolidadas por Contribuinte.
   *
   * @return Conteúdo do campo evtCS
   */
  public EvtCS getEvtCS() {
    return this.evtCS;
  }

  /**
   * Evento Informações das Contribuições Sociais Consolidadas por Contribuinte.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * @return O objeto EvtCS para população dos campos filhos
   */
  public EvtCS<Evento_CS> setEvtCS() {
    if (this.evtCS == null) {
      this.evtCS = new EvtCS(this);
    }
    return this.evtCS;
  }

  /**
   * Evento Informações das Contribuições Sociais Consolidadas por Contribuinte.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "infoCS",
      })
  public static class EvtCS<T> {

    /** Identificação do evento de retorno. */
    private Tipos.T_ideEvento_retorno_contrib ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações relativas às contribuições sociais */
    private InfoCS infoCS;

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
    public Tipos.T_ideEvento_retorno_contrib<EvtCS<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtCS<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações relativas às contribuições sociais
     *
     * @return Conteúdo do campo infoCS
     */
    public InfoCS getInfoCS() {
      return this.infoCS;
    }

    /**
     * Informações relativas às contribuições sociais
     *
     * <p>DESCRICAO_COMPLETA:Informações relativas às contribuições sociais devidas à Previdência
     * Social e a Outras Entidades e Fundos.
     *
     * @return O objeto InfoCS para população dos campos filhos
     */
    public InfoCS<EvtCS<T>> setInfoCS() {
      if (this.infoCS == null) {
        this.infoCS = new InfoCS(this);
      }
      return this.infoCS;
    }

    public EvtCS(Object pai) {
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
     * Informações relativas às contribuições sociais
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "nrRecArqBase",
          "indExistInfo",
          "infoCPSeg",
          "infoContrib",
          "ideEstab",
          "infoCRContrib",
        })
    public static class InfoCS<T> {

      /**
       * Preencher com o número do recibo do arquivo que deu origem ao presente arquivo de retorno
       * ao empregador.
       */
      private String nrRecArqBase;

      /** Indicativo de existência de valores de bases e de contribuições sociais. */
      private String indExistInfo;

      /** Informações de contribuição previdenciária do segurado. */
      private InfoCPSeg infoCPSeg;

      /** Informações gerais do contribuinte */
      private InfoContrib infoContrib;

      /**
       * Identificação do estabelecimento/obra
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       */
      private java.util.List<IdeEstab> ideEstab;

      /**
       * Totalizador dos Códigos de Receita do contribuinte
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<InfoCRContrib> infoCRContrib;

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
       * @return O próprio InfoCS para continuar populando outros campos
       */
      public InfoCS<T> setNrRecArqBase(String nrRecArqBase) {
        this.nrRecArqBase = nrRecArqBase;
        return this;
      }

      /**
       * Indicativo de existência de valores de bases e de contribuições sociais.
       *
       * @return Conteúdo do campo indExistInfo
       */
      public String getIndExistInfo() {
        return this.indExistInfo;
      }

      /**
       * Indicativo de existência de valores de bases e de contribuições sociais.
       *
       * @param indExistInfo Valor para atribuir ao campo indExistInfo
       * @return O próprio InfoCS para continuar populando outros campos
       */
      public InfoCS<T> setIndExistInfo(String indExistInfo) {
        if (!"1".equals(indExistInfo) && !"2".equals(indExistInfo) && !"3".equals(indExistInfo))
          throw new RuntimeException(
              "Valor " + String.valueOf(indExistInfo) + " inválido para o campo indExistInfo");
        this.indExistInfo = indExistInfo;
        return this;
      }
      /**
       * Há informações com apuração de contribuições sociais
       *
       * @return O próprio InfoCS para continuar populando outros campos
       */
      public InfoCS<T> setIndExistInfo_1() {
        this.indExistInfo = "1";
        return this;
      }
      /**
       * Há movimento, porém sem apuração de contribuições sociais
       *
       * @return O próprio InfoCS para continuar populando outros campos
       */
      public InfoCS<T> setIndExistInfo_2() {
        this.indExistInfo = "2";
        return this;
      }
      /**
       * Não há movimento no período informado em {perApur}(5011_ideEvento_perApur)
       *
       * @return O próprio InfoCS para continuar populando outros campos
       */
      public InfoCS<T> setIndExistInfo_3() {
        this.indExistInfo = "3";
        return this;
      }

      /**
       * Informações de contribuição previdenciária do segurado.
       *
       * @return Conteúdo do campo infoCPSeg
       */
      public InfoCPSeg getInfoCPSeg() {
        return this.infoCPSeg;
      }

      /**
       * Informações de contribuição previdenciária do segurado.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto InfoCPSeg para população dos campos filhos
       */
      public InfoCPSeg<InfoCS<T>> setInfoCPSeg() {
        if (this.infoCPSeg == null) {
          this.infoCPSeg = new InfoCPSeg(this);
        }
        return this.infoCPSeg;
      }

      /**
       * Informações gerais do contribuinte
       *
       * @return Conteúdo do campo infoContrib
       */
      public InfoContrib getInfoContrib() {
        return this.infoContrib;
      }

      /**
       * Informações gerais do contribuinte
       *
       * <p>DESCRICAO_COMPLETA:Informações gerais do contribuinte necessárias à apuração das
       * contribuições sociais.
       *
       * @return O objeto InfoContrib para população dos campos filhos
       */
      public InfoContrib<InfoCS<T>> setInfoContrib() {
        if (this.infoContrib == null) {
          this.infoContrib = new InfoContrib(this);
        }
        return this.infoContrib;
      }

      /**
       * Identificação do estabelecimento/obra
       *
       * @return Conteúdo do campo ideEstab
       */
      public java.util.List<IdeEstab> getIdeEstab() {
        return this.ideEstab;
      }

      /**
       * Identificação do estabelecimento/obra
       *
       * <p>- Esse campo pode ser repetido indefinidas vezes
       *
       * <p>DESCRICAO_COMPLETA:Informações de identificação do estabelecimento ou obra de construção
       * civil.
       *
       * <p>CHAVE_GRUPO: {tpInsc}, {nrInsc}
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto IdeEstab para população dos campos filhos
       */
      public IdeEstab<InfoCS<T>> setIdeEstab_Next() {
        if (this.ideEstab == null) {
          this.ideEstab = new java.util.ArrayList<>();
        }
        IdeEstab toAdd = new IdeEstab(this);
        this.ideEstab.add(toAdd);
        return toAdd;
      }

      /**
       * Totalizador dos Códigos de Receita do contribuinte
       *
       * @return Conteúdo do campo infoCRContrib
       */
      public java.util.List<InfoCRContrib> getInfoCRContrib() {
        return this.infoCRContrib;
      }

      /**
       * Totalizador dos Códigos de Receita do contribuinte
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       *
       * <p>DESCRICAO_COMPLETA:Informações consolidadas das contribuições sociais devidas à
       * Previdência Social e Outras Entidades e Fundos, por Código de Receita - CR.
       *
       * <p>CHAVE_GRUPO: {tpCR}
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto InfoCRContrib para população dos campos filhos
       */
      public InfoCRContrib<InfoCS<T>> setInfoCRContrib_Next() {
        if (this.infoCRContrib == null) {
          this.infoCRContrib = new java.util.ArrayList<>();
        }
        InfoCRContrib toAdd = new InfoCRContrib(this);
        this.infoCRContrib.add(toAdd);
        return toAdd;
      }

      public InfoCS(Object pai) {
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
       * Informações de contribuição previdenciária do segurado.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "vrDescCP",
            "vrCpSeg",
          })
      public static class InfoCPSeg<T> {

        /** Valor total da contribuição descontada dos segurados. */
        private Double vrDescCP;

        /** Valor total calculado relativo à contribuição dos segurados. */
        private Double vrCpSeg;

        /**
         * Valor total da contribuição descontada dos segurados.
         *
         * @return Conteúdo do campo vrDescCP
         */
        public Double getVrDescCP() {
          return this.vrDescCP;
        }

        /**
         * Valor total da contribuição descontada dos segurados.
         *
         * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) de
         * S-5001, quando {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em
         * S-5001 = [21].
         *
         * @param vrDescCP Valor para atribuir ao campo vrDescCP
         * @return O próprio InfoCPSeg para continuar populando outros campos
         */
        public InfoCPSeg<T> setVrDescCP(Double vrDescCP) {
          this.vrDescCP = vrDescCP;
          return this;
        }

        /**
         * Valor total calculado relativo à contribuição dos segurados.
         *
         * @return Conteúdo do campo vrCpSeg
         */
        public Double getVrCpSeg() {
          return this.vrCpSeg;
        }

        /**
         * Valor total calculado relativo à contribuição dos segurados.
         *
         * <p>Origem: campo {vrCpSeg}(5001_infoCpCalc_vrCpSeg) de S-5001.
         *
         * @param vrCpSeg Valor para atribuir ao campo vrCpSeg
         * @return O próprio InfoCPSeg para continuar populando outros campos
         */
        public InfoCPSeg<T> setVrCpSeg(Double vrCpSeg) {
          this.vrCpSeg = vrCpSeg;
          return this;
        }

        public InfoCPSeg(Object pai) {
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
       * Informações gerais do contribuinte
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "classTrib",
            "infoPJ",
          })
      public static class InfoContrib<T> {

        /**
         * Preencher com o código correspondente à classificação tributária do contribuinte,
         * conforme Tabela 08.
         */
        private String classTrib;

        /** Informações exclusivas da PJ */
        private InfoPJ infoPJ;

        /**
         * Preencher com o código correspondente à classificação tributária do contribuinte,
         * conforme Tabela 08.
         *
         * @return Conteúdo do campo classTrib
         */
        public String getClassTrib() {
          return this.classTrib;
        }

        /**
         * Preencher com o código correspondente à classificação tributária do contribuinte,
         * conforme Tabela 08.
         *
         * <p>Evento de origem: S-1000.
         *
         * @param classTrib Valor para atribuir ao campo classTrib
         * @return O próprio InfoContrib para continuar populando outros campos
         */
        public InfoContrib<T> setClassTrib(String classTrib) {
          this.classTrib = classTrib;
          return this;
        }

        /**
         * Informações exclusivas da PJ
         *
         * @return Conteúdo do campo infoPJ
         */
        public InfoPJ getInfoPJ() {
          return this.infoPJ;
        }

        /**
         * Informações exclusivas da PJ
         *
         * <p>DESCRICAO_COMPLETA:Informações complementares, exclusivas da Pessoa Jurídica.
         *
         * <p>CONDICAO_GRUPO: O (se {ideEmpregador/tpInsc}(5011_ideEmpregador_tpInsc) = [1]); N (nos
         * demais casos)
         *
         * @return O objeto InfoPJ para população dos campos filhos
         */
        public InfoPJ<InfoContrib<T>> setInfoPJ() {
          if (this.infoPJ == null) {
            this.infoPJ = new InfoPJ(this);
          }
          return this.infoPJ;
        }

        public InfoContrib(Object pai) {
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
         * Informações exclusivas da PJ
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "indCoop",
              "indConstr",
              "indSubstPatr",
              "percRedContrib",
              "infoAtConc",
            })
        public static class InfoPJ<T> {

          /** Indicativo de cooperativa. */
          private String indCoop;

          /** Indicativo de construtora. */
          private String indConstr;

          /** Indicativo de substituição da contribuição previdenciária patronal. */
          private String indSubstPatr;

          /** Percentual de redução da contribuição prevista na Lei 12.546/2011. */
          private Double percRedContrib;

          /** Informações de atividades concomitantes */
          private InfoAtConc infoAtConc;

          /**
           * Indicativo de cooperativa.
           *
           * @return Conteúdo do campo indCoop
           */
          public String getIndCoop() {
            return this.indCoop;
          }

          /**
           * Indicativo de cooperativa.
           *
           * <p>Evento de origem: S-1000.
           *
           * @param indCoop Valor para atribuir ao campo indCoop
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndCoop(String indCoop) {
            if (!"0".equals(indCoop)
                && !"1".equals(indCoop)
                && !"2".equals(indCoop)
                && !"3".equals(indCoop))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indCoop) + " inválido para o campo indCoop");
            this.indCoop = indCoop;
            return this;
          }
          /**
           * Não é cooperativa
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndCoop_0() {
            this.indCoop = "0";
            return this;
          }
          /**
           * Cooperativa de trabalho
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndCoop_1() {
            this.indCoop = "1";
            return this;
          }
          /**
           * Cooperativa de produção
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndCoop_2() {
            this.indCoop = "2";
            return this;
          }
          /**
           * Outras cooperativas
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndCoop_3() {
            this.indCoop = "3";
            return this;
          }

          /**
           * Indicativo de construtora.
           *
           * @return Conteúdo do campo indConstr
           */
          public String getIndConstr() {
            return this.indConstr;
          }

          /**
           * Indicativo de construtora.
           *
           * <p>Evento de origem: S-1000.
           *
           * @param indConstr Valor para atribuir ao campo indConstr
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndConstr(String indConstr) {
            if (!"0".equals(indConstr) && !"1".equals(indConstr))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indConstr) + " inválido para o campo indConstr");
            this.indConstr = indConstr;
            return this;
          }
          /**
           * Não é construtora
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndConstr_0() {
            this.indConstr = "0";
            return this;
          }
          /**
           * Empresa construtora
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndConstr_1() {
            this.indConstr = "1";
            return this;
          }

          /**
           * Indicativo de substituição da contribuição previdenciária patronal.
           *
           * @return Conteúdo do campo indSubstPatr
           */
          public String getIndSubstPatr() {
            return this.indSubstPatr;
          }

          /**
           * Indicativo de substituição da contribuição previdenciária patronal.
           *
           * <p>Origem: campo {indSubstPatr}(1280_infoSubstPatr_indSubstPatr) de S-1280.
           *
           * @param indSubstPatr Valor para atribuir ao campo indSubstPatr
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndSubstPatr(String indSubstPatr) {
            if (!"1".equals(indSubstPatr) && !"2".equals(indSubstPatr))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indSubstPatr) + " inválido para o campo indSubstPatr");
            this.indSubstPatr = indSubstPatr;
            return this;
          }
          /**
           * Integralmente substituída
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndSubstPatr_1() {
            this.indSubstPatr = "1";
            return this;
          }
          /**
           * Parcialmente substituída
           *
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setIndSubstPatr_2() {
            this.indSubstPatr = "2";
            return this;
          }

          /**
           * Percentual de redução da contribuição prevista na Lei 12.546/2011.
           *
           * @return Conteúdo do campo percRedContrib
           */
          public Double getPercRedContrib() {
            return this.percRedContrib;
          }

          /**
           * Percentual de redução da contribuição prevista na Lei 12.546/2011.
           *
           * <p>Evento de origem: S-1280.
           *
           * @param percRedContrib Valor para atribuir ao campo percRedContrib
           * @return O próprio InfoPJ para continuar populando outros campos
           */
          public InfoPJ<T> setPercRedContrib(Double percRedContrib) {
            this.percRedContrib = percRedContrib;
            return this;
          }

          /**
           * Informações de atividades concomitantes
           *
           * @return Conteúdo do campo infoAtConc
           */
          public InfoAtConc getInfoAtConc() {
            return this.infoAtConc;
          }

          /**
           * Informações de atividades concomitantes
           *
           * <p>DESCRICAO_COMPLETA:Informações prestadas por empresa enquadrada no regime de
           * tributação Simples Nacional com tributação previdenciária substituída e não
           * substituída.
           *
           * <p>CONDICAO_GRUPO: O (se {classTrib}(../../classTrib) = [03]; N (nos demais casos)
           *
           * @return O objeto InfoAtConc para população dos campos filhos
           */
          public InfoAtConc<InfoPJ<T>> setInfoAtConc() {
            if (this.infoAtConc == null) {
              this.infoAtConc = new InfoAtConc(this);
            }
            return this.infoAtConc;
          }

          public InfoPJ(Object pai) {
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
           * Informações de atividades concomitantes
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "fatorMes",
                "fator13",
              })
          public static class InfoAtConc<T> {

            /**
             * Informe o fator a ser utilizado para cálculo da contribuição patronal do mês dos
             * trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em
             * conjunto com as dos Anexos I a III e V da Lei Complementar 123/2006.
             */
            private Double fatorMes;

            /**
             * Informe o fator a ser utilizado para cálculo da contribuição patronal do décimo
             * terceiro dos trabalhadores envolvidos na execução das atividades enquadradas no Anexo
             * IV em conjunto com as dos Anexos I a III e V da Lei Complementar 123/2006.
             */
            private Double fator13;

            /**
             * Informe o fator a ser utilizado para cálculo da contribuição patronal do mês dos
             * trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em
             * conjunto com as dos Anexos I a III e V da Lei Complementar 123/2006.
             *
             * @return Conteúdo do campo fatorMes
             */
            public Double getFatorMes() {
              return this.fatorMes;
            }

            /**
             * Informe o fator a ser utilizado para cálculo da contribuição patronal do mês dos
             * trabalhadores envolvidos na execução das atividades enquadradas no Anexo IV em
             * conjunto com as dos Anexos I a III e V da Lei Complementar 123/2006.
             *
             * <p>Evento de origem: S-1280.
             *
             * @param fatorMes Valor para atribuir ao campo fatorMes
             * @return O próprio InfoAtConc para continuar populando outros campos
             */
            public InfoAtConc<T> setFatorMes(Double fatorMes) {
              this.fatorMes = fatorMes;
              return this;
            }

            /**
             * Informe o fator a ser utilizado para cálculo da contribuição patronal do décimo
             * terceiro dos trabalhadores envolvidos na execução das atividades enquadradas no Anexo
             * IV em conjunto com as dos Anexos I a III e V da Lei Complementar 123/2006.
             *
             * @return Conteúdo do campo fator13
             */
            public Double getFator13() {
              return this.fator13;
            }

            /**
             * Informe o fator a ser utilizado para cálculo da contribuição patronal do décimo
             * terceiro dos trabalhadores envolvidos na execução das atividades enquadradas no Anexo
             * IV em conjunto com as dos Anexos I a III e V da Lei Complementar 123/2006.
             *
             * <p>Evento de origem: S-1280.
             *
             * @param fator13 Valor para atribuir ao campo fator13
             * @return O próprio InfoAtConc para continuar populando outros campos
             */
            public InfoAtConc<T> setFator13(Double fator13) {
              this.fator13 = fator13;
              return this;
            }

            public InfoAtConc(Object pai) {
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
       * Identificação do estabelecimento/obra
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpInsc",
            "nrInsc",
            "infoEstab",
            "ideLotacao",
            "basesComerc",
            "infoCREstab",
          })
      public static class IdeEstab<T> {

        /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
        private String tpInsc;

        /**
         * Informar o número de inscrição do contribuinte de acordo com o tipo de inscrição indicado
         * no campo {ideEstab/tpInsc}(./tpInsc).
         */
        private String nrInsc;

        /** Informações do estabelecimento */
        private InfoEstab infoEstab;

        /**
         * Identificação da lotação tributária.
         *
         * <p>- Esse campo pode ser repetido indefinidas vezes
         */
        private java.util.List<IdeLotacao> ideLotacao;

        /**
         * Informações da comercialização da produção
         *
         * <p>- Esse campo pode ser repetido até 5 vezes
         */
        private java.util.List<BasesComerc> basesComerc;

        /**
         * Códigos de Receita por estabelecimento
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         */
        private java.util.List<InfoCREstab> infoCREstab;

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
         * <p>Evento de origem: S-1260, S-1270 ou S-5001.
         *
         * @param nrInsc Valor para atribuir ao campo nrInsc
         * @return O próprio IdeEstab para continuar populando outros campos
         */
        public IdeEstab<T> setNrInsc(String nrInsc) {
          this.nrInsc = nrInsc;
          return this;
        }

        /**
         * Informações do estabelecimento
         *
         * @return Conteúdo do campo infoEstab
         */
        public InfoEstab getInfoEstab() {
          return this.infoEstab;
        }

        /**
         * Informações do estabelecimento
         *
         * <p>DESCRICAO_COMPLETA:Informações relativas a cada estabelecimento, necessárias à
         * apuração das contribuições sociais.
         *
         * <p>CONDICAO_GRUPO: O (se {ideEmpregador/tpInsc}(5011_ideEmpregador_tpInsc) = [1]); N (nos
         * demais casos)
         *
         * @return O objeto InfoEstab para população dos campos filhos
         */
        public InfoEstab<IdeEstab<T>> setInfoEstab() {
          if (this.infoEstab == null) {
            this.infoEstab = new InfoEstab(this);
          }
          return this.infoEstab;
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
         * <p>CHAVE_GRUPO: {codLotacao}
         *
         * <p>CONDICAO_GRUPO: O (se existir informação em S-1200, S-1270, S-2299 ou S-2399 relativas
         * ao estabelecimento identificado em {ideEstab/nrInsc}(../nrInsc)); N (nos demais casos)
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

        /**
         * Informações da comercialização da produção
         *
         * @return Conteúdo do campo basesComerc
         */
        public java.util.List<BasesComerc> getBasesComerc() {
          return this.basesComerc;
        }

        /**
         * Informações da comercialização da produção
         *
         * <p>- Esse campo pode ser repetido até 5 vezes
         *
         * <p>DESCRICAO_COMPLETA:Informações de bases de cálculo relativas à comercialização da
         * produção rural da Pessoa Física.
         *
         * <p>Informações desse grupo conforme informado pelo contribuinte em S-1260.
         *
         * <p>CHAVE_GRUPO: {indComerc}
         *
         * <p>CONDICAO_GRUPO: O (se houver evento S-1260 válido na competência relativo ao
         * estabelecimento identificado em {ideEstab/nrInsc}(../nrInsc)); N (nos demais casos)
         *
         * @return O objeto BasesComerc para população dos campos filhos
         */
        public BasesComerc<IdeEstab<T>> setBasesComerc_Next() {
          if (this.basesComerc == null) {
            this.basesComerc = new java.util.ArrayList<>();
          }
          BasesComerc toAdd = new BasesComerc(this);
          this.basesComerc.add(toAdd);
          return toAdd;
        }

        /**
         * Códigos de Receita por estabelecimento
         *
         * @return Conteúdo do campo infoCREstab
         */
        public java.util.List<InfoCREstab> getInfoCREstab() {
          return this.infoCREstab;
        }

        /**
         * Códigos de Receita por estabelecimento
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         *
         * <p>DESCRICAO_COMPLETA:Informações das contribuições sociais devidas à Previdência Social
         * e Outras Entidades e Fundos, consolidadas por estabelecimento e por Código de Receita -
         * CR.
         *
         * <p>CHAVE_GRUPO: {tpCR}
         *
         * <p>CONDICAO_GRUPO: OC
         *
         * @return O objeto InfoCREstab para população dos campos filhos
         */
        public InfoCREstab<IdeEstab<T>> setInfoCREstab_Next() {
          if (this.infoCREstab == null) {
            this.infoCREstab = new java.util.ArrayList<>();
          }
          InfoCREstab toAdd = new InfoCREstab(this);
          this.infoCREstab.add(toAdd);
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
         * Informações do estabelecimento
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "cnaePrep",
              "aliqRat",
              "fap",
              "aliqRatAjust",
              "infoComplObra",
            })
        public static class InfoEstab<T> {

          /** Preencher com o código CNAE, conforme informado em S-1005. */
          private Integer cnaePrep;

          /** Informar a alíquota RAT. */
          private String aliqRat;

          /** Fator Acidentário de Prevenção - FAP. */
          private Double fap;

          /** Alíquota do RAT após ajuste pelo FAP. */
          private Double aliqRatAjust;

          /** Informações complementares relativas a obras */
          private InfoComplObra infoComplObra;

          /**
           * Preencher com o código CNAE, conforme informado em S-1005.
           *
           * @return Conteúdo do campo cnaePrep
           */
          public Integer getCnaePrep() {
            return this.cnaePrep;
          }

          /**
           * Preencher com o código CNAE, conforme informado em S-1005.
           *
           * <p>Evento de origem: S-1005.
           *
           * @param cnaePrep Valor para atribuir ao campo cnaePrep
           * @return O próprio InfoEstab para continuar populando outros campos
           */
          public InfoEstab<T> setCnaePrep(Integer cnaePrep) {
            this.cnaePrep = cnaePrep;
            return this;
          }

          /**
           * Informar a alíquota RAT.
           *
           * @return Conteúdo do campo aliqRat
           */
          public String getAliqRat() {
            return this.aliqRat;
          }

          /**
           * Informar a alíquota RAT.
           *
           * <p>Validação: Deve corresponder à alíquota declarada no evento S-1005. Caso não haja
           * informação, retornar a alíquota definida na legislação vigente para o código CNAE
           * informado.
           *
           * @param aliqRat Valor para atribuir ao campo aliqRat
           * @return O próprio InfoEstab para continuar populando outros campos
           */
          public InfoEstab<T> setAliqRat(String aliqRat) {
            if (!"1".equals(aliqRat) && !"2".equals(aliqRat) && !"3".equals(aliqRat))
              throw new RuntimeException(
                  "Valor " + String.valueOf(aliqRat) + " inválido para o campo aliqRat");
            this.aliqRat = aliqRat;
            return this;
          }

          public InfoEstab<T> setAliqRat_1() {
            this.aliqRat = "1";
            return this;
          }

          public InfoEstab<T> setAliqRat_2() {
            this.aliqRat = "2";
            return this;
          }

          public InfoEstab<T> setAliqRat_3() {
            this.aliqRat = "3";
            return this;
          }

          /**
           * Fator Acidentário de Prevenção - FAP.
           *
           * @return Conteúdo do campo fap
           */
          public Double getFap() {
            return this.fap;
          }

          /**
           * Fator Acidentário de Prevenção - FAP.
           *
           * <p>Validação: Deve corresponder ao FAP declarado no evento S-1005. Caso não haja
           * informação, retornar o FAP estabelecido para a empresa pelo órgão governamental
           * competente.
           *
           * @param fap Valor para atribuir ao campo fap
           * @return O próprio InfoEstab para continuar populando outros campos
           */
          public InfoEstab<T> setFap(Double fap) {
            this.fap = fap;
            return this;
          }

          /**
           * Alíquota do RAT após ajuste pelo FAP.
           *
           * @return Conteúdo do campo aliqRatAjust
           */
          public Double getAliqRatAjust() {
            return this.aliqRatAjust;
          }

          /**
           * Alíquota do RAT após ajuste pelo FAP.
           *
           * <p>Validação: Deve corresponder ao resultado da multiplicação dos campos
           * {infoEstab/aliqRat}(./aliqRat) e {infoEstab/fap}(./fap).
           *
           * @param aliqRatAjust Valor para atribuir ao campo aliqRatAjust
           * @return O próprio InfoEstab para continuar populando outros campos
           */
          public InfoEstab<T> setAliqRatAjust(Double aliqRatAjust) {
            this.aliqRatAjust = aliqRatAjust;
            return this;
          }

          /**
           * Informações complementares relativas a obras
           *
           * @return Conteúdo do campo infoComplObra
           */
          public InfoComplObra getInfoComplObra() {
            return this.infoComplObra;
          }

          /**
           * Informações complementares relativas a obras
           *
           * <p>DESCRICAO_COMPLETA:Informações complementares relativas a obras de construção civil.
           *
           * <p>CONDICAO_GRUPO: O (se {indConstr}(5011_infoCS_infoContrib_infoPJ_indConstr) = [1] e
           * {ideEstab/tpInsc}(../../tpInsc) = [4]); N (nos demais casos)
           *
           * @return O objeto InfoComplObra para população dos campos filhos
           */
          public InfoComplObra<InfoEstab<T>> setInfoComplObra() {
            if (this.infoComplObra == null) {
              this.infoComplObra = new InfoComplObra(this);
            }
            return this.infoComplObra;
          }

          public InfoEstab(Object pai) {
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
           * Informações complementares relativas a obras
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "indSubstPatrObra",
              })
          public static class InfoComplObra<T> {

            /** Indicativo de substituição da contribuição patronal de obra de construção civil. */
            private String indSubstPatrObra;

            /**
             * Indicativo de substituição da contribuição patronal de obra de construção civil.
             *
             * @return Conteúdo do campo indSubstPatrObra
             */
            public String getIndSubstPatrObra() {
              return this.indSubstPatrObra;
            }

            /**
             * Indicativo de substituição da contribuição patronal de obra de construção civil.
             *
             * <p>Origem: campo
             * {indSubstPatrObra}(1005_infoEstab_inclusao_dadosEstab_infoObra_indSubstPatrObra) de
             * S-1005.
             *
             * @param indSubstPatrObra Valor para atribuir ao campo indSubstPatrObra
             * @return O próprio InfoComplObra para continuar populando outros campos
             */
            public InfoComplObra<T> setIndSubstPatrObra(String indSubstPatrObra) {
              if (!"1".equals(indSubstPatrObra) && !"2".equals(indSubstPatrObra))
                throw new RuntimeException(
                    "Valor "
                        + String.valueOf(indSubstPatrObra)
                        + " inválido para o campo indSubstPatrObra");
              this.indSubstPatrObra = indSubstPatrObra;
              return this;
            }
            /**
             * Contribuição patronal substituída
             *
             * @return O próprio InfoComplObra para continuar populando outros campos
             */
            public InfoComplObra<T> setIndSubstPatrObra_1() {
              this.indSubstPatrObra = "1";
              return this;
            }
            /**
             * Contribuição patronal não substituída
             *
             * @return O próprio InfoComplObra para continuar populando outros campos
             */
            public InfoComplObra<T> setIndSubstPatrObra_2() {
              this.indSubstPatrObra = "2";
              return this;
            }

            public InfoComplObra(Object pai) {
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
         * Identificação da lotação tributária.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "codLotacao",
              "fpas",
              "codTercs",
              "codTercsSusp",
              "infoTercSusp",
              "infoEmprParcial",
              "dadosOpPort",
              "basesRemun",
              "basesAvNPort",
              "infoSubstPatrOpPort",
            })
        public static class IdeLotacao<T> {

          /** Informar o código atribuído pelo empregador para a lotação tributária. */
          private String codLotacao;

          /** Preencher com o código relativo ao FPAS. */
          private Integer fpas;

          /** Preencher com o código de Terceiros, conforme Tabela 04. */
          private String codTercs;

          /**
           * Informar o código combinado dos Terceiros para os quais o recolhimento está suspenso em
           * virtude de processos judiciais.
           */
          private String codTercsSusp;

          /**
           * Informações de suspensão de contribuição a Terceiros
           *
           * <p>- Esse campo pode ser repetido até 15 vezes
           */
          private java.util.List<InfoTercSusp> infoTercSusp;

          /** Informação complementar de obra de construção civil */
          private InfoEmprParcial infoEmprParcial;

          /** Informações relativas ao operador portuário. */
          private DadosOpPort dadosOpPort;

          /**
           * Bases de cálculo por categoria
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           */
          private java.util.List<BasesRemun> basesRemun;

          /** Contratação de avulsos não portuários */
          private BasesAvNPort basesAvNPort;

          /** Informação de substituição prevista na Lei 12.546/2011 */
          private InfoSubstPatrOpPort infoSubstPatrOpPort;

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
           * <p>Evento de origem: S-1270 ou S-5001.
           *
           * @param codLotacao Valor para atribuir ao campo codLotacao
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setCodLotacao(String codLotacao) {
            this.codLotacao = codLotacao;
            return this;
          }

          /**
           * Preencher com o código relativo ao FPAS.
           *
           * @return Conteúdo do campo fpas
           */
          public Integer getFpas() {
            return this.fpas;
          }

          /**
           * Preencher com o código relativo ao FPAS.
           *
           * <p>Evento de origem: S-1020.
           *
           * @param fpas Valor para atribuir ao campo fpas
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setFpas(Integer fpas) {
            this.fpas = fpas;
            return this;
          }

          /**
           * Preencher com o código de Terceiros, conforme Tabela 04.
           *
           * @return Conteúdo do campo codTercs
           */
          public String getCodTercs() {
            return this.codTercs;
          }

          /**
           * Preencher com o código de Terceiros, conforme Tabela 04.
           *
           * <p>Evento de origem: S-1020.
           *
           * @param codTercs Valor para atribuir ao campo codTercs
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setCodTercs(String codTercs) {
            this.codTercs = codTercs;
            return this;
          }

          /**
           * Informar o código combinado dos Terceiros para os quais o recolhimento está suspenso em
           * virtude de processos judiciais.
           *
           * @return Conteúdo do campo codTercsSusp
           */
          public String getCodTercsSusp() {
            return this.codTercsSusp;
          }

          /**
           * Informar o código combinado dos Terceiros para os quais o recolhimento está suspenso em
           * virtude de processos judiciais.
           *
           * <p>Evento de origem: S-1020.
           *
           * @param codTercsSusp Valor para atribuir ao campo codTercsSusp
           * @return O próprio IdeLotacao para continuar populando outros campos
           */
          public IdeLotacao<T> setCodTercsSusp(String codTercsSusp) {
            this.codTercsSusp = codTercsSusp;
            return this;
          }

          /**
           * Informações de suspensão de contribuição a Terceiros
           *
           * @return Conteúdo do campo infoTercSusp
           */
          public java.util.List<InfoTercSusp> getInfoTercSusp() {
            return this.infoTercSusp;
          }

          /**
           * Informações de suspensão de contribuição a Terceiros
           *
           * <p>- Esse campo pode ser repetido até 15 vezes
           *
           * <p>DESCRICAO_COMPLETA:Informações de suspensão de contribuições destinadas a Outras
           * Entidades e Fundos (Terceiros).
           *
           * <p>CHAVE_GRUPO: {codTerc}
           *
           * <p>CONDICAO_GRUPO: OC
           *
           * @return O objeto InfoTercSusp para população dos campos filhos
           */
          public InfoTercSusp<IdeLotacao<T>> setInfoTercSusp_Next() {
            if (this.infoTercSusp == null) {
              this.infoTercSusp = new java.util.ArrayList<>();
            }
            InfoTercSusp toAdd = new InfoTercSusp(this);
            this.infoTercSusp.add(toAdd);
            return toAdd;
          }

          /**
           * Informação complementar de obra de construção civil
           *
           * @return Conteúdo do campo infoEmprParcial
           */
          public InfoEmprParcial getInfoEmprParcial() {
            return this.infoEmprParcial;
          }

          /**
           * Informação complementar de obra de construção civil
           *
           * <p>DESCRICAO_COMPLETA:Informação complementar que apresenta identificação do
           * contratante e do proprietário de obra de construção civil contratada sob regime de
           * empreitada parcial ou subempreitada.
           *
           * <p>Evento de origem: S-1020.
           *
           * <p>CONDICAO_GRUPO: O (se {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao)
           * em S-1020 relativo a {codLotacao}(../codLotacao) for igual a [02]); N (nos demais
           * casos)
           *
           * @return O objeto InfoEmprParcial para população dos campos filhos
           */
          public InfoEmprParcial<IdeLotacao<T>> setInfoEmprParcial() {
            if (this.infoEmprParcial == null) {
              this.infoEmprParcial = new InfoEmprParcial(this);
            }
            return this.infoEmprParcial;
          }

          /**
           * Informações relativas ao operador portuário.
           *
           * @return Conteúdo do campo dadosOpPort
           */
          public DadosOpPort getDadosOpPort() {
            return this.dadosOpPort;
          }

          /**
           * Informações relativas ao operador portuário.
           *
           * <p>CONDICAO_GRUPO: O (se {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao)
           * em S-1020 relativo a {codLotacao}(../codLotacao) for igual a [08]); N (nos demais
           * casos)
           *
           * @return O objeto DadosOpPort para população dos campos filhos
           */
          public DadosOpPort<IdeLotacao<T>> setDadosOpPort() {
            if (this.dadosOpPort == null) {
              this.dadosOpPort = new DadosOpPort(this);
            }
            return this.dadosOpPort;
          }

          /**
           * Bases de cálculo por categoria
           *
           * @return Conteúdo do campo basesRemun
           */
          public java.util.List<BasesRemun> getBasesRemun() {
            return this.basesRemun;
          }

          /**
           * Bases de cálculo por categoria
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           *
           * <p>DESCRICAO_COMPLETA:Bases de cálculo da contribuição previdenciária incidente sobre
           * remunerações, por categoria.
           *
           * <p>CHAVE_GRUPO: {indIncid}, {codCateg}
           *
           * <p>CONDICAO_GRUPO: O (se houver evento S-1200/S-2299/S-2399 com informações de
           * remuneração válido na competência relativo ao estabelecimento identificado em
           * {ideEstab/nrInsc}(../../nrInsc)); N (nos demais casos)
           *
           * @return O objeto BasesRemun para população dos campos filhos
           */
          public BasesRemun<IdeLotacao<T>> setBasesRemun_Next() {
            if (this.basesRemun == null) {
              this.basesRemun = new java.util.ArrayList<>();
            }
            BasesRemun toAdd = new BasesRemun(this);
            this.basesRemun.add(toAdd);
            return toAdd;
          }

          /**
           * Contratação de avulsos não portuários
           *
           * @return Conteúdo do campo basesAvNPort
           */
          public BasesAvNPort getBasesAvNPort() {
            return this.basesAvNPort;
          }

          /**
           * Contratação de avulsos não portuários
           *
           * <p>DESCRICAO_COMPLETA:Informações de bases de cálculo relativas à contratação de
           * trabalhadores avulsos não portuários.
           *
           * <p>Informações desse grupo conforme informado pelo contribuinte em S-1270.
           *
           * <p>CONDICAO_GRUPO: O (se houver evento S-1270 válido na competência relativo ao
           * estabelecimento identificado em {ideEstab/nrInsc}(../../nrInsc)); N (nos demais casos)
           *
           * @return O objeto BasesAvNPort para população dos campos filhos
           */
          public BasesAvNPort<IdeLotacao<T>> setBasesAvNPort() {
            if (this.basesAvNPort == null) {
              this.basesAvNPort = new BasesAvNPort(this);
            }
            return this.basesAvNPort;
          }

          /**
           * Informação de substituição prevista na Lei 12.546/2011
           *
           * @return Conteúdo do campo infoSubstPatrOpPort
           */
          public InfoSubstPatrOpPort getInfoSubstPatrOpPort() {
            return this.infoSubstPatrOpPort;
          }

          /**
           * Informação de substituição prevista na Lei 12.546/2011
           *
           * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente pelo Órgão Gestor de Mão de Obra
           * - OGMO ({classTrib}(5011_infoCS_infoContrib_classTrib) = [09]), relativamente a
           * operador portuário enquadrado nos arts. 7º a 9º da Lei 12.546/2011.
           *
           * <p>CONDICAO_GRUPO: OC (se {classTrib}(5011_infoCS_infoContrib_classTrib) = [09]; N (nos
           * demais casos)
           *
           * @return O objeto InfoSubstPatrOpPort para população dos campos filhos
           */
          public InfoSubstPatrOpPort<IdeLotacao<T>> setInfoSubstPatrOpPort() {
            if (this.infoSubstPatrOpPort == null) {
              this.infoSubstPatrOpPort = new InfoSubstPatrOpPort(this);
            }
            return this.infoSubstPatrOpPort;
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
           * Informações de suspensão de contribuição a Terceiros
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "codTerc",
              })
          public static class InfoTercSusp<T> {

            /** Informar o código de Terceiro. */
            private String codTerc;

            /**
             * Informar o código de Terceiro.
             *
             * @return Conteúdo do campo codTerc
             */
            public String getCodTerc() {
              return this.codTerc;
            }

            /**
             * Informar o código de Terceiro.
             *
             * <p>Origem: campo
             * {codTerc}(1020_infoLotacao_inclusao_dadosLotacao_fpasLotacao_infoProcJudTerceiros_procJudTerceiro_codTerc)
             * de S-1020.
             *
             * @param codTerc Valor para atribuir ao campo codTerc
             * @return O próprio InfoTercSusp para continuar populando outros campos
             */
            public InfoTercSusp<T> setCodTerc(String codTerc) {
              this.codTerc = codTerc;
              return this;
            }

            public InfoTercSusp(Object pai) {
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
           * Informação complementar de obra de construção civil
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "tpInscContrat",
                "nrInscContrat",
                "tpInscProp",
                "nrInscProp",
                "cnoObra",
              })
          public static class InfoEmprParcial<T> {

            /** Tipo de inscrição do contratante. */
            private String tpInscContrat;

            /** Número de inscrição (CNPJ/CPF) do contratante. */
            private String nrInscContrat;

            /** Tipo de inscrição do proprietário do CNO. */
            private String tpInscProp;

            /** Preencher com o número de inscrição (CNPJ/CPF) do proprietário do CNO. */
            private String nrInscProp;

            /** Número do CNO da obra. */
            private String cnoObra;

            /**
             * Tipo de inscrição do contratante.
             *
             * @return Conteúdo do campo tpInscContrat
             */
            public String getTpInscContrat() {
              return this.tpInscContrat;
            }

            /**
             * Tipo de inscrição do contratante.
             *
             * @param tpInscContrat Valor para atribuir ao campo tpInscContrat
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setTpInscContrat(String tpInscContrat) {
              if (!"1".equals(tpInscContrat) && !"2".equals(tpInscContrat))
                throw new RuntimeException(
                    "Valor "
                        + String.valueOf(tpInscContrat)
                        + " inválido para o campo tpInscContrat");
              this.tpInscContrat = tpInscContrat;
              return this;
            }
            /**
             * CNPJ
             *
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setTpInscContrat_1() {
              this.tpInscContrat = "1";
              return this;
            }
            /**
             * CPF
             *
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setTpInscContrat_2() {
              this.tpInscContrat = "2";
              return this;
            }

            /**
             * Número de inscrição (CNPJ/CPF) do contratante.
             *
             * @return Conteúdo do campo nrInscContrat
             */
            public String getNrInscContrat() {
              return this.nrInscContrat;
            }

            /**
             * Número de inscrição (CNPJ/CPF) do contratante.
             *
             * @param nrInscContrat Valor para atribuir ao campo nrInscContrat
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setNrInscContrat(String nrInscContrat) {
              this.nrInscContrat = nrInscContrat;
              return this;
            }

            /**
             * Tipo de inscrição do proprietário do CNO.
             *
             * @return Conteúdo do campo tpInscProp
             */
            public String getTpInscProp() {
              return this.tpInscProp;
            }

            /**
             * Tipo de inscrição do proprietário do CNO.
             *
             * @param tpInscProp Valor para atribuir ao campo tpInscProp
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setTpInscProp(String tpInscProp) {
              if (!"1".equals(tpInscProp) && !"2".equals(tpInscProp))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpInscProp) + " inválido para o campo tpInscProp");
              this.tpInscProp = tpInscProp;
              return this;
            }
            /**
             * CNPJ
             *
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setTpInscProp_1() {
              this.tpInscProp = "1";
              return this;
            }
            /**
             * CPF
             *
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setTpInscProp_2() {
              this.tpInscProp = "2";
              return this;
            }

            /**
             * Preencher com o número de inscrição (CNPJ/CPF) do proprietário do CNO.
             *
             * @return Conteúdo do campo nrInscProp
             */
            public String getNrInscProp() {
              return this.nrInscProp;
            }

            /**
             * Preencher com o número de inscrição (CNPJ/CPF) do proprietário do CNO.
             *
             * @param nrInscProp Valor para atribuir ao campo nrInscProp
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setNrInscProp(String nrInscProp) {
              this.nrInscProp = nrInscProp;
              return this;
            }

            /**
             * Número do CNO da obra.
             *
             * @return Conteúdo do campo cnoObra
             */
            public String getCnoObra() {
              return this.cnoObra;
            }

            /**
             * Número do CNO da obra.
             *
             * @param cnoObra Valor para atribuir ao campo cnoObra
             * @return O próprio InfoEmprParcial para continuar populando outros campos
             */
            public InfoEmprParcial<T> setCnoObra(String cnoObra) {
              this.cnoObra = cnoObra;
              return this;
            }

            public InfoEmprParcial(Object pai) {
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
           * Informações relativas ao operador portuário.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "cnpjOpPortuario",
                "aliqRat",
                "fap",
                "aliqRatAjust",
              })
          public static class DadosOpPort<T> {

            /** Preencher com o CNPJ do operador portuário. */
            private String cnpjOpPortuario;

            /** Informar a alíquota RAT. */
            private String aliqRat;

            /** Fator Acidentário de Prevenção - FAP. */
            private Double fap;

            /** Alíquota do RAT após ajuste pelo FAP. */
            private Double aliqRatAjust;

            /**
             * Preencher com o CNPJ do operador portuário.
             *
             * @return Conteúdo do campo cnpjOpPortuario
             */
            public String getCnpjOpPortuario() {
              return this.cnpjOpPortuario;
            }

            /**
             * Preencher com o CNPJ do operador portuário.
             *
             * <p>Origem: campo {dadosLotacao/nrInsc}(1020_infoLotacao_inclusao_dadosLotacao_nrInsc)
             * de S-1020.
             *
             * @param cnpjOpPortuario Valor para atribuir ao campo cnpjOpPortuario
             * @return O próprio DadosOpPort para continuar populando outros campos
             */
            public DadosOpPort<T> setCnpjOpPortuario(String cnpjOpPortuario) {
              this.cnpjOpPortuario = cnpjOpPortuario;
              return this;
            }

            /**
             * Informar a alíquota RAT.
             *
             * @return Conteúdo do campo aliqRat
             */
            public String getAliqRat() {
              return this.aliqRat;
            }

            /**
             * Informar a alíquota RAT.
             *
             * <p>Origem: campo
             * {dadosOpPort/aliqRat}(1020_infoLotacao_inclusao_dadosLotacao_dadosOpPort_aliqRat) de
             * S-1020.
             *
             * @param aliqRat Valor para atribuir ao campo aliqRat
             * @return O próprio DadosOpPort para continuar populando outros campos
             */
            public DadosOpPort<T> setAliqRat(String aliqRat) {
              if (!"1".equals(aliqRat) && !"2".equals(aliqRat) && !"3".equals(aliqRat))
                throw new RuntimeException(
                    "Valor " + String.valueOf(aliqRat) + " inválido para o campo aliqRat");
              this.aliqRat = aliqRat;
              return this;
            }

            public DadosOpPort<T> setAliqRat_1() {
              this.aliqRat = "1";
              return this;
            }

            public DadosOpPort<T> setAliqRat_2() {
              this.aliqRat = "2";
              return this;
            }

            public DadosOpPort<T> setAliqRat_3() {
              this.aliqRat = "3";
              return this;
            }

            /**
             * Fator Acidentário de Prevenção - FAP.
             *
             * @return Conteúdo do campo fap
             */
            public Double getFap() {
              return this.fap;
            }

            /**
             * Fator Acidentário de Prevenção - FAP.
             *
             * <p>Origem: campo
             * {dadosOpPort/fap}(1020_infoLotacao_inclusao_dadosLotacao_dadosOpPort_fap) de S-1020.
             *
             * @param fap Valor para atribuir ao campo fap
             * @return O próprio DadosOpPort para continuar populando outros campos
             */
            public DadosOpPort<T> setFap(Double fap) {
              this.fap = fap;
              return this;
            }

            /**
             * Alíquota do RAT após ajuste pelo FAP.
             *
             * @return Conteúdo do campo aliqRatAjust
             */
            public Double getAliqRatAjust() {
              return this.aliqRatAjust;
            }

            /**
             * Alíquota do RAT após ajuste pelo FAP.
             *
             * <p>Validação: Deve corresponder ao resultado da multiplicação dos campos
             * {dadosOpPort/aliqRat}(./aliqRat) e {dadosOpPort/fap}(./fap).
             *
             * @param aliqRatAjust Valor para atribuir ao campo aliqRatAjust
             * @return O próprio DadosOpPort para continuar populando outros campos
             */
            public DadosOpPort<T> setAliqRatAjust(Double aliqRatAjust) {
              this.aliqRatAjust = aliqRatAjust;
              return this;
            }

            public DadosOpPort(Object pai) {
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
           * Bases de cálculo por categoria
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "indIncid",
                "codCateg",
                "basesCp",
              })
          public static class BasesRemun<T> {

            /**
             * Preencher com o código correspondente ao tipo de incidência para fins de apuração da
             * contribuição previdenciária.
             */
            private String indIncid;

            /** Preencher com o código da categoria do trabalhador, conforme definido em S-5001. */
            private Integer codCateg;

            /** Bases, contribuições do segurado e deduções da CP */
            private BasesCp basesCp;

            /**
             * Preencher com o código correspondente ao tipo de incidência para fins de apuração da
             * contribuição previdenciária.
             *
             * @return Conteúdo do campo indIncid
             */
            public String getIndIncid() {
              return this.indIncid;
            }

            /**
             * Preencher com o código correspondente ao tipo de incidência para fins de apuração da
             * contribuição previdenciária.
             *
             * <p>Validação: a) Para empresas com {classTrib}(5011_infoCS_infoContrib_classTrib) =
             * [01, 70, 80], todas as bases de cálculo devem ser totalizadas com
             * {indIncid}(./indIncid) = [9].
             *
             * <p>b) Para empresas com {classTrib}(5011_infoCS_infoContrib_classTrib) = [03],
             * considerar a informação prestada no campo
             * {indSimples}(5001_infoCp_ideEstabLot_infoCategIncid_indSimples) do evento S-5001,
             * conforme abaixo:
             *
             * <p>- Se o {indSimples}(5001_infoCp_ideEstabLot_infoCategIncid_indSimples) em S-5001 =
             * [1] (contrib. subst. integralmente), a base de cálculo do respectivo trabalhador deve
             * ser totalizada com {indIncid}(./indIncid) = [9];
             *
             * <p>- Se o {indSimples}(5001_infoCp_ideEstabLot_infoCategIncid_indSimples) em S-5001 =
             * [2] (contrib. não substituída), a base de cálculo do respectivo trabalhador deve ser
             * totalizada com {indIncid}(./indIncid) = [1] (normal);
             *
             * <p>- Se o {indSimples}(5001_infoCp_ideEstabLot_infoCategIncid_indSimples) em S-5001 =
             * [3] (ativ. concomitante), a base de cálculo do respectivo trabalhador deve ser
             * totalizada com {indIncid}(./indIncid) = [2].
             *
             * <p>c) Para empresas com {classTrib}(5011_infoCS_infoContrib_classTrib) = [10]
             * (sindicato de avulsos não portuários), as bases de cálculo dos trabalhadores avulsos
             * da categoria [202] devem ser totalizadas com {indIncid}(./indIncid) = [9].
             *
             * <p>d) Para {classTrib}(5011_infoCS_infoContrib_classTrib) = [22] (segurado especial),
             * as bases de cálculo dos trabalhadores devem ser totalizadas com
             * {indIncid}(./indIncid) = [9], EXCETO para a categoria [104] (empregado doméstico),
             * que deve ser totalizada com {indIncid}(./indIncid) = [1].
             *
             * <p>e) Para contribuinte com {classTrib}(5011_infoCS_infoContrib_classTrib) = [99] e
             * com {indCoop}(5011_infoCS_infoContrib_infoPJ_indCoop) = [1] (cooperativa de
             * trabalho), as remunerações dos cooperados (categoria [731, 734]) cuja lotação esteja
             * classificada com {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao) em
             * S-1020 = [05, 06, 07] devem ser totalizadas com {indIncid}(./indIncid) = [9]. Nos
             * demais casos, {indIncid}(./indIncid) = [1].
             *
             * <p>f) Para contribuintes com {classTrib}(5011_infoCS_infoContrib_classTrib) = [11],
             * as bases de cálculo dos trabalhadores devem ser totalizadas com
             * {indIncid}(./indIncid) = [9], EXCETO para as categorias de contribuinte individual,
             * que devem ser totalizadas com {indIncid}(./indIncid) = [1].
             *
             * <p>g) Para {tpLotacao}(1020_infoLotacao_inclusao_dadosLotacao_tpLotacao) em S-1020 =
             * [91], todas as bases de cálculo devem ser totalizadas com {indIncid}(./indIncid) =
             * [9].
             *
             * @param indIncid Valor para atribuir ao campo indIncid
             * @return O próprio BasesRemun para continuar populando outros campos
             */
            public BasesRemun<T> setIndIncid(String indIncid) {
              if (!"1".equals(indIncid) && !"2".equals(indIncid) && !"9".equals(indIncid))
                throw new RuntimeException(
                    "Valor " + String.valueOf(indIncid) + " inválido para o campo indIncid");
              this.indIncid = indIncid;
              return this;
            }
            /**
             * Normal
             *
             * @return O próprio BasesRemun para continuar populando outros campos
             */
            public BasesRemun<T> setIndIncid_1() {
              this.indIncid = "1";
              return this;
            }
            /**
             * Atividade concomitante
             *
             * @return O próprio BasesRemun para continuar populando outros campos
             */
            public BasesRemun<T> setIndIncid_2() {
              this.indIncid = "2";
              return this;
            }
            /**
             * Substituída ou isenta
             *
             * @return O próprio BasesRemun para continuar populando outros campos
             */
            public BasesRemun<T> setIndIncid_9() {
              this.indIncid = "9";
              return this;
            }

            /**
             * Preencher com o código da categoria do trabalhador, conforme definido em S-5001.
             *
             * @return Conteúdo do campo codCateg
             */
            public Integer getCodCateg() {
              return this.codCateg;
            }

            /**
             * Preencher com o código da categoria do trabalhador, conforme definido em S-5001.
             *
             * @param codCateg Valor para atribuir ao campo codCateg
             * @return O próprio BasesRemun para continuar populando outros campos
             */
            public BasesRemun<T> setCodCateg(Integer codCateg) {
              this.codCateg = codCateg;
              return this;
            }

            /**
             * Bases, contribuições do segurado e deduções da CP
             *
             * @return Conteúdo do campo basesCp
             */
            public BasesCp getBasesCp() {
              return this.basesCp;
            }

            /**
             * Bases, contribuições do segurado e deduções da CP
             *
             * <p>DESCRICAO_COMPLETA:Valores correspondentes às bases, contribuições do segurado e
             * deduções da contribuição previdenciária.
             *
             * @return O objeto BasesCp para população dos campos filhos
             */
            public BasesCp<BasesRemun<T>> setBasesCp() {
              if (this.basesCp == null) {
                this.basesCp = new BasesCp(this);
              }
              return this.basesCp;
            }

            public BasesRemun(Object pai) {
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
             * Bases, contribuições do segurado e deduções da CP
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "vrBcCp00",
                  "vrBcCp15",
                  "vrBcCp20",
                  "vrBcCp25",
                  "vrSuspBcCp00",
                  "vrSuspBcCp15",
                  "vrSuspBcCp20",
                  "vrSuspBcCp25",
                  "vrBcCp00VA",
                  "vrBcCp15VA",
                  "vrBcCp20VA",
                  "vrBcCp25VA",
                  "vrSuspBcCp00VA",
                  "vrSuspBcCp15VA",
                  "vrSuspBcCp20VA",
                  "vrSuspBcCp25VA",
                  "vrDescSest",
                  "vrCalcSest",
                  "vrDescSenat",
                  "vrCalcSenat",
                  "vrSalFam",
                  "vrSalMat",
                })
            public static class BasesCp<T> {

              /**
               * Preencher com a base de cálculo da contribuição previdenciária sobre a remuneração.
               */
              private Double vrBcCp00;

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição.
               */
              private Double vrBcCp15;

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição.
               */
              private Double vrBcCp20;

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição.
               */
              private Double vrBcCp25;

              /** Valor da BC com incidência suspensa em decorrência de decisão judicial. */
              private Double vrSuspBcCp00;

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 15 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               */
              private Double vrSuspBcCp15;

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador expectativa de aposentadoria
               * especial aos 20 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               */
              private Double vrSuspBcCp20;

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 25 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               */
              private Double vrSuspBcCp25;

              /**
               * Preencher com a base de cálculo da contribuição previdenciária sobre a remuneração
               * - Contrato Verde e Amarelo.
               */
              private Double vrBcCp00VA;

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição - Contrato Verde
               * e Amarelo.
               */
              private Double vrBcCp15VA;

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição - Contrato Verde
               * e Amarelo.
               */
              private Double vrBcCp20VA;

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição - Contrato Verde
               * e Amarelo.
               */
              private Double vrBcCp25VA;

              /**
               * Valor da BC com incidência suspensa em decorrência de decisão judicial - Contrato
               * Verde e Amarelo.
               */
              private Double vrSuspBcCp00VA;

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 15 anos de trabalho, com incidência suspensa em decorrência de decisão judicial
               * - Contrato Verde e Amarelo.
               */
              private Double vrSuspBcCp15VA;

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador expectativa de aposentadoria
               * especial aos 20 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial - Contrato Verde e Amarelo.
               */
              private Double vrSuspBcCp20VA;

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 25 anos de trabalho, com incidência suspensa em decorrência de decisão judicial
               * - Contrato Verde e Amarelo.
               */
              private Double vrSuspBcCp25VA;

              /** Valor total descontado do trabalhador para recolhimento ao SEST. */
              private Double vrDescSest;

              /**
               * Valor calculado relativo à contribuição devida pelo trabalhador para recolhimento
               * ao SEST.
               */
              private Double vrCalcSest;

              /** Valor total descontado do trabalhador para recolhimento ao SENAT. */
              private Double vrDescSenat;

              /**
               * Valor calculado relativo à contribuição devida pelo trabalhador para recolhimento
               * ao SENAT.
               */
              private Double vrCalcSenat;

              /** Valor total do salário-família para a categoria indicada. */
              private Double vrSalFam;

              /** Valor total do salário-maternidade para a categoria indicada. */
              private Double vrSalMat;

              /**
               * Preencher com a base de cálculo da contribuição previdenciária sobre a remuneração.
               *
               * @return Conteúdo do campo vrBcCp00
               */
              public Double getVrBcCp00() {
                return this.vrBcCp00;
              }

              /**
               * Preencher com a base de cálculo da contribuição previdenciária sobre a remuneração.
               *
               * <p>Origem: para {codCateg}(../codCateg) diferente de [104]: somatório do campo
               * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [11, 15]; para {codCateg}(../codCateg) = [104]: somatório do campo
               * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [11, 15], limitado ao teto do salário de contribuição.
               *
               * <p>OBS.: A contribuição previdenciária patronal do empregador doméstico tem como
               * base de cálculo o somatório do salário de contribuição de cada empregado.
               *
               * @param vrBcCp00 Valor para atribuir ao campo vrBcCp00
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp00(Double vrBcCp00) {
                this.vrBcCp00 = vrBcCp00;
                return this;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição.
               *
               * @return Conteúdo do campo vrBcCp15
               */
              public Double getVrBcCp15() {
                return this.vrBcCp15;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, se {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor)
               * em S-5001 = [12, 16].
               *
               * @param vrBcCp15 Valor para atribuir ao campo vrBcCp15
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp15(Double vrBcCp15) {
                this.vrBcCp15 = vrBcCp15;
                return this;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição.
               *
               * @return Conteúdo do campo vrBcCp20
               */
              public Double getVrBcCp20() {
                return this.vrBcCp20;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [13, 17].
               *
               * @param vrBcCp20 Valor para atribuir ao campo vrBcCp20
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp20(Double vrBcCp20) {
                this.vrBcCp20 = vrBcCp20;
                return this;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição.
               *
               * @return Conteúdo do campo vrBcCp25
               */
              public Double getVrBcCp25() {
                return this.vrBcCp25;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [14, 18].
               *
               * @param vrBcCp25 Valor para atribuir ao campo vrBcCp25
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp25(Double vrBcCp25) {
                this.vrBcCp25 = vrBcCp25;
                return this;
              }

              /**
               * Valor da BC com incidência suspensa em decorrência de decisão judicial.
               *
               * @return Conteúdo do campo vrSuspBcCp00
               */
              public Double getVrSuspBcCp00() {
                return this.vrSuspBcCp00;
              }

              /**
               * Valor da BC com incidência suspensa em decorrência de decisão judicial.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [91, 95].
               *
               * @param vrSuspBcCp00 Valor para atribuir ao campo vrSuspBcCp00
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp00(Double vrSuspBcCp00) {
                this.vrSuspBcCp00 = vrSuspBcCp00;
                return this;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 15 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               *
               * @return Conteúdo do campo vrSuspBcCp15
               */
              public Double getVrSuspBcCp15() {
                return this.vrSuspBcCp15;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 15 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [92, 96].
               *
               * @param vrSuspBcCp15 Valor para atribuir ao campo vrSuspBcCp15
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp15(Double vrSuspBcCp15) {
                this.vrSuspBcCp15 = vrSuspBcCp15;
                return this;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador expectativa de aposentadoria
               * especial aos 20 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               *
               * @return Conteúdo do campo vrSuspBcCp20
               */
              public Double getVrSuspBcCp20() {
                return this.vrSuspBcCp20;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador expectativa de aposentadoria
               * especial aos 20 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [93, 97].
               *
               * @param vrSuspBcCp20 Valor para atribuir ao campo vrSuspBcCp20
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp20(Double vrSuspBcCp20) {
                this.vrSuspBcCp20 = vrSuspBcCp20;
                return this;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 25 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               *
               * @return Conteúdo do campo vrSuspBcCp25
               */
              public Double getVrSuspBcCp25() {
                return this.vrSuspBcCp25;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 25 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [94, 98].
               *
               * @param vrSuspBcCp25 Valor para atribuir ao campo vrSuspBcCp25
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp25(Double vrSuspBcCp25) {
                this.vrSuspBcCp25 = vrSuspBcCp25;
                return this;
              }

              /**
               * Preencher com a base de cálculo da contribuição previdenciária sobre a remuneração
               * - Contrato Verde e Amarelo.
               *
               * @return Conteúdo do campo vrBcCp00VA
               */
              public Double getVrBcCp00VA() {
                return this.vrBcCp00VA;
              }

              /**
               * Preencher com a base de cálculo da contribuição previdenciária sobre a remuneração
               * - Contrato Verde e Amarelo.
               *
               * <p>Origem: somatório do campo
               * {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor) de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [41, 45].
               *
               * @param vrBcCp00VA Valor para atribuir ao campo vrBcCp00VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp00VA(Double vrBcCp00VA) {
                this.vrBcCp00VA = vrBcCp00VA;
                return this;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição - Contrato Verde
               * e Amarelo.
               *
               * @return Conteúdo do campo vrBcCp15VA
               */
              public Double getVrBcCp15VA() {
                return this.vrBcCp15VA;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 15 anos de contribuição - Contrato Verde
               * e Amarelo.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, se {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor)
               * em S-5001 = [42, 46].
               *
               * @param vrBcCp15VA Valor para atribuir ao campo vrBcCp15VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp15VA(Double vrBcCp15VA) {
                this.vrBcCp15VA = vrBcCp15VA;
                return this;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição - Contrato Verde
               * e Amarelo.
               *
               * @return Conteúdo do campo vrBcCp20VA
               */
              public Double getVrBcCp20VA() {
                return this.vrBcCp20VA;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 20 anos de contribuição - Contrato Verde
               * e Amarelo.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [43, 47].
               *
               * @param vrBcCp20VA Valor para atribuir ao campo vrBcCp20VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp20VA(Double vrBcCp20VA) {
                this.vrBcCp20VA = vrBcCp20VA;
                return this;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição - Contrato Verde
               * e Amarelo.
               *
               * @return Conteúdo do campo vrBcCp25VA
               */
              public Double getVrBcCp25VA() {
                return this.vrBcCp25VA;
              }

              /**
               * Preencher com a base de cálculo da contribuição adicional para o financiamento dos
               * benefícios de aposentadoria especial após 25 anos de contribuição - Contrato Verde
               * e Amarelo.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [44, 48].
               *
               * @param vrBcCp25VA Valor para atribuir ao campo vrBcCp25VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrBcCp25VA(Double vrBcCp25VA) {
                this.vrBcCp25VA = vrBcCp25VA;
                return this;
              }

              /**
               * Valor da BC com incidência suspensa em decorrência de decisão judicial - Contrato
               * Verde e Amarelo.
               *
               * @return Conteúdo do campo vrSuspBcCp00VA
               */
              public Double getVrSuspBcCp00VA() {
                return this.vrSuspBcCp00VA;
              }

              /**
               * Valor da BC com incidência suspensa em decorrência de decisão judicial - Contrato
               * Verde e Amarelo.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [81, 85].
               *
               * @param vrSuspBcCp00VA Valor para atribuir ao campo vrSuspBcCp00VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp00VA(Double vrSuspBcCp00VA) {
                this.vrSuspBcCp00VA = vrSuspBcCp00VA;
                return this;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 15 anos de trabalho, com incidência suspensa em decorrência de decisão judicial
               * - Contrato Verde e Amarelo.
               *
               * @return Conteúdo do campo vrSuspBcCp15VA
               */
              public Double getVrSuspBcCp15VA() {
                return this.vrSuspBcCp15VA;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 15 anos de trabalho, com incidência suspensa em decorrência de decisão judicial
               * - Contrato Verde e Amarelo.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [82, 86].
               *
               * @param vrSuspBcCp15VA Valor para atribuir ao campo vrSuspBcCp15VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp15VA(Double vrSuspBcCp15VA) {
                this.vrSuspBcCp15VA = vrSuspBcCp15VA;
                return this;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador expectativa de aposentadoria
               * especial aos 20 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial - Contrato Verde e Amarelo.
               *
               * @return Conteúdo do campo vrSuspBcCp20VA
               */
              public Double getVrSuspBcCp20VA() {
                return this.vrSuspBcCp20VA;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador expectativa de aposentadoria
               * especial aos 20 anos de trabalho, com incidência suspensa em decorrência de decisão
               * judicial - Contrato Verde e Amarelo.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [83, 87].
               *
               * @param vrSuspBcCp20VA Valor para atribuir ao campo vrSuspBcCp20VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp20VA(Double vrSuspBcCp20VA) {
                this.vrSuspBcCp20VA = vrSuspBcCp20VA;
                return this;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 25 anos de trabalho, com incidência suspensa em decorrência de decisão judicial
               * - Contrato Verde e Amarelo.
               *
               * @return Conteúdo do campo vrSuspBcCp25VA
               */
              public Double getVrSuspBcCp25VA() {
                return this.vrSuspBcCp25VA;
              }

              /**
               * Valor da base de cálculo da contribuição previdenciária adicional correspondente a
               * exposição a agente nocivo que dá ao trabalhador direito a aposentadoria especial
               * aos 25 anos de trabalho, com incidência suspensa em decorrência de decisão judicial
               * - Contrato Verde e Amarelo.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [84, 88].
               *
               * @param vrSuspBcCp25VA Valor para atribuir ao campo vrSuspBcCp25VA
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSuspBcCp25VA(Double vrSuspBcCp25VA) {
                this.vrSuspBcCp25VA = vrSuspBcCp25VA;
                return this;
              }

              /**
               * Valor total descontado do trabalhador para recolhimento ao SEST.
               *
               * @return Conteúdo do campo vrDescSest
               */
              public Double getVrDescSest() {
                return this.vrDescSest;
              }

              /**
               * Valor total descontado do trabalhador para recolhimento ao SEST.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [22].
               *
               * @param vrDescSest Valor para atribuir ao campo vrDescSest
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrDescSest(Double vrDescSest) {
                this.vrDescSest = vrDescSest;
                return this;
              }

              /**
               * Valor calculado relativo à contribuição devida pelo trabalhador para recolhimento
               * ao SEST.
               *
               * @return Conteúdo do campo vrCalcSest
               */
              public Double getVrCalcSest() {
                return this.vrCalcSest;
              }

              /**
               * Valor calculado relativo à contribuição devida pelo trabalhador para recolhimento
               * ao SEST.
               *
               * <p>Origem: campo
               * {vrCsSegTerc}(5001_infoCp_ideEstabLot_infoCategIncid_calcTerc_vrCsSegTerc) de
               * S-5001, quando
               * {calcTerc/tpCR}(5001_infoCp_ideEstabLot_infoCategIncid_calcTerc_tpCR) em S-5001 =
               * [121802], exceto se houver informação de processo judicial do trabalhador, quando
               * deve ser utilizado o valor apurado em {vrDescSest}(./vrDescSest).
               *
               * @param vrCalcSest Valor para atribuir ao campo vrCalcSest
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrCalcSest(Double vrCalcSest) {
                this.vrCalcSest = vrCalcSest;
                return this;
              }

              /**
               * Valor total descontado do trabalhador para recolhimento ao SENAT.
               *
               * @return Conteúdo do campo vrDescSenat
               */
              public Double getVrDescSenat() {
                return this.vrDescSenat;
              }

              /**
               * Valor total descontado do trabalhador para recolhimento ao SENAT.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [23].
               *
               * @param vrDescSenat Valor para atribuir ao campo vrDescSenat
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrDescSenat(Double vrDescSenat) {
                this.vrDescSenat = vrDescSenat;
                return this;
              }

              /**
               * Valor calculado relativo à contribuição devida pelo trabalhador para recolhimento
               * ao SENAT.
               *
               * @return Conteúdo do campo vrCalcSenat
               */
              public Double getVrCalcSenat() {
                return this.vrCalcSenat;
              }

              /**
               * Valor calculado relativo à contribuição devida pelo trabalhador para recolhimento
               * ao SENAT.
               *
               * <p>Origem: campo
               * {vrCsSegTerc}(5001_infoCp_ideEstabLot_infoCategIncid_calcTerc_vrCsSegTerc) de
               * S-5001, quando
               * {calcTerc/tpCR}(5001_infoCp_ideEstabLot_infoCategIncid_calcTerc_tpCR) em S-5001 =
               * [122102], exceto se houver informação de processo judicial do trabalhador, quando
               * deve ser utilizado o valor apurado em {vrDescSenat}(./vrDescSenat).
               *
               * @param vrCalcSenat Valor para atribuir ao campo vrCalcSenat
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrCalcSenat(Double vrCalcSenat) {
                this.vrCalcSenat = vrCalcSenat;
                return this;
              }

              /**
               * Valor total do salário-família para a categoria indicada.
               *
               * @return Conteúdo do campo vrSalFam
               */
              public Double getVrSalFam() {
                return this.vrSalFam;
              }

              /**
               * Valor total do salário-família para a categoria indicada.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [31].
               *
               * @param vrSalFam Valor para atribuir ao campo vrSalFam
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSalFam(Double vrSalFam) {
                this.vrSalFam = vrSalFam;
                return this;
              }

              /**
               * Valor total do salário-maternidade para a categoria indicada.
               *
               * @return Conteúdo do campo vrSalMat
               */
              public Double getVrSalMat() {
                return this.vrSalMat;
              }

              /**
               * Valor total do salário-maternidade para a categoria indicada.
               *
               * <p>Origem: campo {valor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_valor)
               * de S-5001, quando
               * {tpValor}(5001_infoCp_ideEstabLot_infoCategIncid_infoBaseCS_tpValor) em S-5001 =
               * [32].
               *
               * @param vrSalMat Valor para atribuir ao campo vrSalMat
               * @return O próprio BasesCp para continuar populando outros campos
               */
              public BasesCp<T> setVrSalMat(Double vrSalMat) {
                this.vrSalMat = vrSalMat;
                return this;
              }

              public BasesCp(Object pai) {
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
           * Contratação de avulsos não portuários
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "vrBcCp00",
                "vrBcCp15",
                "vrBcCp20",
                "vrBcCp25",
                "vrBcCp13",
                "vrDescCP",
              })
          public static class BasesAvNPort<T> {

            /**
             * Valor da base de cálculo da contribuição previdenciária sobre a remuneração dos
             * trabalhadores avulsos não portuários.
             */
            private Double vrBcCp00;

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 15 anos de contribuição.
             */
            private Double vrBcCp15;

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 20 anos de contribuição.
             */
            private Double vrBcCp20;

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 25 anos de contribuição.
             */
            private Double vrBcCp25;

            /**
             * Valor da base de cálculo da contribuição previdenciária sobre o 13° salário dos
             * trabalhadores avulsos não portuários contratados.
             */
            private Double vrBcCp13;

            /**
             * Preencher com o valor total da contribuição descontada dos trabalhadores avulsos não
             * portuários.
             */
            private Double vrDescCP;

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
             * <p>Origem: campo {vrBcCp00}(1270_remunAvNP_vrBcCp00) de S-1270.
             *
             * @param vrBcCp00 Valor para atribuir ao campo vrBcCp00
             * @return O próprio BasesAvNPort para continuar populando outros campos
             */
            public BasesAvNPort<T> setVrBcCp00(Double vrBcCp00) {
              this.vrBcCp00 = vrBcCp00;
              return this;
            }

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 15 anos de contribuição.
             *
             * @return Conteúdo do campo vrBcCp15
             */
            public Double getVrBcCp15() {
              return this.vrBcCp15;
            }

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 15 anos de contribuição.
             *
             * <p>Origem: campo {vrBcCp15}(1270_remunAvNP_vrBcCp15) de S-1270.
             *
             * @param vrBcCp15 Valor para atribuir ao campo vrBcCp15
             * @return O próprio BasesAvNPort para continuar populando outros campos
             */
            public BasesAvNPort<T> setVrBcCp15(Double vrBcCp15) {
              this.vrBcCp15 = vrBcCp15;
              return this;
            }

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 20 anos de contribuição.
             *
             * @return Conteúdo do campo vrBcCp20
             */
            public Double getVrBcCp20() {
              return this.vrBcCp20;
            }

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 20 anos de contribuição.
             *
             * <p>Origem: campo {vrBcCp20}(1270_remunAvNP_vrBcCp20) de S-1270.
             *
             * @param vrBcCp20 Valor para atribuir ao campo vrBcCp20
             * @return O próprio BasesAvNPort para continuar populando outros campos
             */
            public BasesAvNPort<T> setVrBcCp20(Double vrBcCp20) {
              this.vrBcCp20 = vrBcCp20;
              return this;
            }

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 25 anos de contribuição.
             *
             * @return Conteúdo do campo vrBcCp25
             */
            public Double getVrBcCp25() {
              return this.vrBcCp25;
            }

            /**
             * Valor da base de cálculo da contribuição adicional para o financiamento dos
             * benefícios de aposentadoria especial após 25 anos de contribuição.
             *
             * <p>Origem: campo {vrBcCp25}(1270_remunAvNP_vrBcCp25) de S-1270.
             *
             * @param vrBcCp25 Valor para atribuir ao campo vrBcCp25
             * @return O próprio BasesAvNPort para continuar populando outros campos
             */
            public BasesAvNPort<T> setVrBcCp25(Double vrBcCp25) {
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
             * <p>Origem: campo {vrBcCp13}(1270_remunAvNP_vrBcCp13) de S-1270.
             *
             * @param vrBcCp13 Valor para atribuir ao campo vrBcCp13
             * @return O próprio BasesAvNPort para continuar populando outros campos
             */
            public BasesAvNPort<T> setVrBcCp13(Double vrBcCp13) {
              this.vrBcCp13 = vrBcCp13;
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
             * <p>Origem: campo {vrDescCP}(1270_remunAvNP_vrDescCP) de S-1270.
             *
             * @param vrDescCP Valor para atribuir ao campo vrDescCP
             * @return O próprio BasesAvNPort para continuar populando outros campos
             */
            public BasesAvNPort<T> setVrDescCP(Double vrDescCP) {
              this.vrDescCP = vrDescCP;
              return this;
            }

            public BasesAvNPort(Object pai) {
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
           * Informação de substituição prevista na Lei 12.546/2011
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "cnpjOpPortuario",
              })
          public static class InfoSubstPatrOpPort<T> {

            /** Preencher com o CNPJ do operador portuário. */
            private String cnpjOpPortuario;

            /**
             * Preencher com o CNPJ do operador portuário.
             *
             * @return Conteúdo do campo cnpjOpPortuario
             */
            public String getCnpjOpPortuario() {
              return this.cnpjOpPortuario;
            }

            /**
             * Preencher com o CNPJ do operador portuário.
             *
             * <p>Origem: campo {dadosLotacao/nrInsc}(1020_infoLotacao_inclusao_dadosLotacao_nrInsc)
             * de S-1020 relativo a {codLotacao}(1280_infoSubstPatrOpPort_codLotacao) em S-1280.
             *
             * @param cnpjOpPortuario Valor para atribuir ao campo cnpjOpPortuario
             * @return O próprio InfoSubstPatrOpPort para continuar populando outros campos
             */
            public InfoSubstPatrOpPort<T> setCnpjOpPortuario(String cnpjOpPortuario) {
              this.cnpjOpPortuario = cnpjOpPortuario;
              return this;
            }

            public InfoSubstPatrOpPort(Object pai) {
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
         * Informações da comercialização da produção
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "indComerc",
              "vrBcComPR",
              "vrCPSusp",
              "vrRatSusp",
              "vrSenarSusp",
            })
        public static class BasesComerc<T> {

          /** Indicativo de comercialização. */
          private String indComerc;

          /**
           * Valor da base de cálculo da comercialização da produção rural do produtor rural
           * PF/segurado especial a outra PF no varejo ou a outro produtor rural PF/segurado
           * especial ou no mercado externo, conforme {indComerc}(./indComerc).
           */
          private Double vrBcComPR;

          /** Valor da contribuição previdenciária com exigibilidade suspensa. */
          private Double vrCPSusp;

          /** Valor da contribuição para GILRAT com exigibilidade suspensa. */
          private Double vrRatSusp;

          /** Valor da contribuição para o SENAR com exigibilidade suspensa. */
          private Double vrSenarSusp;

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
           * <p>Origem: campo {indComerc}(1260_infoComProd_ideEstabel_tpComerc_indComerc) de S-1260.
           *
           * @param indComerc Valor para atribuir ao campo indComerc
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setIndComerc(String indComerc) {
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
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setIndComerc_2() {
            this.indComerc = "2";
            return this;
          }
          /**
           * Comercialização da produção por prod. rural PF/seg. especial - Vendas a PJ (exceto
           * entidade inscrita no Programa de Aquisição de Alimentos - PAA) ou a intermediário PF
           *
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setIndComerc_3() {
            this.indComerc = "3";
            return this;
          }
          /**
           * Comercialização da produção isenta de acordo com a Lei 13.606/2018
           *
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setIndComerc_7() {
            this.indComerc = "7";
            return this;
          }
          /**
           * Comercialização da produção da pessoa física/segurado especial para entidade inscrita
           * no PAA
           *
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setIndComerc_8() {
            this.indComerc = "8";
            return this;
          }
          /**
           * Comercialização da produção no mercado externo
           *
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setIndComerc_9() {
            this.indComerc = "9";
            return this;
          }

          /**
           * Valor da base de cálculo da comercialização da produção rural do produtor rural
           * PF/segurado especial a outra PF no varejo ou a outro produtor rural PF/segurado
           * especial ou no mercado externo, conforme {indComerc}(./indComerc).
           *
           * @return Conteúdo do campo vrBcComPR
           */
          public Double getVrBcComPR() {
            return this.vrBcComPR;
          }

          /**
           * Valor da base de cálculo da comercialização da produção rural do produtor rural
           * PF/segurado especial a outra PF no varejo ou a outro produtor rural PF/segurado
           * especial ou no mercado externo, conforme {indComerc}(./indComerc).
           *
           * <p>Origem: campo {vrTotCom}(1260_infoComProd_ideEstabel_tpComerc_vrTotCom) de S-1260.
           *
           * @param vrBcComPR Valor para atribuir ao campo vrBcComPR
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setVrBcComPR(Double vrBcComPR) {
            this.vrBcComPR = vrBcComPR;
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
           * <p>Origem: campo {vrCPSusp}(1260_infoComProd_ideEstabel_tpComerc_infoProcJud_vrCPSusp)
           * de S-1260.
           *
           * @param vrCPSusp Valor para atribuir ao campo vrCPSusp
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setVrCPSusp(Double vrCPSusp) {
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
           * <p>Origem: campo
           * {vrRatSusp}(1260_infoComProd_ideEstabel_tpComerc_infoProcJud_vrRatSusp) de S-1260.
           *
           * @param vrRatSusp Valor para atribuir ao campo vrRatSusp
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setVrRatSusp(Double vrRatSusp) {
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
           * <p>Origem: campo
           * {vrSenarSusp}(1260_infoComProd_ideEstabel_tpComerc_infoProcJud_vrSenarSusp) de S-1260.
           *
           * @param vrSenarSusp Valor para atribuir ao campo vrSenarSusp
           * @return O próprio BasesComerc para continuar populando outros campos
           */
          public BasesComerc<T> setVrSenarSusp(Double vrSenarSusp) {
            this.vrSenarSusp = vrSenarSusp;
            return this;
          }

          public BasesComerc(Object pai) {
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
         * Códigos de Receita por estabelecimento
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpCR",
              "vrCR",
              "vrSuspCR",
            })
        public static class InfoCREstab<T> {

          /**
           * Código de Receita - CR relativo a contribuições sociais devidas à Previdência Social e
           * a Outras Entidades e Fundos (Terceiros), conforme legislação em vigor na competência.
           */
          private Integer tpCR;

          /** Valor correspondente ao CR apurado. */
          private Double vrCR;

          /** Valor suspenso correspondente ao CR apurado. */
          private Double vrSuspCR;

          /**
           * Código de Receita - CR relativo a contribuições sociais devidas à Previdência Social e
           * a Outras Entidades e Fundos (Terceiros), conforme legislação em vigor na competência.
           *
           * @return Conteúdo do campo tpCR
           */
          public Integer getTpCR() {
            return this.tpCR;
          }

          /**
           * Código de Receita - CR relativo a contribuições sociais devidas à Previdência Social e
           * a Outras Entidades e Fundos (Terceiros), conforme legislação em vigor na competência.
           *
           * <p>Validação: Deve ser um código válido, compatível com a classificação tributária do
           * contribuinte e com as informações prestadas nos demais eventos.
           *
           * @param tpCR Valor para atribuir ao campo tpCR
           * @return O próprio InfoCREstab para continuar populando outros campos
           */
          public InfoCREstab<T> setTpCR(Integer tpCR) {
            this.tpCR = tpCR;
            return this;
          }

          /**
           * Valor correspondente ao CR apurado.
           *
           * @return Conteúdo do campo vrCR
           */
          public Double getVrCR() {
            return this.vrCR;
          }

          /**
           * Valor correspondente ao CR apurado.
           *
           * <p>Validação: Deve ser apurado de acordo com a legislação em vigor na competência.
           *
           * <p>Deve ser maior que 0 (zero).
           *
           * @param vrCR Valor para atribuir ao campo vrCR
           * @return O próprio InfoCREstab para continuar populando outros campos
           */
          public InfoCREstab<T> setVrCR(Double vrCR) {
            this.vrCR = vrCR;
            return this;
          }

          /**
           * Valor suspenso correspondente ao CR apurado.
           *
           * @return Conteúdo do campo vrSuspCR
           */
          public Double getVrSuspCR() {
            return this.vrSuspCR;
          }

          /**
           * Valor suspenso correspondente ao CR apurado.
           *
           * <p>Validação: Deve ser apurado de acordo com as informações de processos judiciais e
           * administrativos.
           *
           * @param vrSuspCR Valor para atribuir ao campo vrSuspCR
           * @return O próprio InfoCREstab para continuar populando outros campos
           */
          public InfoCREstab<T> setVrSuspCR(Double vrSuspCR) {
            this.vrSuspCR = vrSuspCR;
            return this;
          }

          public InfoCREstab(Object pai) {
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
       * Totalizador dos Códigos de Receita do contribuinte
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpCR",
            "vrCR",
            "vrCRSusp",
          })
      public static class InfoCRContrib<T> {

        /**
         * Código de Receita - CR relativo a contribuições sociais devidas à Previdência Social e a
         * Outras Entidades e Fundos (Terceiros), conforme legislação em vigor na competência.
         */
        private Integer tpCR;

        /** Valor correspondente ao CR apurado. */
        private Double vrCR;

        /** Valor do tributo com exigibilidade suspensa. */
        private Double vrCRSusp;

        /**
         * Código de Receita - CR relativo a contribuições sociais devidas à Previdência Social e a
         * Outras Entidades e Fundos (Terceiros), conforme legislação em vigor na competência.
         *
         * @return Conteúdo do campo tpCR
         */
        public Integer getTpCR() {
          return this.tpCR;
        }

        /**
         * Código de Receita - CR relativo a contribuições sociais devidas à Previdência Social e a
         * Outras Entidades e Fundos (Terceiros), conforme legislação em vigor na competência.
         *
         * <p>Validação: Deve ser um código válido, compatível com a classificação tributária do
         * contribuinte e com as informações prestadas nos demais eventos.
         *
         * @param tpCR Valor para atribuir ao campo tpCR
         * @return O próprio InfoCRContrib para continuar populando outros campos
         */
        public InfoCRContrib<T> setTpCR(Integer tpCR) {
          this.tpCR = tpCR;
          return this;
        }

        /**
         * Valor correspondente ao CR apurado.
         *
         * @return Conteúdo do campo vrCR
         */
        public Double getVrCR() {
          return this.vrCR;
        }

        /**
         * Valor correspondente ao CR apurado.
         *
         * <p>Validação: Deve ser apurado de acordo com a legislação em vigor na competência.
         *
         * <p>Deve ser maior que 0 (zero).
         *
         * @param vrCR Valor para atribuir ao campo vrCR
         * @return O próprio InfoCRContrib para continuar populando outros campos
         */
        public InfoCRContrib<T> setVrCR(Double vrCR) {
          this.vrCR = vrCR;
          return this;
        }

        /**
         * Valor do tributo com exigibilidade suspensa.
         *
         * @return Conteúdo do campo vrCRSusp
         */
        public Double getVrCRSusp() {
          return this.vrCRSusp;
        }

        /**
         * Valor do tributo com exigibilidade suspensa.
         *
         * @param vrCRSusp Valor para atribuir ao campo vrCRSusp
         * @return O próprio InfoCRContrib para continuar populando outros campos
         */
        public InfoCRContrib<T> setVrCRSusp(Double vrCRSusp) {
          this.vrCRSusp = vrCRSusp;
          return this;
        }

        public InfoCRContrib(Object pai) {
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
