package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2230 - Afastamento Temporário */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtAfastTemp",
    })
@XmlRootElement(name = "eSocial")
public class Evento_AfastTemp {

  /** Evento Afastamento Temporário. */
  private EvtAfastTemp evtAfastTemp;

  /**
   * Evento Afastamento Temporário.
   *
   * @return Conteúdo do campo evtAfastTemp
   */
  public EvtAfastTemp getEvtAfastTemp() {
    return this.evtAfastTemp;
  }

  /**
   * Evento Afastamento Temporário.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_AFASTAMENTO
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_EXT_SEM_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EVENTO_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EXCLUI_EVENTO_AFASTAMENTO
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
   * <p>REGRA:REGRA_TSV_ATIVO_NA_DTEVENTO
   *
   * <p>REGRA:REGRA_VINCULO_ATIVO_NA_DTEVENTO
   *
   * @return O objeto EvtAfastTemp para população dos campos filhos
   */
  public EvtAfastTemp<Evento_AfastTemp> setEvtAfastTemp() {
    if (this.evtAfastTemp == null) {
      this.evtAfastTemp = new EvtAfastTemp(this);
    }
    return this.evtAfastTemp;
  }

  /**
   * Evento Afastamento Temporário.
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
        "infoAfastamento",
      })
  public static class EvtAfastTemp<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private IdeVinculo ideVinculo;

    /** Informações do afastamento temporário. */
    private InfoAfastamento infoAfastamento;

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
    public Tipos.T_ideEvento_trab<EvtAfastTemp<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtAfastTemp<T>> setIdeEmpregador() {
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
    public IdeVinculo getIdeVinculo() {
      return this.ideVinculo;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
     *
     * @return O objeto IdeVinculo para população dos campos filhos
     */
    public IdeVinculo<EvtAfastTemp<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new IdeVinculo(this);
      }
      return this.ideVinculo;
    }

    /**
     * Informações do afastamento temporário.
     *
     * @return Conteúdo do campo infoAfastamento
     */
    public InfoAfastamento getInfoAfastamento() {
      return this.infoAfastamento;
    }

    /**
     * Informações do afastamento temporário.
     *
     * @return O objeto InfoAfastamento para população dos campos filhos
     */
    public InfoAfastamento<EvtAfastTemp<T>> setInfoAfastamento() {
      if (this.infoAfastamento == null) {
        this.infoAfastamento = new InfoAfastamento(this);
      }
      return this.infoAfastamento;
    }

