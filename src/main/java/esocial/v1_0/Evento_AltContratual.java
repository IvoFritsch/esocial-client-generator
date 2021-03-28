package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2206 - Alteração de Contrato de Trabalho/Relação Estatutária */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtAltContratual",
    })
@XmlRootElement(name = "eSocial")
public class Evento_AltContratual {

  /** Evento Alteração de Contrato de Trabalho/Relação Estatutária. */
  private EvtAltContratual evtAltContratual;

  /**
   * Evento Alteração de Contrato de Trabalho/Relação Estatutária.
   *
   * @return Conteúdo do campo evtAltContratual
   */
  public EvtAltContratual getEvtAltContratual() {
    return this.evtAltContratual;
  }

  /**
   * Evento Alteração de Contrato de Trabalho/Relação Estatutária.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ADMISSAO_VALIDA_DURACAO_CONTRATO
   *
   * <p>REGRA:REGRA_ALTERA_CATEG
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
   *
   * <p>REGRA:REGRA_EXTEMP_DOMESTICO
   *
   * <p>REGRA:REGRA_EXTEMP_REINTEGRACAO
   *
   * <p>REGRA:REGRA_GERAL_VALIDA_DADOS_TABCONTRIB
   *
   * <p>REGRA:REGRA_MESMO_PROCEMI
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_VALIDA_TRABALHADOR_BASE_CPF
   *
   * <p>REGRA:REGRA_VINCULO_ATIVO_NA_DTEVENTO
   *
   * @return O objeto EvtAltContratual para população dos campos filhos
   */
  public EvtAltContratual<Evento_AltContratual> setEvtAltContratual() {
    if (this.evtAltContratual == null) {
      this.evtAltContratual = new EvtAltContratual(this);
    }
    return this.evtAltContratual;
  }

  /**
   * Evento Alteração de Contrato de Trabalho/Relação Estatutária.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideVinculo",
        "altContratual",
      })
  public static class EvtAltContratual<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private Tipos.T_ideVinculo ideVinculo;

    /** Alteração de dados contratuais. */
    private AltContratual altContratual;

    /**
     * Informações de identificação do evento.
     *
     * @return Conteúdo do campo ideEvento
     */
    public Tipos.T_ideEvento_trab getIdeEvento() {
      return this.ideEvento;
    }

    /**
     * Informações de identificação do evento.
     *
     * @return O objeto Tipos.T_ideEvento_trab para população dos campos filhos
     */
    public Tipos.T_ideEvento_trab<EvtAltContratual<T>> setIdeEvento() {
      if (this.ideEvento == null) {
        this.ideEvento = new Tipos.T_ideEvento_trab(this);
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
    public Tipos.T_ideEmpregador<EvtAltContratual<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * @return Conteúdo do campo ideVinculo
     */
    public Tipos.T_ideVinculo getIdeVinculo() {
      return this.ideVinculo;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}
     *
     * @return O objeto Tipos.T_ideVinculo para população dos campos filhos
     */
    public Tipos.T_ideVinculo<EvtAltContratual<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new Tipos.T_ideVinculo(this);
      }
      return this.ideVinculo;
    }

    /**
     * Alteração de dados contratuais.
     *
     * @return Conteúdo do campo altContratual
     */
    public AltContratual getAltContratual() {
      return this.altContratual;
    }

    /**
     * Alteração de dados contratuais.
     *
     * <p>CHAVE_GRUPO: {dtAlteracao}, {dtEf}
     *
     * @return O objeto AltContratual para população dos campos filhos
     */
    public AltContratual<EvtAltContratual<T>> setAltContratual() {
      if (this.altContratual == null) {
        this.altContratual = new AltContratual(this);
      }
      return this.altContratual;
    }