    public EvtAfastTemp(Object pai) {
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
     * Informações de identificação do trabalhador e do vínculo.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfTrab",
          "matricula",
          "codCateg",
        })
    public static class IdeVinculo<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /**
       * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
       * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
       */
      private String matricula;

      /** Preencher com o código da categoria do trabalhador. */
      private Integer codCateg;

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
       * @param cpfTrab Valor para atribuir ao campo cpfTrab
       * @return O próprio IdeVinculo para continuar populando outros campos
       */
      public IdeVinculo<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

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
       * <p>Validação: Deve corresponder à matrícula informada pelo empregador no evento S-2200 ou
       * S-2300 do respectivo contrato. Não preencher no caso de Trabalhador Sem Vínculo de
       * Emprego/Estatutário - TSVE sem informação de matrícula no evento S-2300.
       *
       * @param matricula Valor para atribuir ao campo matricula
       * @return O próprio IdeVinculo para continuar populando outros campos
       */
      public IdeVinculo<T> setMatricula(String matricula) {
        this.matricula = matricula;
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
       * <p>Informar somente no caso de TSVE sem informação de matrícula no evento S-2300.
       *
       * <p>Validação: Informação obrigatória e exclusiva se não houver preenchimento de
       * {matricula}(./matricula). Se informado, deve ser um código válido e existente na Tabela 01.
       *
       * @param codCateg Valor para atribuir ao campo codCateg
       * @return O próprio IdeVinculo para continuar populando outros campos
       */
      public IdeVinculo<T> setCodCateg(Integer codCateg) {
        this.codCateg = codCateg;
        return this;
      }

      public IdeVinculo(Object pai) {
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
     * Informações do afastamento temporário.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "iniAfastamento",
          "infoRetif",
          "fimAfastamento",
        })
    public static class InfoAfastamento<T> {

      /** Informações de início do afastamento. */
      private IniAfastamento iniAfastamento;

      /** Informações de retificação do afastamento */
      private InfoRetif infoRetif;

      /** Informação do término do afastamento. */
      private FimAfastamento fimAfastamento;

      /**
       * Informações de início do afastamento.
       *
       * @return Conteúdo do campo iniAfastamento
       */
      public IniAfastamento getIniAfastamento() {
        return this.iniAfastamento;
      }

      /**
       * Informações de início do afastamento.
       *
       * <p>CONDICAO_GRUPO: O (se não for preenchido o grupo {fimAfastamento}(../fimAfastamento));
       * OC (nos demais casos)
       *
       * @return O objeto IniAfastamento para população dos campos filhos
       */
      public IniAfastamento<InfoAfastamento<T>> setIniAfastamento() {
        if (this.iniAfastamento == null) {
          this.iniAfastamento = new IniAfastamento(this);
        }
        return this.iniAfastamento;
      }

      /**
       * Informações de retificação do afastamento
       *
       * @return Conteúdo do campo infoRetif
       */
      public InfoRetif getInfoRetif() {
        return this.infoRetif;
      }

      /**
       * Informações de retificação do afastamento
       *
       * <p>DESCRICAO_COMPLETA:Informações de retificação do afastamento temporário.
       *
       * <p>Preenchimento obrigatório caso {codMotAfast}(../iniAfastamento_codMotAfast) seja
       * retificado de [01] para [03] ou de [03] para [01].
       *
       * <p>CONDICAO_GRUPO: OC ((se {indRetif}(2230_ideEvento_indRetif) = [2]) E (o grupo
       * {iniAfastamento}(../iniAfastamento) estiver preenchido); N (nos demais casos)
       *
       * @return O objeto InfoRetif para população dos campos filhos
       */
      public InfoRetif<InfoAfastamento<T>> setInfoRetif() {
        if (this.infoRetif == null) {
          this.infoRetif = new InfoRetif(this);
        }
        return this.infoRetif;
      }

      /**
       * Informação do término do afastamento.
       *
       * @return Conteúdo do campo fimAfastamento
       */
      public FimAfastamento getFimAfastamento() {
        return this.fimAfastamento;
      }

      /**
       * Informação do término do afastamento.
       *
       * <p>CONDICAO_GRUPO: O (se não for preenchido o grupo {iniAfastamento}(../iniAfastamento));
       * OC (nos demais casos)
       *
       * <p>REGRA:REGRA_EXISTE_EVENTO_AFASTAMENTO
       *
       * @return O objeto FimAfastamento para população dos campos filhos
       */
      public FimAfastamento<InfoAfastamento<T>> setFimAfastamento() {
        if (this.fimAfastamento == null) {
          this.fimAfastamento = new FimAfastamento(this);
        }
        return this.fimAfastamento;
      }

      public InfoAfastamento(Object pai) {
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
       * Informações de início do afastamento.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtIniAfast",
            "codMotAfast",
            "infoMesmoMtv",
            "tpAcidTransito",
            "observacao",
            "perAquis",
            "infoCessao",
            "infoMandSind",
            "infoMandElet",
          })
      public static class IniAfastamento<T> {

        /** Data de início do afastamento. */
        private javax.xml.datatype.XMLGregorianCalendar dtIniAfast;

        /** Preencher com o código do motivo de afastamento temporário. */
        private String codMotAfast;

        /**
         * Informar se o afastamento decorre da mesma doença que gerou o afastamento anterior
         * ({codMotAfast}(./codMotAfast) = [01, 03]), dentro de 60 dias.
         */
        private String infoMesmoMtv;

        /** Tipo de acidente de trânsito. */
        private String tpAcidTransito;

        /**
         * Detalhar as informações sobre o afastamento do trabalhador, de maneira a explicitar os
         * motivos do mesmo.
         */
        private String observacao;

        /** Período aquisitivo de férias */
        private PerAquis perAquis;

        /** Informações complementares - Cessão/Requisição de trabalhador. */
        private InfoCessao infoCessao;

        /** Informações complementares - Afastamento para exercício de mandato sindical. */
        private InfoMandSind infoMandSind;

        /** Informações complementares - Afastamento para exercício de mandato eletivo. */
        private InfoMandElet infoMandElet;

        /**
         * Data de início do afastamento.
         *
         * @return Conteúdo do campo dtIniAfast
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtIniAfast() {
          return this.dtIniAfast;
        }

        /**
         * Data de início do afastamento.
         *
         * <p>Validação: Deve-se obedecer às seguintes regras:
         *
         * <p>a) Não pode ser posterior à data atual, exceto se:
         *
         * <p>a1) {codMotAfast}(./codMotAfast) = [15] (férias), situação em que pode ser até 60 dias
         * posterior à data atual;
         *
         * <p>a2) {codMotAfast}(./codMotAfast) = [18], situação em que pode ser até 120 dias
         * posterior à data atual;
         *
         * <p>b) É necessário que o trabalhador esteja, antes da data de início do afastamento, em
         * atividade, ou seja, não pode existir evento de afastamento anterior a
         * {dtIniAfast}(./dtIniAfast) sem que este tenha sido encerrado.
         *
         * @param dtIniAfast Valor para atribuir ao campo dtIniAfast
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setDtIniAfast(javax.xml.datatype.XMLGregorianCalendar dtIniAfast) {
          this.dtIniAfast = dtIniAfast;
          return this;
        }

        /**
         * Preencher com o código do motivo de afastamento temporário.
         *
         * @return Conteúdo do campo codMotAfast
         */
        public String getCodMotAfast() {
          return this.codMotAfast;
        }

        /**
         * Preencher com o código do motivo de afastamento temporário.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 18.
         *
         * @param codMotAfast Valor para atribuir ao campo codMotAfast
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setCodMotAfast(String codMotAfast) {
          this.codMotAfast = codMotAfast;
          return this;
        }

        /**
         * Informar se o afastamento decorre da mesma doença que gerou o afastamento anterior
         * ({codMotAfast}(./codMotAfast) = [01, 03]), dentro de 60 dias.
         *
         * @return Conteúdo do campo infoMesmoMtv
         */
        public String getInfoMesmoMtv() {
          return this.infoMesmoMtv;
        }

        /**
         * Informar se o afastamento decorre da mesma doença que gerou o afastamento anterior
         * ({codMotAfast}(./codMotAfast) = [01, 03]), dentro de 60 dias.
         *
         * @param infoMesmoMtv Valor para atribuir ao campo infoMesmoMtv
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setInfoMesmoMtv(String infoMesmoMtv) {
          if (!"S".equals(infoMesmoMtv) && !"N".equals(infoMesmoMtv))
            throw new RuntimeException(
                "Valor " + String.valueOf(infoMesmoMtv) + " inválido para o campo infoMesmoMtv");
          this.infoMesmoMtv = infoMesmoMtv;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setInfoMesmoMtv_S() {
          this.infoMesmoMtv = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setInfoMesmoMtv_N() {
          this.infoMesmoMtv = "N";
          return this;
        }

        /**
         * Tipo de acidente de trânsito.
         *
         * @return Conteúdo do campo tpAcidTransito
         */
        public String getTpAcidTransito() {
          return this.tpAcidTransito;
        }

        /**
         * Tipo de acidente de trânsito.
         *
         * <p>Validação: Somente pode ser preenchido se {codMotAfast}(./codMotAfast) = [01, 03].
         *
         * @param tpAcidTransito Valor para atribuir ao campo tpAcidTransito
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setTpAcidTransito(String tpAcidTransito) {
          if (!"1".equals(tpAcidTransito)
              && !"2".equals(tpAcidTransito)
              && !"3".equals(tpAcidTransito))
            throw new RuntimeException(
                "Valor "
                    + String.valueOf(tpAcidTransito)
                    + " inválido para o campo tpAcidTransito");
          this.tpAcidTransito = tpAcidTransito;
          return this;
        }
        /**
         * Atropelamento
         *
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setTpAcidTransito_1() {
          this.tpAcidTransito = "1";
          return this;
        }
        /**
         * Colisão
         *
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setTpAcidTransito_2() {
          this.tpAcidTransito = "2";
          return this;
        }
        /**
         * Outros
         *
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setTpAcidTransito_3() {
          this.tpAcidTransito = "3";
          return this;
        }

        /**
         * Detalhar as informações sobre o afastamento do trabalhador, de maneira a explicitar os
         * motivos do mesmo.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Detalhar as informações sobre o afastamento do trabalhador, de maneira a explicitar os
         * motivos do mesmo.
         *
         * <p>Validação: O preenchimento é obrigatório se {codMotAfast}(./codMotAfast) = [21].
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio IniAfastamento para continuar populando outros campos
         */
        public IniAfastamento<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        /**
         * Período aquisitivo de férias
         *
         * @return Conteúdo do campo perAquis
         */
        public PerAquis getPerAquis() {
          return this.perAquis;
        }

        /**
         * Período aquisitivo de férias
         *
         * <p>DESCRICAO_COMPLETA:Informações referentes ao período aquisitivo de férias.
         *
         * <p>CONDICAO_GRUPO: O (se {codMotAfast}(../codMotAfast) = [15] E (o código de categoria no
         * RET for igual a [1XX, 301, 302, 303, 304, 306, 307, 309, 310, 312, 410] com {tpRegTrab}
         * em S-2200/S-2300 = [1] OU o código de categoria no RET for igual a [401] com
         * {tpRegTrab}(2300_infoTSVInicio_infoComplementares_infoDirigenteSindical_tpRegTrab) em
         * S-2300 = [1] ou não informado) E {dtIniAfast}(../dtIniAfast) >= [2021-05-10]); N (nos
         * demais casos)
         *
         * @return O objeto PerAquis para população dos campos filhos
         */
        public PerAquis<IniAfastamento<T>> setPerAquis() {
          if (this.perAquis == null) {
            this.perAquis = new PerAquis(this);
          }
          return this.perAquis;
        }

        /**
         * Informações complementares - Cessão/Requisição de trabalhador.
         *
         * @return Conteúdo do campo infoCessao
         */
        public InfoCessao getInfoCessao() {
          return this.infoCessao;
        }

        /**
         * Informações complementares - Cessão/Requisição de trabalhador.
         *
         * <p>CONDICAO_GRUPO: O (se {codMotAfast}(../codMotAfast) = [14]); N (nos demais casos)
         *
         * @return O objeto InfoCessao para população dos campos filhos
         */
        public InfoCessao<IniAfastamento<T>> setInfoCessao() {
          if (this.infoCessao == null) {
            this.infoCessao = new InfoCessao(this);
          }
          return this.infoCessao;
        }

        /**
         * Informações complementares - Afastamento para exercício de mandato sindical.
         *
         * @return Conteúdo do campo infoMandSind
         */
        public InfoMandSind getInfoMandSind() {
          return this.infoMandSind;
        }

        /**
         * Informações complementares - Afastamento para exercício de mandato sindical.
         *
         * <p>CONDICAO_GRUPO: O (se {codMotAfast}(../codMotAfast) = [24]); N (nos demais casos)
         *
         * @return O objeto InfoMandSind para população dos campos filhos
         */
        public InfoMandSind<IniAfastamento<T>> setInfoMandSind() {
          if (this.infoMandSind == null) {
            this.infoMandSind = new InfoMandSind(this);
          }
          return this.infoMandSind;
        }

        /**
         * Informações complementares - Afastamento para exercício de mandato eletivo.
         *
         * @return Conteúdo do campo infoMandElet
         */
        public InfoMandElet getInfoMandElet() {
          return this.infoMandElet;
        }

        /**
         * Informações complementares - Afastamento para exercício de mandato eletivo.
         *
         * <p>CONDICAO_GRUPO: O (se {codMotAfast}(../codMotAfast) = [22] e se a natureza jurídica do
         * declarante for igual a 1XX-X, 201-1 ou 203-8); N (nos demais casos)
         *
         * @return O objeto InfoMandElet para população dos campos filhos
         */
        public InfoMandElet<IniAfastamento<T>> setInfoMandElet() {
          if (this.infoMandElet == null) {
            this.infoMandElet = new InfoMandElet(this);
          }
          return this.infoMandElet;
        }

        public IniAfastamento(Object pai) {
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
         * Período aquisitivo de férias
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "dtInicio",
              "dtFim",
            })
        public static class PerAquis<T> {

          /** Data de início do período aquisitivo de férias. */
          private javax.xml.datatype.XMLGregorianCalendar dtInicio;

          /** Data de término do período aquisitivo de férias. */
          private javax.xml.datatype.XMLGregorianCalendar dtFim;

          /**
           * Data de início do período aquisitivo de férias.
           *
           * @return Conteúdo do campo dtInicio
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtInicio() {
            return this.dtInicio;
          }

          /**
           * Data de início do período aquisitivo de férias.
           *
           * <p>Validação: Deve ser igual ou posterior à data de admissão.
           *
           * @param dtInicio Valor para atribuir ao campo dtInicio
           * @return O próprio PerAquis para continuar populando outros campos
           */
          public PerAquis<T> setDtInicio(javax.xml.datatype.XMLGregorianCalendar dtInicio) {
            this.dtInicio = dtInicio;
            return this;
          }

          /**
           * Data de término do período aquisitivo de férias.
           *
           * @return Conteúdo do campo dtFim
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtFim() {
            return this.dtFim;
          }

          /**
           * Data de término do período aquisitivo de férias.
           *
           * <p>Informar o campo somente se o período aquisitivo for diferente de 1 ano.
           *
           * <p>Validação: Se informada, deve ser uma data posterior a {dtInicio}(./dtInicio).
           *
           * @param dtFim Valor para atribuir ao campo dtFim
           * @return O próprio PerAquis para continuar populando outros campos
           */
          public PerAquis<T> setDtFim(javax.xml.datatype.XMLGregorianCalendar dtFim) {
            this.dtFim = dtFim;
            return this;
          }

          public PerAquis(Object pai) {
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
         * Informações complementares - Cessão/Requisição de trabalhador.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "cnpjCess",
              "infOnus",
            })
        public static class InfoCessao<T> {

          /**
           * Preencher com o CNPJ do órgão/entidade para o qual o trabalhador foi
           * cedido/requisitado.
           */
          private String cnpjCess;

          /** Ônus da cessão/requisição. */
          private String infOnus;

          /**
           * Preencher com o CNPJ do órgão/entidade para o qual o trabalhador foi
           * cedido/requisitado.
           *
           * @return Conteúdo do campo cnpjCess
           */
          public String getCnpjCess() {
            return this.cnpjCess;
          }

          /**
           * Preencher com o CNPJ do órgão/entidade para o qual o trabalhador foi
           * cedido/requisitado.
           *
           * <p>Validação: Deve ser um CNPJ diferente do CNPJ do empregador e diferente dos
           * estabelecimentos informados através do evento S-1005.
           *
           * <p>REGRA:REGRA_VALIDA_CNPJ
           *
           * @param cnpjCess Valor para atribuir ao campo cnpjCess
           * @return O próprio InfoCessao para continuar populando outros campos
           */
          public InfoCessao<T> setCnpjCess(String cnpjCess) {
            this.cnpjCess = cnpjCess;
            return this;
          }

          /**
           * Ônus da cessão/requisição.
           *
           * @return Conteúdo do campo infOnus
           */
          public String getInfOnus() {
            return this.infOnus;
          }

          /**
           * Ônus da cessão/requisição.
           *
           * @param infOnus Valor para atribuir ao campo infOnus
           * @return O próprio InfoCessao para continuar populando outros campos
           */
          public InfoCessao<T> setInfOnus(String infOnus) {
            if (!"1".equals(infOnus) && !"2".equals(infOnus) && !"3".equals(infOnus))
              throw new RuntimeException(
                  "Valor " + String.valueOf(infOnus) + " inválido para o campo infOnus");
            this.infOnus = infOnus;
            return this;
          }
          /**
           * Ônus do cedente
           *
           * @return O próprio InfoCessao para continuar populando outros campos
           */
          public InfoCessao<T> setInfOnus_1() {
            this.infOnus = "1";
            return this;
          }
          /**
           * Ônus do cessionário
           *
           * @return O próprio InfoCessao para continuar populando outros campos
           */
          public InfoCessao<T> setInfOnus_2() {
            this.infOnus = "2";
            return this;
          }
          /**
           * Ônus do cedente e cessionário
           *
           * @return O próprio InfoCessao para continuar populando outros campos
           */
          public InfoCessao<T> setInfOnus_3() {
            this.infOnus = "3";
            return this;
          }

          public InfoCessao(Object pai) {
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
         * Informações complementares - Afastamento para exercício de mandato sindical.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "cnpjSind",
              "infOnusRemun",
            })
        public static class InfoMandSind<T> {

          /** CNPJ do sindicato no qual o trabalhador exercerá o mandato. */
          private String cnpjSind;

          /** Ônus da remuneração. */
          private String infOnusRemun;

          /**
           * CNPJ do sindicato no qual o trabalhador exercerá o mandato.
           *
           * @return Conteúdo do campo cnpjSind
           */
          public String getCnpjSind() {
            return this.cnpjSind;
          }

          /**
           * CNPJ do sindicato no qual o trabalhador exercerá o mandato.
           *
           * <p>Validação: Deve ser um CNPJ diferente do CNPJ base do empregador e diferente dos
           * informados na Tabela de Estabelecimentos (S-1005).
           *
           * <p>REGRA:REGRA_VALIDA_CNPJ
           *
           * @param cnpjSind Valor para atribuir ao campo cnpjSind
           * @return O próprio InfoMandSind para continuar populando outros campos
           */
          public InfoMandSind<T> setCnpjSind(String cnpjSind) {
            this.cnpjSind = cnpjSind;
            return this;
          }

          /**
           * Ônus da remuneração.
           *
           * @return Conteúdo do campo infOnusRemun
           */
          public String getInfOnusRemun() {
            return this.infOnusRemun;
          }

          /**
           * Ônus da remuneração.
           *
           * @param infOnusRemun Valor para atribuir ao campo infOnusRemun
           * @return O próprio InfoMandSind para continuar populando outros campos
           */
          public InfoMandSind<T> setInfOnusRemun(String infOnusRemun) {
            if (!"1".equals(infOnusRemun) && !"2".equals(infOnusRemun) && !"3".equals(infOnusRemun))
              throw new RuntimeException(
                  "Valor " + String.valueOf(infOnusRemun) + " inválido para o campo infOnusRemun");
            this.infOnusRemun = infOnusRemun;
            return this;
          }
          /**
           * Apenas do empregador
           *
           * @return O próprio InfoMandSind para continuar populando outros campos
           */
          public InfoMandSind<T> setInfOnusRemun_1() {
            this.infOnusRemun = "1";
            return this;
          }
          /**
           * Apenas do sindicato
           *
           * @return O próprio InfoMandSind para continuar populando outros campos
           */
          public InfoMandSind<T> setInfOnusRemun_2() {
            this.infOnusRemun = "2";
            return this;
          }
          /**
           * Parte do empregador, sendo a diferença e/ou complementação salarial paga pelo sindicato
           *
           * @return O próprio InfoMandSind para continuar populando outros campos
           */
          public InfoMandSind<T> setInfOnusRemun_3() {
            this.infOnusRemun = "3";
            return this;
          }

          public InfoMandSind(Object pai) {
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
         * Informações complementares - Afastamento para exercício de mandato eletivo.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "cnpjMandElet",
              "indRemunCargo",
            })
        public static class InfoMandElet<T> {

          /** CNPJ do órgão no qual o trabalhador exercerá o mandato eletivo. */
          private String cnpjMandElet;

          /** Indicar se o servidor optou pela remuneração do cargo efetivo. */
          private String indRemunCargo;

          /**
           * CNPJ do órgão no qual o trabalhador exercerá o mandato eletivo.
           *
           * @return Conteúdo do campo cnpjMandElet
           */
          public String getCnpjMandElet() {
            return this.cnpjMandElet;
          }

          /**
           * CNPJ do órgão no qual o trabalhador exercerá o mandato eletivo.
           *
           * <p>Validação: Deve ser um CNPJ diferente do CNPJ base do empregador e diferente dos
           * informados na Tabela de Estabelecimentos (S-1005).
           *
           * <p>REGRA:REGRA_VALIDA_CNPJ
           *
           * @param cnpjMandElet Valor para atribuir ao campo cnpjMandElet
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setCnpjMandElet(String cnpjMandElet) {
            this.cnpjMandElet = cnpjMandElet;
            return this;
          }

          /**
           * Indicar se o servidor optou pela remuneração do cargo efetivo.
           *
           * @return Conteúdo do campo indRemunCargo
           */
          public String getIndRemunCargo() {
            return this.indRemunCargo;
          }

          /**
           * Indicar se o servidor optou pela remuneração do cargo efetivo.
           *
           * <p>Validação: Informação obrigatória e exclusiva se o código de categoria no Registro
           * de Eventos Trabalhistas - RET for igual a [301].
           *
           * @param indRemunCargo Valor para atribuir ao campo indRemunCargo
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo(String indRemunCargo) {
            if (!"S".equals(indRemunCargo) && !"N".equals(indRemunCargo))
              throw new RuntimeException(
                  "Valor "
                      + String.valueOf(indRemunCargo)
                      + " inválido para o campo indRemunCargo");
            this.indRemunCargo = indRemunCargo;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo_S() {
            this.indRemunCargo = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio InfoMandElet para continuar populando outros campos
           */
          public InfoMandElet<T> setIndRemunCargo_N() {
            this.indRemunCargo = "N";
            return this;
          }

          public InfoMandElet(Object pai) {
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
       * Informações de retificação do afastamento
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "origRetif",
            "tpProc",
            "nrProc",
          })
      public static class InfoRetif<T> {

        /** Origem da retificação. */
        private String origRetif;

        /** Preencher com o código correspondente ao tipo de processo. */
        private String tpProc;

        /**
         * Informar o número do processo administrativo/judicial ou do benefício de acordo com o
         * tipo informado em {tpProc}(./tpProc).
         */
        private String nrProc;

        /**
         * Origem da retificação.
         *
         * @return Conteúdo do campo origRetif
         */
        public String getOrigRetif() {
          return this.origRetif;
        }

        /**
         * Origem da retificação.
         *
         * @param origRetif Valor para atribuir ao campo origRetif
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setOrigRetif(String origRetif) {
          if (!"1".equals(origRetif) && !"2".equals(origRetif) && !"3".equals(origRetif))
            throw new RuntimeException(
                "Valor " + String.valueOf(origRetif) + " inválido para o campo origRetif");
          this.origRetif = origRetif;
          return this;
        }
        /**
         * Por iniciativa do empregador
         *
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setOrigRetif_1() {
          this.origRetif = "1";
          return this;
        }
        /**
         * Revisão administrativa
         *
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setOrigRetif_2() {
          this.origRetif = "2";
          return this;
        }
        /**
         * Determinação judicial
         *
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setOrigRetif_3() {
          this.origRetif = "3";
          return this;
        }

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
         * <p>Validação: O preenchimento é obrigatório se {origRetif}(./origRetif) = [2, 3].
         *
         * @param tpProc Valor para atribuir ao campo tpProc
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setTpProc(String tpProc) {
          if (!"1".equals(tpProc) && !"2".equals(tpProc) && !"3".equals(tpProc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpProc) + " inválido para o campo tpProc");
          this.tpProc = tpProc;
          return this;
        }
        /**
         * Administrativo
         *
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setTpProc_1() {
          this.tpProc = "1";
          return this;
        }
        /**
         * Judicial
         *
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setTpProc_2() {
          this.tpProc = "2";
          return this;
        }
        /**
         * Número de Benefício - NB do INSS
         *
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setTpProc_3() {
          this.tpProc = "3";
          return this;
        }

        /**
         * Informar o número do processo administrativo/judicial ou do benefício de acordo com o
         * tipo informado em {tpProc}(./tpProc).
         *
         * @return Conteúdo do campo nrProc
         */
        public String getNrProc() {
          return this.nrProc;
        }

        /**
         * Informar o número do processo administrativo/judicial ou do benefício de acordo com o
         * tipo informado em {tpProc}(./tpProc).
         *
         * <p>Validação: O preenchimento é obrigatório se {origRetif}(./origRetif) = [2, 3]. Deve
         * ser um número de processo/benefício válido e:
         *
         * <p>a) Se {tpProc}(./tpProc) = [1], deve possuir 17 (dezessete) ou 21 (vinte e um)
         * algarismos;
         *
         * <p>b) Se {tpProc}(./tpProc) = [2], deve possuir 20 (vinte) algarismos;
         *
         * <p>c) Se {tpProc}(./tpProc) = [3], deve possuir 10 (dez) algarismos.
         *
         * @param nrProc Valor para atribuir ao campo nrProc
         * @return O próprio InfoRetif para continuar populando outros campos
         */
        public InfoRetif<T> setNrProc(String nrProc) {
          this.nrProc = nrProc;
          return this;
        }

        public InfoRetif(Object pai) {
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
       * Informação do término do afastamento.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtTermAfast",
          })
      public static class FimAfastamento<T> {

        /** Preencher com a data do término do afastamento do trabalhador. */
        private javax.xml.datatype.XMLGregorianCalendar dtTermAfast;

        /**
         * Preencher com a data do término do afastamento do trabalhador.
         *
         * @return Conteúdo do campo dtTermAfast
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTermAfast() {
          return this.dtTermAfast;
        }

        /**
         * Preencher com a data do término do afastamento do trabalhador.
         *
         * <p>Validação: Deve ser igual ou posterior à data de início do afastamento do trabalhador.
         *
         * @param dtTermAfast Valor para atribuir ao campo dtTermAfast
         * @return O próprio FimAfastamento para continuar populando outros campos
         */
        public FimAfastamento<T> setDtTermAfast(
            javax.xml.datatype.XMLGregorianCalendar dtTermAfast) {
          this.dtTermAfast = dtTermAfast;
          return this;
        }

        public FimAfastamento(Object pai) {
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