    public EvtAltContratual(Object pai) {
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
     * Alteração de dados contratuais.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtAlteracao",
          "dtEf",
          "dscAlt",
          "vinculo",
        })
    public static class AltContratual<T> {

      /** Preencher com a data da alteração das informações. */
      private javax.xml.datatype.XMLGregorianCalendar dtAlteracao;

      /** Data dos efeitos remuneratórios da alteração contratual. */
      private javax.xml.datatype.XMLGregorianCalendar dtEf;

      /** Descrição da alteração ou do instrumento que a gerou. */
      private String dscAlt;

      /** Informações do vinculo. */
      private Vinculo vinculo;

      /**
       * Preencher com a data da alteração das informações.
       *
       * @return Conteúdo do campo dtAlteracao
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtAlteracao() {
        return this.dtAlteracao;
      }

      /**
       * Preencher com a data da alteração das informações.
       *
       * <p>Validação: Não pode ser posterior a 180 (cento e oitenta) dias da data atual.
       *
       * @param dtAlteracao Valor para atribuir ao campo dtAlteracao
       * @return O próprio AltContratual para continuar populando outros campos
       */
      public AltContratual<T> setDtAlteracao(javax.xml.datatype.XMLGregorianCalendar dtAlteracao) {
        this.dtAlteracao = dtAlteracao;
        return this;
      }

      /**
       * Data dos efeitos remuneratórios da alteração contratual.
       *
       * @return Conteúdo do campo dtEf
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtEf() {
        return this.dtEf;
      }

      /**
       * Data dos efeitos remuneratórios da alteração contratual.
       *
       * <p>Se a alteração foi fruto de lei, acordo coletivo, convenção coletiva ou sentença
       * normativa, informar a data a partir da qual a alteração produz efeitos remuneratórios.
       *
       * <p>Validação: Deve ser uma data válida, igual ou posterior à data de admissão.
       *
       * @param dtEf Valor para atribuir ao campo dtEf
       * @return O próprio AltContratual para continuar populando outros campos
       */
      public AltContratual<T> setDtEf(javax.xml.datatype.XMLGregorianCalendar dtEf) {
        this.dtEf = dtEf;
        return this;
      }

      /**
       * Descrição da alteração ou do instrumento que a gerou.
       *
       * @return Conteúdo do campo dscAlt
       */
      public String getDscAlt() {
        return this.dscAlt;
      }

      /**
       * Descrição da alteração ou do instrumento que a gerou.
       *
       * @param dscAlt Valor para atribuir ao campo dscAlt
       * @return O próprio AltContratual para continuar populando outros campos
       */
      public AltContratual<T> setDscAlt(String dscAlt) {
        this.dscAlt = dscAlt;
        return this;
      }

      /**
       * Informações do vinculo.
       *
       * @return Conteúdo do campo vinculo
       */
      public Vinculo getVinculo() {
        return this.vinculo;
      }

      /**
       * Informações do vinculo.
       *
       * <p>DESCRICAO_COMPLETA:Grupo de informações do vínculo trabalhista.
       *
       * @return O objeto Vinculo para população dos campos filhos
       */
      public Vinculo<AltContratual<T>> setVinculo() {
        if (this.vinculo == null) {
          this.vinculo = new Vinculo(this);
        }
        return this.vinculo;
      }

      public AltContratual(Object pai) {
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
       * Informações do vinculo.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpRegPrev",
            "infoRegimeTrab",
            "infoContrato",
          })
      public static class Vinculo<T> {

        /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
        private String tpRegPrev;

        /** Informações do regime trabalhista. */
        private InfoRegimeTrab infoRegimeTrab;

        /** Informações do contrato de trabalho. */
        private InfoContrato infoContrato;

        /**
         * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
         *
         * @return Conteúdo do campo tpRegPrev
         */
        public String getTpRegPrev() {
          return this.tpRegPrev;
        }

        /**
         * Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares).
         *
         * <p>Validação: Se {codCateg}(./infoContrato_codCateg) = [104], deve ser preenchido com
         * [1]. Se {codCateg}(./infoContrato_codCateg) = [101, 102, 103, 105, 106, 107, 108, 111],
         * não pode ser preenchido com [2].
         *
         * @param tpRegPrev Valor para atribuir ao campo tpRegPrev
         * @return O próprio Vinculo para continuar populando outros campos
         */
        public Vinculo<T> setTpRegPrev(String tpRegPrev) {
          if (!"1".equals(tpRegPrev) && !"2".equals(tpRegPrev) && !"3".equals(tpRegPrev))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpRegPrev) + " inválido para o campo tpRegPrev");
          this.tpRegPrev = tpRegPrev;
          return this;
        }
        /**
         * Regime Geral de Previdência Social - RGPS
         *
         * @return O próprio Vinculo para continuar populando outros campos
         */
        public Vinculo<T> setTpRegPrev_1() {
          this.tpRegPrev = "1";
          return this;
        }
        /**
         * Regime Próprio de Previdência Social - RPPS ou Sistema de Proteção Social dos Militares
         *
         * @return O próprio Vinculo para continuar populando outros campos
         */
        public Vinculo<T> setTpRegPrev_2() {
          this.tpRegPrev = "2";
          return this;
        }
        /**
         * Regime de Previdência Social no exterior
         *
         * @return O próprio Vinculo para continuar populando outros campos
         */
        public Vinculo<T> setTpRegPrev_3() {
          this.tpRegPrev = "3";
          return this;
        }

        /**
         * Informações do regime trabalhista.
         *
         * @return Conteúdo do campo infoRegimeTrab
         */
        public InfoRegimeTrab getInfoRegimeTrab() {
          return this.infoRegimeTrab;
        }

        /**
         * Informações do regime trabalhista.
         *
         * @return O objeto InfoRegimeTrab para população dos campos filhos
         */
        public InfoRegimeTrab<Vinculo<T>> setInfoRegimeTrab() {
          if (this.infoRegimeTrab == null) {
            this.infoRegimeTrab = new InfoRegimeTrab(this);
          }
          return this.infoRegimeTrab;
        }

        /**
         * Informações do contrato de trabalho.
         *
         * @return Conteúdo do campo infoContrato
         */
        public InfoContrato getInfoContrato() {
          return this.infoContrato;
        }

        /**
         * Informações do contrato de trabalho.
         *
         * @return O objeto InfoContrato para população dos campos filhos
         */
        public InfoContrato<Vinculo<T>> setInfoContrato() {
          if (this.infoContrato == null) {
            this.infoContrato = new InfoContrato(this);
          }
          return this.infoContrato;
        }

        public Vinculo(Object pai) {
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
         * Informações do regime trabalhista.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "infoCeletista",
              "infoEstatutario",
            })
        public static class InfoRegimeTrab<T> {

          /** Informações de trabalhador celetista. */
          private InfoCeletista infoCeletista;

          /** Informações de trabalhador estatutário. */
          private InfoEstatutario infoEstatutario;

          /**
           * Informações de trabalhador celetista.
           *
           * @return Conteúdo do campo infoCeletista
           */
          public InfoCeletista getInfoCeletista() {
            return this.infoCeletista;
          }

          /**
           * Informações de trabalhador celetista.
           *
           * <p>CONDICAO_GRUPO: O (se {tpRegTrab}(2200_vinculo_tpRegTrab) em S-2200 = [1]); N (nos
           * demais casos)
           *
           * @return O objeto InfoCeletista para população dos campos filhos
           */
          public InfoCeletista<InfoRegimeTrab<T>> setInfoCeletista() {
            if (this.infoCeletista == null) {
              this.infoCeletista = new InfoCeletista(this);
            }
            return this.infoCeletista;
          }

          /**
           * Informações de trabalhador estatutário.
           *
           * @return Conteúdo do campo infoEstatutario
           */
          public InfoEstatutario getInfoEstatutario() {
            return this.infoEstatutario;
          }

          /**
           * Informações de trabalhador estatutário.
           *
           * <p>CONDICAO_GRUPO: O (se {tpRegPrev}(2206_altContratual_vinculo_tpRegPrev) = [2] e
           * {tpRegTrab}(2200_vinculo_tpRegTrab) em S-2200 = [2]); N (nos demais casos)
           *
           * @return O objeto InfoEstatutario para população dos campos filhos
           */
          public InfoEstatutario<InfoRegimeTrab<T>> setInfoEstatutario() {
            if (this.infoEstatutario == null) {
              this.infoEstatutario = new InfoEstatutario(this);
            }
            return this.infoEstatutario;
          }

          public InfoRegimeTrab(Object pai) {
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
           * Informações de trabalhador celetista.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "tpRegJor",
                "natAtividade",
                "dtBase",
                "cnpjSindCategProf",
                "trabTemporario",
                "aprend",
              })
          public static class InfoCeletista<T> {

            /** Regime de jornada do empregado. */
            private String tpRegJor;

            /** Natureza da atividade. */
            private String natAtividade;

            /** Mês relativo à data base da categoria profissional do trabalhador. */
            private String dtBase;

            /**
             * Preencher com o CNPJ do sindicato representativo da categoria (preponderante ou
             * diferenciada).
             */
            private String cnpjSindCategProf;

            /** Dados sobre trabalho temporário */
            private TrabTemporario trabTemporario;

            /** Informações relacionadas ao aprendiz */
            private Tipos.T_aprend aprend;

            /**
             * Regime de jornada do empregado.
             *
             * @return Conteúdo do campo tpRegJor
             */
            public String getTpRegJor() {
              return this.tpRegJor;
            }

            /**
             * Regime de jornada do empregado.
             *
             * @param tpRegJor Valor para atribuir ao campo tpRegJor
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setTpRegJor(String tpRegJor) {
              if (!"1".equals(tpRegJor)
                  && !"2".equals(tpRegJor)
                  && !"3".equals(tpRegJor)
                  && !"4".equals(tpRegJor))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpRegJor) + " inválido para o campo tpRegJor");
              this.tpRegJor = tpRegJor;
              return this;
            }
            /**
             * Submetido a horário de trabalho (Capítulo II do Título II da CLT)
             *
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setTpRegJor_1() {
              this.tpRegJor = "1";
              return this;
            }
            /**
             * Atividade externa especificada no inciso I do art. 62 da CLT
             *
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setTpRegJor_2() {
              this.tpRegJor = "2";
              return this;
            }
            /**
             * Função especificada no inciso II do art. 62 da CLT
             *
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setTpRegJor_3() {
              this.tpRegJor = "3";
              return this;
            }
            /**
             * Teletrabalho, previsto no inciso III do art. 62 da CLT
             *
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setTpRegJor_4() {
              this.tpRegJor = "4";
              return this;
            }

            /**
             * Natureza da atividade.
             *
             * @return Conteúdo do campo natAtividade
             */
            public String getNatAtividade() {
              return this.natAtividade;
            }

            /**
             * Natureza da atividade.
             *
             * <p>Validação: Se {codCateg}(../../infoContrato_codCateg) = [104], deve ser preenchido
             * com [1]. Se {codCateg}(../../infoContrato_codCateg) = [102], deve ser preenchido com
             * [2].
             *
             * @param natAtividade Valor para atribuir ao campo natAtividade
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setNatAtividade(String natAtividade) {
              if (!"1".equals(natAtividade) && !"2".equals(natAtividade))
                throw new RuntimeException(
                    "Valor "
                        + String.valueOf(natAtividade)
                        + " inválido para o campo natAtividade");
              this.natAtividade = natAtividade;
              return this;
            }
            /**
             * Trabalho urbano
             *
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setNatAtividade_1() {
              this.natAtividade = "1";
              return this;
            }
            /**
             * Trabalho rural
             *
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setNatAtividade_2() {
              this.natAtividade = "2";
              return this;
            }

            /**
             * Mês relativo à data base da categoria profissional do trabalhador.
             *
             * @return Conteúdo do campo dtBase
             */
            public String getDtBase() {
              return this.dtBase;
            }

            /**
             * Mês relativo à data base da categoria profissional do trabalhador.
             *
             * <p>Validação: Se informado, deve ser maior ou igual a 1 e menor ou igual a 12.
             *
             * @param dtBase Valor para atribuir ao campo dtBase
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setDtBase(String dtBase) {
              this.dtBase = dtBase;
              return this;
            }

            /**
             * Preencher com o CNPJ do sindicato representativo da categoria (preponderante ou
             * diferenciada).
             *
             * @return Conteúdo do campo cnpjSindCategProf
             */
            public String getCnpjSindCategProf() {
              return this.cnpjSindCategProf;
            }

            /**
             * Preencher com o CNPJ do sindicato representativo da categoria (preponderante ou
             * diferenciada).
             *
             * <p>Validação: Deve ser um CNPJ válido, com 14 (catorze) algarismos.
             *
             * @param cnpjSindCategProf Valor para atribuir ao campo cnpjSindCategProf
             * @return O próprio InfoCeletista para continuar populando outros campos
             */
            public InfoCeletista<T> setCnpjSindCategProf(String cnpjSindCategProf) {
              this.cnpjSindCategProf = cnpjSindCategProf;
              return this;
            }

            /**
             * Dados sobre trabalho temporário
             *
             * @return Conteúdo do campo trabTemporario
             */
            public TrabTemporario getTrabTemporario() {
              return this.trabTemporario;
            }

            /**
             * Dados sobre trabalho temporário
             *
             * <p>DESCRICAO_COMPLETA:Dados sobre trabalho temporário. Preenchimento obrigatório no
             * caso de prorrogação de contrato de trabalhador temporário.
             *
             * <p>CONDICAO_GRUPO: OC (se
             * {codCateg}(2206_altContratual_vinculo_infoContrato_codCateg) = [106]); N (nos demais
             * casos)
             *
             * @return O objeto TrabTemporario para população dos campos filhos
             */
            public TrabTemporario<InfoCeletista<T>> setTrabTemporario() {
              if (this.trabTemporario == null) {
                this.trabTemporario = new TrabTemporario(this);
              }
              return this.trabTemporario;
            }

            /**
             * Informações relacionadas ao aprendiz
             *
             * @return Conteúdo do campo aprend
             */
            public Tipos.T_aprend getAprend() {
              return this.aprend;
            }

            /**
             * Informações relacionadas ao aprendiz
             *
             * <p>DESCRICAO_COMPLETA:Informações para identificação do empregador contratante de
             * aprendiz.
             *
             * <p>Preenchimento obrigatório no caso de contratação de aprendiz por entidade
             * educativa sem fins lucrativos que tenha por objetivo a assistência ao adolescente e à
             * educação profissional (art. 430, inciso II, CLT) ou por entidade de prática
             * desportiva filiada ao Sistema Nacional do Desporto ou a Sistema de Desporto de
             * Estado, do Distrito Federal ou de Município (art. 430, inciso III, CLT).
             *
             * <p>CONDICAO_GRUPO: OC (se
             * {codCateg}(2206_altContratual_vinculo_infoContrato_codCateg) = [103]); N (nos demais
             * casos)
             *
             * @return O objeto Tipos.T_aprend para população dos campos filhos
             */
            public Tipos.T_aprend<InfoCeletista<T>> setAprend() {
              if (this.aprend == null) {
                this.aprend = new Tipos.T_aprend(this);
              }
              return this.aprend;
            }

            public InfoCeletista(Object pai) {
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
             * Dados sobre trabalho temporário
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "justProrr",
                })
            public static class TrabTemporario<T> {

              /**
               * Descrever a justificativa para a prorrogação do contrato de trabalho temporário.
               */
              private String justProrr;

              /**
               * Descrever a justificativa para a prorrogação do contrato de trabalho temporário.
               *
               * @return Conteúdo do campo justProrr
               */
              public String getJustProrr() {
                return this.justProrr;
              }

              /**
               * Descrever a justificativa para a prorrogação do contrato de trabalho temporário.
               *
               * @param justProrr Valor para atribuir ao campo justProrr
               * @return O próprio TrabTemporario para continuar populando outros campos
               */
              public TrabTemporario<T> setJustProrr(String justProrr) {
                this.justProrr = justProrr;
                return this;
              }

              public TrabTemporario(Object pai) {
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
           * Informações de trabalhador estatutário.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "tpPlanRP",
                "indTetoRGPS",
                "indAbonoPerm",
              })
          public static class InfoEstatutario<T> {

            /** Tipo de plano de segregação da massa. */
            private String tpPlanRP;

            /**
             * Informar se o servidor está sujeito ao teto do RGPS pela instituição do regime de
             * previdência complementar.
             */
            private String indTetoRGPS;

            /** Indicar se o servidor recebe abono permanência. */
            private String indAbonoPerm;

            /**
             * Tipo de plano de segregação da massa.
             *
             * @return Conteúdo do campo tpPlanRP
             */
            public String getTpPlanRP() {
              return this.tpPlanRP;
            }

            /**
             * Tipo de plano de segregação da massa.
             *
             * @param tpPlanRP Valor para atribuir ao campo tpPlanRP
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setTpPlanRP(String tpPlanRP) {
              if (!"0".equals(tpPlanRP)
                  && !"1".equals(tpPlanRP)
                  && !"2".equals(tpPlanRP)
                  && !"3".equals(tpPlanRP))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpPlanRP) + " inválido para o campo tpPlanRP");
              this.tpPlanRP = tpPlanRP;
              return this;
            }
            /**
             * Sem segregação da massa
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setTpPlanRP_0() {
              this.tpPlanRP = "0";
              return this;
            }
            /**
             * Fundo em capitalização
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setTpPlanRP_1() {
              this.tpPlanRP = "1";
              return this;
            }
            /**
             * Fundo em repartição
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setTpPlanRP_2() {
              this.tpPlanRP = "2";
              return this;
            }
            /**
             * Mantido pelo Tesouro
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setTpPlanRP_3() {
              this.tpPlanRP = "3";
              return this;
            }

            /**
             * Informar se o servidor está sujeito ao teto do RGPS pela instituição do regime de
             * previdência complementar.
             *
             * @return Conteúdo do campo indTetoRGPS
             */
            public String getIndTetoRGPS() {
              return this.indTetoRGPS;
            }

            /**
             * Informar se o servidor está sujeito ao teto do RGPS pela instituição do regime de
             * previdência complementar.
             *
             * @param indTetoRGPS Valor para atribuir ao campo indTetoRGPS
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setIndTetoRGPS(String indTetoRGPS) {
              if (!"S".equals(indTetoRGPS) && !"N".equals(indTetoRGPS))
                throw new RuntimeException(
                    "Valor " + String.valueOf(indTetoRGPS) + " inválido para o campo indTetoRGPS");
              this.indTetoRGPS = indTetoRGPS;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setIndTetoRGPS_S() {
              this.indTetoRGPS = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setIndTetoRGPS_N() {
              this.indTetoRGPS = "N";
              return this;
            }

            /**
             * Indicar se o servidor recebe abono permanência.
             *
             * @return Conteúdo do campo indAbonoPerm
             */
            public String getIndAbonoPerm() {
              return this.indAbonoPerm;
            }

            /**
             * Indicar se o servidor recebe abono permanência.
             *
             * @param indAbonoPerm Valor para atribuir ao campo indAbonoPerm
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setIndAbonoPerm(String indAbonoPerm) {
              if (!"S".equals(indAbonoPerm) && !"N".equals(indAbonoPerm))
                throw new RuntimeException(
                    "Valor "
                        + String.valueOf(indAbonoPerm)
                        + " inválido para o campo indAbonoPerm");
              this.indAbonoPerm = indAbonoPerm;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setIndAbonoPerm_S() {
              this.indAbonoPerm = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio InfoEstatutario para continuar populando outros campos
             */
            public InfoEstatutario<T> setIndAbonoPerm_N() {
              this.indAbonoPerm = "N";
              return this;
            }

            public InfoEstatutario(Object pai) {
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
         * Informações do contrato de trabalho.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "nmCargo",
              "CBOCargo",
              "nmFuncao",
              "CBOFuncao",
              "acumCargo",
              "codCateg",
              "remuneracao",
              "duracao",
              "localTrabalho",
              "horContratual",
              "alvaraJudicial",
              "observacoes",
              "treiCap",
            })
        public static class InfoContrato<T> {

          /** Informar o nome do cargo. */
          private String nmCargo;

          /** Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo. */
          private String CBOCargo;

          /** Informar o nome da função de confiança/cargo em comissão. */
          private String nmFuncao;

          /** Informar a CBO relativa à função de confiança/cargo em comissão. */
          private String CBOFuncao;

          /** Informar se o cargo, emprego ou função pública é acumulável. */
          private String acumCargo;

          /** Preencher com o código da categoria do trabalhador. */
          private Integer codCateg;

          /** Informações da remuneração e periodicidade de pagamento. */
          private Tipos.T_remuneracao remuneracao;

          /** Duração do contrato de trabalho. */
          private Duracao duracao;

          /** Informações do local de trabalho. */
          private LocalTrabalho localTrabalho;

          /** Informações do horário contratual do trabalhador. */
          private Tipos.T_horContratual horContratual;

          /** Dados do alvará judicial */
          private Tipos.T_alvaraJudicial alvaraJudicial;

          /**
           * Observações do contrato de trabalho.
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           */
          private java.util.List<Observacoes> observacoes;

          /**
           * Treinamentos, capacitações, exercícios simulados e outras anotações.
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           */
          private java.util.List<Tipos.T_treiCap> treiCap;

          /**
           * Informar o nome do cargo.
           *
           * @return Conteúdo do campo nmCargo
           */
          public String getNmCargo() {
            return this.nmCargo;
          }

          /**
           * Informar o nome do cargo.
           *
           * <p>Validação: O preenchimento é obrigatório, exceto se for relativo a servidor nomeado
           * em cargo em comissão (no evento S-2200, {tpRegTrab}(2200_vinculo_tpRegTrab) = [2] e
           * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) = [2]).
           *
           * @param nmCargo Valor para atribuir ao campo nmCargo
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setNmCargo(String nmCargo) {
            this.nmCargo = nmCargo;
            return this;
          }

          /**
           * Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo.
           *
           * @return Conteúdo do campo CBOCargo
           */
          public String getCBOCargo() {
            return this.CBOCargo;
          }

          /**
           * Informar a Classificação Brasileira de Ocupações - CBO relativa ao cargo.
           *
           * <p>Validação: Informação obrigatória e exclusiva se {nmCargo}(./nmCargo) for
           * preenchido. Se informado, deve ser um código válido e existente na tabela de CBO, com 6
           * (seis) posições.
           *
           * @param CBOCargo Valor para atribuir ao campo CBOCargo
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setCBOCargo(String CBOCargo) {
            this.CBOCargo = CBOCargo;
            return this;
          }

          /**
           * Informar o nome da função de confiança/cargo em comissão.
           *
           * @return Conteúdo do campo nmFuncao
           */
          public String getNmFuncao() {
            return this.nmFuncao;
          }

          /**
           * Informar o nome da função de confiança/cargo em comissão.
           *
           * <p>Validação: Preenchimento obrigatório se for relativo a servidor nomeado em cargo em
           * comissão (no evento S-2200, {tpRegTrab}(2200_vinculo_tpRegTrab) = [2] e
           * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) = [2]).
           *
           * @param nmFuncao Valor para atribuir ao campo nmFuncao
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setNmFuncao(String nmFuncao) {
            this.nmFuncao = nmFuncao;
            return this;
          }

          /**
           * Informar a CBO relativa à função de confiança/cargo em comissão.
           *
           * @return Conteúdo do campo CBOFuncao
           */
          public String getCBOFuncao() {
            return this.CBOFuncao;
          }

          /**
           * Informar a CBO relativa à função de confiança/cargo em comissão.
           *
           * <p>Validação: Informação obrigatória e exclusiva se {nmFuncao}(./nmFuncao) for
           * preenchido. Se informado, deve ser um código válido e existente na tabela de CBO, com 6
           * (seis) posições.
           *
           * @param CBOFuncao Valor para atribuir ao campo CBOFuncao
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setCBOFuncao(String CBOFuncao) {
            this.CBOFuncao = CBOFuncao;
            return this;
          }

          /**
           * Informar se o cargo, emprego ou função pública é acumulável.
           *
           * @return Conteúdo do campo acumCargo
           */
          public String getAcumCargo() {
            return this.acumCargo;
          }

          /**
           * Informar se o cargo, emprego ou função pública é acumulável.
           *
           * <p>Validação: Preenchimento obrigatório se a natureza jurídica do declarante for igual
           * a 1XX-X, 201-1 ou 203-8.
           *
           * @param acumCargo Valor para atribuir ao campo acumCargo
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setAcumCargo(String acumCargo) {
            if (!"S".equals(acumCargo) && !"N".equals(acumCargo))
              throw new RuntimeException(
                  "Valor " + String.valueOf(acumCargo) + " inválido para o campo acumCargo");
            this.acumCargo = acumCargo;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setAcumCargo_S() {
            this.acumCargo = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setAcumCargo_N() {
            this.acumCargo = "N";
            return this;
          }

          /**
           * Preencher com o código da categoria do trabalhador.
           *
           * @return Conteúdo do campo codCateg
           */
          public Integer getCodCateg() {
            return this.codCateg;
          }

          /**
           * Preencher com o código da categoria do trabalhador.
           *
           * <p>Validação: Deve ser um código válido e existente na Tabela 01.
           *
           * @param codCateg Valor para atribuir ao campo codCateg
           * @return O próprio InfoContrato para continuar populando outros campos
           */
          public InfoContrato<T> setCodCateg(Integer codCateg) {
            this.codCateg = codCateg;
            return this;
          }

          /**
           * Informações da remuneração e periodicidade de pagamento.
           *
           * @return Conteúdo do campo remuneracao
           */
          public Tipos.T_remuneracao getRemuneracao() {
            return this.remuneracao;
          }

          /**
           * Informações da remuneração e periodicidade de pagamento.
           *
           * <p>CONDICAO_GRUPO: O (se {tpRegTrab}(2200_vinculo_tpRegTrab) em S-2200 = [1]); N (nos
           * demais casos)
           *
           * @return O objeto Tipos.T_remuneracao para população dos campos filhos
           */
          public Tipos.T_remuneracao<InfoContrato<T>> setRemuneracao() {
            if (this.remuneracao == null) {
              this.remuneracao = new Tipos.T_remuneracao(this);
            }
            return this.remuneracao;
          }

          /**
           * Duração do contrato de trabalho.
           *
           * @return Conteúdo do campo duracao
           */
          public Duracao getDuracao() {
            return this.duracao;
          }

          /**
           * Duração do contrato de trabalho.
           *
           * <p>CONDICAO_GRUPO: O (se {tpRegTrab}(2200_vinculo_tpRegTrab) em S-2200 = [1]); N (nos
           * demais casos)
           *
           * @return O objeto Duracao para população dos campos filhos
           */
          public Duracao<InfoContrato<T>> setDuracao() {
            if (this.duracao == null) {
              this.duracao = new Duracao(this);
            }
            return this.duracao;
          }

          /**
           * Informações do local de trabalho.
           *
           * @return Conteúdo do campo localTrabalho
           */
          public LocalTrabalho getLocalTrabalho() {
            return this.localTrabalho;
          }

          /**
           * Informações do local de trabalho.
           *
           * @return O objeto LocalTrabalho para população dos campos filhos
           */
          public LocalTrabalho<InfoContrato<T>> setLocalTrabalho() {
            if (this.localTrabalho == null) {
              this.localTrabalho = new LocalTrabalho(this);
            }
            return this.localTrabalho;
          }

          /**
           * Informações do horário contratual do trabalhador.
           *
           * @return Conteúdo do campo horContratual
           */
          public Tipos.T_horContratual getHorContratual() {
            return this.horContratual;
          }

          /**
           * Informações do horário contratual do trabalhador.
           *
           * <p>CONDICAO_GRUPO: O (se {tpRegJor}(../../infoRegimeTrab_infoCeletista_tpRegJor) =
           * [1]); OC (nos demais casos)
           *
           * @return O objeto Tipos.T_horContratual para população dos campos filhos
           */
          public Tipos.T_horContratual<InfoContrato<T>> setHorContratual() {
            if (this.horContratual == null) {
              this.horContratual = new Tipos.T_horContratual(this);
            }
            return this.horContratual;
          }

          /**
           * Dados do alvará judicial
           *
           * @return Conteúdo do campo alvaraJudicial
           */
          public Tipos.T_alvaraJudicial getAlvaraJudicial() {
            return this.alvaraJudicial;
          }

          /**
           * Dados do alvará judicial
           *
           * <p>DESCRICAO_COMPLETA:Informações do alvará judicial em caso de contratação de menores
           * de 14 anos, em qualquer categoria, e de maiores de 14 e menores de 16, em categoria
           * diferente de "Aprendiz".
           *
           * <p>CONDICAO_GRUPO: OC
           *
           * @return O objeto Tipos.T_alvaraJudicial para população dos campos filhos
           */
          public Tipos.T_alvaraJudicial<InfoContrato<T>> setAlvaraJudicial() {
            if (this.alvaraJudicial == null) {
              this.alvaraJudicial = new Tipos.T_alvaraJudicial(this);
            }
            return this.alvaraJudicial;
          }

          /**
           * Observações do contrato de trabalho.
           *
           * @return Conteúdo do campo observacoes
           */
          public java.util.List<Observacoes> getObservacoes() {
            return this.observacoes;
          }

          /**
           * Observações do contrato de trabalho.
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           *
           * <p>CONDICAO_GRUPO: OC
           *
           * @return O objeto Observacoes para população dos campos filhos
           */
          public Observacoes<InfoContrato<T>> setObservacoes_Next() {
            if (this.observacoes == null) {
              this.observacoes = new java.util.ArrayList<>();
            }
            Observacoes toAdd = new Observacoes(this);
            this.observacoes.add(toAdd);
            return toAdd;
          }

          /**
           * Treinamentos, capacitações, exercícios simulados e outras anotações.
           *
           * @return Conteúdo do campo treiCap
           */
          public java.util.List<Tipos.T_treiCap> getTreiCap() {
            return this.treiCap;
          }

          /**
           * Treinamentos, capacitações, exercícios simulados e outras anotações.
           *
           * <p>- Esse campo pode ser repetido até 99 vezes
           *
           * <p>DESCRICAO_COMPLETA:Treinamentos, capacitações, exercícios simulados, autorizações ou
           * outras anotações que devam ser anotadas no registro de empregados e/ou na CTPS, por
           * determinação de Norma Regulamentadora - NR.
           *
           * <p>CHAVE_GRUPO: {codTreiCap}
           *
           * <p>CONDICAO_GRUPO: OC
           *
           * @return O objeto Tipos.T_treiCap para população dos campos filhos
           */
          public Tipos.T_treiCap<InfoContrato<T>> setTreiCap_Next() {
            if (this.treiCap == null) {
              this.treiCap = new java.util.ArrayList<>();
            }
            Tipos.T_treiCap toAdd = new Tipos.T_treiCap(this);
            this.treiCap.add(toAdd);
            return toAdd;
          }

          public InfoContrato(Object pai) {
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
           * Duração do contrato de trabalho.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "tpContr", "dtTerm", "objDet",
              })
          public static class Duracao<T> {

            /** Tipo de contrato de trabalho. */
            private String tpContr;

            /** Data do término do contrato por prazo determinado. */
            private javax.xml.datatype.XMLGregorianCalendar dtTerm;

            /**
             * Indicação do objeto determinante da contratação por prazo determinado (obra, serviço,
             * safra, etc.).
             */
            private String objDet;

            /**
             * Tipo de contrato de trabalho.
             *
             * @return Conteúdo do campo tpContr
             */
            public String getTpContr() {
              return this.tpContr;
            }

            /**
             * Tipo de contrato de trabalho.
             *
             * @param tpContr Valor para atribuir ao campo tpContr
             * @return O próprio Duracao para continuar populando outros campos
             */
            public Duracao<T> setTpContr(String tpContr) {
              if (!"1".equals(tpContr) && !"2".equals(tpContr) && !"3".equals(tpContr))
                throw new RuntimeException(
                    "Valor " + String.valueOf(tpContr) + " inválido para o campo tpContr");
              this.tpContr = tpContr;
              return this;
            }
            /**
             * Prazo indeterminado
             *
             * @return O próprio Duracao para continuar populando outros campos
             */
            public Duracao<T> setTpContr_1() {
              this.tpContr = "1";
              return this;
            }
            /**
             * Prazo determinado, definido em dias
             *
             * @return O próprio Duracao para continuar populando outros campos
             */
            public Duracao<T> setTpContr_2() {
              this.tpContr = "2";
              return this;
            }
            /**
             * Prazo determinado, vinculado à ocorrência de um fato
             *
             * @return O próprio Duracao para continuar populando outros campos
             */
            public Duracao<T> setTpContr_3() {
              this.tpContr = "3";
              return this;
            }

            /**
             * Data do término do contrato por prazo determinado.
             *
             * @return Conteúdo do campo dtTerm
             */
            public javax.xml.datatype.XMLGregorianCalendar getDtTerm() {
              return this.dtTerm;
            }

            /**
             * Data do término do contrato por prazo determinado.
             *
             * <p>Validação: O preenchimento é obrigatório se {tpContr}(./tpContr) = [2]. Não
             * informar se {tpContr}(./tpContr) = [1]. Se preenchido, deve ser igual ou posterior à
             * data de admissão (no caso de transferência ou mudança de CPF, igual ou posterior a
             * {sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf),
             * {transfDom/dtTransf}(2200_vinculo_transfDom_dtTransf) ou
             * {dtAltCPF}(2200_vinculo_mudancaCPF_dtAltCPF) do evento S-2200, conforme o caso).
             *
             * @param dtTerm Valor para atribuir ao campo dtTerm
             * @return O próprio Duracao para continuar populando outros campos
             */
            public Duracao<T> setDtTerm(javax.xml.datatype.XMLGregorianCalendar dtTerm) {
              this.dtTerm = dtTerm;
              return this;
            }

            /**
             * Indicação do objeto determinante da contratação por prazo determinado (obra, serviço,
             * safra, etc.).
             *
             * @return Conteúdo do campo objDet
             */
            public String getObjDet() {
              return this.objDet;
            }

            /**
             * Indicação do objeto determinante da contratação por prazo determinado (obra, serviço,
             * safra, etc.).
             *
             * <p>Validação: O preenchimento é obrigatório e exclusivo se {tpContr}(./tpContr) =
             * [3].
             *
             * @param objDet Valor para atribuir ao campo objDet
             * @return O próprio Duracao para continuar populando outros campos
             */
            public Duracao<T> setObjDet(String objDet) {
              this.objDet = objDet;
              return this;
            }

            public Duracao(Object pai) {
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
           * Informações do local de trabalho.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "localTrabGeral",
                "localTempDom",
              })
          public static class LocalTrabalho<T> {

            /** Estabelecimento onde o trabalhador exercerá suas atividades */
            private Tipos.T_localTrabGeral localTrabGeral;

            /** Endereço de trabalho do trabalhador doméstico e trabalhador temporário */
            private Tipos.T_endereco_brasil localTempDom;

            /**
             * Estabelecimento onde o trabalhador exercerá suas atividades
             *
             * @return Conteúdo do campo localTrabGeral
             */
            public Tipos.T_localTrabGeral getLocalTrabGeral() {
              return this.localTrabGeral;
            }

            /**
             * Estabelecimento onde o trabalhador exercerá suas atividades
             *
             * <p>DESCRICAO_COMPLETA:Estabelecimento (CNPJ, CNO, CAEPF) onde o trabalhador (exceto
             * doméstico e temporário) exercerá suas atividades. Caso o trabalhador exerça suas
             * atividades em instalações de terceiros, este campo deve ser preenchido com o
             * estabelecimento do próprio empregador ao qual o trabalhador esteja vinculado.
             *
             * <p>CONDICAO_GRUPO: O (se {codCateg}(2206_altContratual_vinculo_infoContrato_codCateg)
             * for diferente de [104]); N (nos demais casos)
             *
             * @return O objeto Tipos.T_localTrabGeral para população dos campos filhos
             */
            public Tipos.T_localTrabGeral<LocalTrabalho<T>> setLocalTrabGeral() {
              if (this.localTrabGeral == null) {
                this.localTrabGeral = new Tipos.T_localTrabGeral(this);
              }
              return this.localTrabGeral;
            }

            /**
             * Endereço de trabalho do trabalhador doméstico e trabalhador temporário
             *
             * @return Conteúdo do campo localTempDom
             */
            public Tipos.T_endereco_brasil getLocalTempDom() {
              return this.localTempDom;
            }

            /**
             * Endereço de trabalho do trabalhador doméstico e trabalhador temporário
             *
             * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente em caso de trabalhador
             * doméstico e trabalhador temporário, indicando o endereço onde o trabalhador exerce
             * suas atividades.
             *
             * <p>CONDICAO_GRUPO: O (se {codCateg}(2206_altContratual_vinculo_infoContrato_codCateg)
             * = [104, 106]); N (nos demais casos)
             *
             * @return O objeto Tipos.T_endereco_brasil para população dos campos filhos
             */
            public Tipos.T_endereco_brasil<LocalTrabalho<T>> setLocalTempDom() {
              if (this.localTempDom == null) {
                this.localTempDom = new Tipos.T_endereco_brasil(this);
              }
              return this.localTempDom;
            }

            public LocalTrabalho(Object pai) {
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
           * Observações do contrato de trabalho.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "observacao",
              })
          public static class Observacoes<T> {

            /** Observação relacionada ao contrato de trabalho. */
            private String observacao;

            /**
             * Observação relacionada ao contrato de trabalho.
             *
             * @return Conteúdo do campo observacao
             */
            public String getObservacao() {
              return this.observacao;
            }

            /**
             * Observação relacionada ao contrato de trabalho.
             *
             * @param observacao Valor para atribuir ao campo observacao
             * @return O próprio Observacoes para continuar populando outros campos
             */
            public Observacoes<T> setObservacao(String observacao) {
              this.observacao = observacao;
              return this;
            }

            public Observacoes(Object pai) {
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
