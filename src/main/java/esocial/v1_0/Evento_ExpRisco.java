package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2240 - Condições Ambientais do Trabalho - Agentes Nocivos */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtExpRisco",
    })
@XmlRootElement(name = "eSocial")
public class Evento_ExpRisco {

  /** Evento Condições Ambientais do Trabalho - Agentes Nocivos. */
  private EvtExpRisco evtExpRisco;

  /**
   * Evento Condições Ambientais do Trabalho - Agentes Nocivos.
   *
   * @return Conteúdo do campo evtExpRisco
   */
  public EvtExpRisco getEvtExpRisco() {
    return this.evtExpRisco;
  }

  /**
   * Evento Condições Ambientais do Trabalho - Agentes Nocivos.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_EXT_SEM_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EXISTE_INFO_EMPREGADOR
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
   * @return O objeto EvtExpRisco para população dos campos filhos
   */
  public EvtExpRisco<Evento_ExpRisco> setEvtExpRisco() {
    if (this.evtExpRisco == null) {
      this.evtExpRisco = new EvtExpRisco(this);
    }
    return this.evtExpRisco;
  }

  /**
   * Evento Condições Ambientais do Trabalho - Agentes Nocivos.
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
        "infoExpRisco",
      })
  public static class EvtExpRisco<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações de identificação do trabalhador e do vínculo. */
    private Tipos.T_ideVinculo_sst ideVinculo;

    /** Ambiente de trabalho, atividades desempenhadas e exposição a agentes nocivos */
    private InfoExpRisco infoExpRisco;

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
    public Tipos.T_ideEvento_trab<EvtExpRisco<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtExpRisco<T>> setIdeEmpregador() {
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
    public Tipos.T_ideVinculo_sst getIdeVinculo() {
      return this.ideVinculo;
    }

    /**
     * Informações de identificação do trabalhador e do vínculo.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}, {matricula}, {codCateg}
     *
     * @return O objeto Tipos.T_ideVinculo_sst para população dos campos filhos
     */
    public Tipos.T_ideVinculo_sst<EvtExpRisco<T>> setIdeVinculo() {
      if (this.ideVinculo == null) {
        this.ideVinculo = new Tipos.T_ideVinculo_sst(this);
      }
      return this.ideVinculo;
    }

    /**
     * Ambiente de trabalho, atividades desempenhadas e exposição a agentes nocivos
     *
     * @return Conteúdo do campo infoExpRisco
     */
    public InfoExpRisco getInfoExpRisco() {
      return this.infoExpRisco;
    }

    /**
     * Ambiente de trabalho, atividades desempenhadas e exposição a agentes nocivos
     *
     * <p>DESCRICAO_COMPLETA:Informações sobre o ambiente de trabalho, atividades desempenhadas e
     * exposição a agentes nocivos.
     *
     * <p>CHAVE_GRUPO: {dtIniCondicao}
     *
     * @return O objeto InfoExpRisco para população dos campos filhos
     */
    public InfoExpRisco<EvtExpRisco<T>> setInfoExpRisco() {
      if (this.infoExpRisco == null) {
        this.infoExpRisco = new InfoExpRisco(this);
      }
      return this.infoExpRisco;
    }

    public EvtExpRisco(Object pai) {
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
     * Ambiente de trabalho, atividades desempenhadas e exposição a agentes nocivos
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "dtIniCondicao",
          "infoAmb",
          "infoAtiv",
          "agNoc",
          "respReg",
          "obs",
        })
    public static class InfoExpRisco<T> {

      /**
       * Informar a data em que o trabalhador iniciou as atividades nas condições descritas ou a
       * data de início da obrigatoriedade deste evento para o empregador no eSocial, a que for mais
       * recente.
       */
      private javax.xml.datatype.XMLGregorianCalendar dtIniCondicao;

      /** Informações relativas ao ambiente de trabalho. */
      private InfoAmb infoAmb;

      /** Descrição das atividades desempenhadas. */
      private InfoAtiv infoAtiv;

      /**
       * Agente(s) nocivo(s) ao(s) qual(is) o trabalhador está exposto.
       *
       * <p>- Esse campo pode ser repetido até 999 vezes
       */
      private java.util.List<AgNoc> agNoc;

      /**
       * Responsável pelos registros ambientais
       *
       * <p>- Esse campo pode ser repetido até 9 vezes
       */
      private java.util.List<RespReg> respReg;

      /** Observações relativas a registros ambientais. */
      private Obs obs;

      /**
       * Informar a data em que o trabalhador iniciou as atividades nas condições descritas ou a
       * data de início da obrigatoriedade deste evento para o empregador no eSocial, a que for mais
       * recente.
       *
       * @return Conteúdo do campo dtIniCondicao
       */
      public javax.xml.datatype.XMLGregorianCalendar getDtIniCondicao() {
        return this.dtIniCondicao;
      }

      /**
       * Informar a data em que o trabalhador iniciou as atividades nas condições descritas ou a
       * data de início da obrigatoriedade deste evento para o empregador no eSocial, a que for mais
       * recente.
       *
       * <p>Validação: Deve ser uma data válida, igual ou posterior à data de admissão do vínculo a
       * que se refere. Não pode ser anterior à data de início da obrigatoriedade deste evento para
       * o empregador no eSocial, nem pode ser posterior a 30 (trinta) dias da data atual.
       *
       * @param dtIniCondicao Valor para atribuir ao campo dtIniCondicao
       * @return O próprio InfoExpRisco para continuar populando outros campos
       */
      public InfoExpRisco<T> setDtIniCondicao(
          javax.xml.datatype.XMLGregorianCalendar dtIniCondicao) {
        this.dtIniCondicao = dtIniCondicao;
        return this;
      }

      /**
       * Informações relativas ao ambiente de trabalho.
       *
       * @return Conteúdo do campo infoAmb
       */
      public InfoAmb getInfoAmb() {
        return this.infoAmb;
      }

      /**
       * Informações relativas ao ambiente de trabalho.
       *
       * @return O objeto InfoAmb para população dos campos filhos
       */
      public InfoAmb<InfoExpRisco<T>> setInfoAmb() {
        if (this.infoAmb == null) {
          this.infoAmb = new InfoAmb(this);
        }
        return this.infoAmb;
      }

      /**
       * Descrição das atividades desempenhadas.
       *
       * @return Conteúdo do campo infoAtiv
       */
      public InfoAtiv getInfoAtiv() {
        return this.infoAtiv;
      }

      /**
       * Descrição das atividades desempenhadas.
       *
       * @return O objeto InfoAtiv para população dos campos filhos
       */
      public InfoAtiv<InfoExpRisco<T>> setInfoAtiv() {
        if (this.infoAtiv == null) {
          this.infoAtiv = new InfoAtiv(this);
        }
        return this.infoAtiv;
      }

      /**
       * Agente(s) nocivo(s) ao(s) qual(is) o trabalhador está exposto.
       *
       * @return Conteúdo do campo agNoc
       */
      public java.util.List<AgNoc> getAgNoc() {
        return this.agNoc;
      }

      /**
       * Agente(s) nocivo(s) ao(s) qual(is) o trabalhador está exposto.
       *
       * <p>- Esse campo pode ser repetido até 999 vezes
       *
       * <p>CHAVE_GRUPO: {codAgNoc}, {dscAgNoc}
       *
       * @return O objeto AgNoc para população dos campos filhos
       */
      public AgNoc<InfoExpRisco<T>> setAgNoc_Next() {
        if (this.agNoc == null) {
          this.agNoc = new java.util.ArrayList<>();
        }
        AgNoc toAdd = new AgNoc(this);
        this.agNoc.add(toAdd);
        return toAdd;
      }

      /**
       * Responsável pelos registros ambientais
       *
       * @return Conteúdo do campo respReg
       */
      public java.util.List<RespReg> getRespReg() {
        return this.respReg;
      }

      /**
       * Responsável pelos registros ambientais
       *
       * <p>- Esse campo pode ser repetido até 9 vezes
       *
       * <p>DESCRICAO_COMPLETA:Informações relativas ao responsável pelos registros ambientais.
       *
       * @return O objeto RespReg para população dos campos filhos
       */
      public RespReg<InfoExpRisco<T>> setRespReg_Next() {
        if (this.respReg == null) {
          this.respReg = new java.util.ArrayList<>();
        }
        RespReg toAdd = new RespReg(this);
        this.respReg.add(toAdd);
        return toAdd;
      }

      /**
       * Observações relativas a registros ambientais.
       *
       * @return Conteúdo do campo obs
       */
      public Obs getObs() {
        return this.obs;
      }

      /**
       * Observações relativas a registros ambientais.
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Obs para população dos campos filhos
       */
      public Obs<InfoExpRisco<T>> setObs() {
        if (this.obs == null) {
          this.obs = new Obs(this);
        }
        return this.obs;
      }

      public InfoExpRisco(Object pai) {
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
       * Informações relativas ao ambiente de trabalho.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "localAmb",
            "dscSetor",
            "tpInsc",
            "nrInsc",
          })
      public static class InfoAmb<T> {

        /** Informar o tipo de estabelecimento do ambiente de trabalho. */
        private String localAmb;

        /**
         * Descrição do lugar administrativo, na estrutura organizacional da empresa, onde o
         * trabalhador exerce suas atividades laborais.
         */
        private String dscSetor;

        /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
        private String tpInsc;

        /** Número de inscrição onde está localizado o ambiente. */
        private String nrInsc;

        /**
         * Informar o tipo de estabelecimento do ambiente de trabalho.
         *
         * @return Conteúdo do campo localAmb
         */
        public String getLocalAmb() {
          return this.localAmb;
        }

        /**
         * Informar o tipo de estabelecimento do ambiente de trabalho.
         *
         * @param localAmb Valor para atribuir ao campo localAmb
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setLocalAmb(String localAmb) {
          if (!"1".equals(localAmb) && !"2".equals(localAmb))
            throw new RuntimeException(
                "Valor " + String.valueOf(localAmb) + " inválido para o campo localAmb");
          this.localAmb = localAmb;
          return this;
        }
        /**
         * Estabelecimento do próprio empregador
         *
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setLocalAmb_1() {
          this.localAmb = "1";
          return this;
        }
        /**
         * Estabelecimento de terceiros
         *
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setLocalAmb_2() {
          this.localAmb = "2";
          return this;
        }

        /**
         * Descrição do lugar administrativo, na estrutura organizacional da empresa, onde o
         * trabalhador exerce suas atividades laborais.
         *
         * @return Conteúdo do campo dscSetor
         */
        public String getDscSetor() {
          return this.dscSetor;
        }

        /**
         * Descrição do lugar administrativo, na estrutura organizacional da empresa, onde o
         * trabalhador exerce suas atividades laborais.
         *
         * @param dscSetor Valor para atribuir ao campo dscSetor
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setDscSetor(String dscSetor) {
          this.dscSetor = dscSetor;
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
         * @param tpInsc Valor para atribuir ao campo tpInsc
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setTpInsc(String tpInsc) {
          if (!"1".equals(tpInsc) && !"3".equals(tpInsc) && !"4".equals(tpInsc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
          this.tpInsc = tpInsc;
          return this;
        }
        /**
         * CNPJ
         *
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setTpInsc_1() {
          this.tpInsc = "1";
          return this;
        }
        /**
         * CAEPF
         *
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setTpInsc_3() {
          this.tpInsc = "3";
          return this;
        }
        /**
         * CNO
         *
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setTpInsc_4() {
          this.tpInsc = "4";
          return this;
        }

        /**
         * Número de inscrição onde está localizado o ambiente.
         *
         * @return Conteúdo do campo nrInsc
         */
        public String getNrInsc() {
          return this.nrInsc;
        }

        /**
         * Número de inscrição onde está localizado o ambiente.
         *
         * <p>Validação: Deve ser um identificador válido, compatível com o conteúdo do campo
         * {infoAmb/tpInsc}(./tpInsc) e:
         *
         * <p>a) Se {localAmb}(./localAmb) = [1], deve ser válido e existente na Tabela de
         * Estabelecimentos (S-1005);
         *
         * <p>b) Se {localAmb}(./localAmb) = [2], deve ser diferente dos estabelecimentos informados
         * na Tabela S-1005 e, se {infoAmb/tpInsc}(./tpInsc) = [1] e o empregador for pessoa
         * jurídica, a raiz do CNPJ informado deve ser diferente da constante em S-1000.
         *
         * @param nrInsc Valor para atribuir ao campo nrInsc
         * @return O próprio InfoAmb para continuar populando outros campos
         */
        public InfoAmb<T> setNrInsc(String nrInsc) {
          this.nrInsc = nrInsc;
          return this;
        }

        public InfoAmb(Object pai) {
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
       * Descrição das atividades desempenhadas.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dscAtivDes",
          })
      public static class InfoAtiv<T> {

        /**
         * Descrição das atividades, físicas ou mentais, realizadas pelo trabalhador, por força do
         * poder de comando a que se submete. As atividades deverão ser escritas com exatidão, e de
         * forma sucinta, com a utilização de verbos no infinitivo impessoal. Ex.: Distribuir
         * panfletos, operar máquina de envase, etc.
         */
        private String dscAtivDes;

        /**
         * Descrição das atividades, físicas ou mentais, realizadas pelo trabalhador, por força do
         * poder de comando a que se submete. As atividades deverão ser escritas com exatidão, e de
         * forma sucinta, com a utilização de verbos no infinitivo impessoal. Ex.: Distribuir
         * panfletos, operar máquina de envase, etc.
         *
         * @return Conteúdo do campo dscAtivDes
         */
        public String getDscAtivDes() {
          return this.dscAtivDes;
        }

        /**
         * Descrição das atividades, físicas ou mentais, realizadas pelo trabalhador, por força do
         * poder de comando a que se submete. As atividades deverão ser escritas com exatidão, e de
         * forma sucinta, com a utilização de verbos no infinitivo impessoal. Ex.: Distribuir
         * panfletos, operar máquina de envase, etc.
         *
         * @param dscAtivDes Valor para atribuir ao campo dscAtivDes
         * @return O próprio InfoAtiv para continuar populando outros campos
         */
        public InfoAtiv<T> setDscAtivDes(String dscAtivDes) {
          this.dscAtivDes = dscAtivDes;
          return this;
        }

        public InfoAtiv(Object pai) {
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
       * Agente(s) nocivo(s) ao(s) qual(is) o trabalhador está exposto.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "codAgNoc",
            "dscAgNoc",
            "tpAval",
            "intConc",
            "limTol",
            "unMed",
            "tecMedicao",
            "epcEpi",
          })
      public static class AgNoc<T> {

        /**
         * Informar o código do agente nocivo ao qual o trabalhador está exposto. Preencher com
         * números e pontos. Caso não haja exposição, informar o código [09.01.001] (Ausência de
         * agente nocivo ou de atividades previstas no Anexo IV do Decreto 3.048/1999).
         */
        private String codAgNoc;

        /** Descrição do agente nocivo. */
        private String dscAgNoc;

        /** Tipo de avaliação do agente nocivo. */
        private String tpAval;

        /**
         * Intensidade, concentração ou dose da exposição do trabalhador ao agente nocivo cujo
         * critério de avaliação seja quantitativo.
         */
        private Double intConc;

        /**
         * Limite de tolerância calculado para agentes específicos, conforme técnica de medição
         * exigida na legislação.
         */
        private Double limTol;

        /** Dose ou unidade de medida da intensidade ou concentração do agente. */
        private String unMed;

        /** Técnica utilizada para medição da intensidade ou concentração. */
        private String tecMedicao;

        /** EPC e EPI */
        private EpcEpi epcEpi;

        /**
         * Informar o código do agente nocivo ao qual o trabalhador está exposto. Preencher com
         * números e pontos. Caso não haja exposição, informar o código [09.01.001] (Ausência de
         * agente nocivo ou de atividades previstas no Anexo IV do Decreto 3.048/1999).
         *
         * @return Conteúdo do campo codAgNoc
         */
        public String getCodAgNoc() {
          return this.codAgNoc;
        }

        /**
         * Informar o código do agente nocivo ao qual o trabalhador está exposto. Preencher com
         * números e pontos. Caso não haja exposição, informar o código [09.01.001] (Ausência de
         * agente nocivo ou de atividades previstas no Anexo IV do Decreto 3.048/1999).
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 24. Não é possível informar
         * nenhum outro código de agente nocivo quando houver o código [09.01.001].
         *
         * @param codAgNoc Valor para atribuir ao campo codAgNoc
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setCodAgNoc(String codAgNoc) {
          this.codAgNoc = codAgNoc;
          return this;
        }

        /**
         * Descrição do agente nocivo.
         *
         * @return Conteúdo do campo dscAgNoc
         */
        public String getDscAgNoc() {
          return this.dscAgNoc;
        }

        /**
         * Descrição do agente nocivo.
         *
         * <p>Validação: Preenchimento obrigatório se {codAgNoc}(./codAgNoc) = [01.01.001,
         * 01.02.001, 01.03.001, 01.04.001, 01.05.001, 01.06.001, 01.07.001, 01.08.001, 01.09.001,
         * 01.10.001, 01.12.001, 01.13.001, 01.14.001, 01.15.001, 01.16.001, 01.17.001, 01.18.001,
         * 05.01.001].
         *
         * @param dscAgNoc Valor para atribuir ao campo dscAgNoc
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setDscAgNoc(String dscAgNoc) {
          this.dscAgNoc = dscAgNoc;
          return this;
        }

        /**
         * Tipo de avaliação do agente nocivo.
         *
         * @return Conteúdo do campo tpAval
         */
        public String getTpAval() {
          return this.tpAval;
        }

        /**
         * Tipo de avaliação do agente nocivo.
         *
         * @param tpAval Valor para atribuir ao campo tpAval
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setTpAval(String tpAval) {
          if (!"1".equals(tpAval) && !"2".equals(tpAval))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpAval) + " inválido para o campo tpAval");
          this.tpAval = tpAval;
          return this;
        }
        /**
         * Critério quantitativo
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setTpAval_1() {
          this.tpAval = "1";
          return this;
        }
        /**
         * Critério qualitativo
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setTpAval_2() {
          this.tpAval = "2";
          return this;
        }

        /**
         * Intensidade, concentração ou dose da exposição do trabalhador ao agente nocivo cujo
         * critério de avaliação seja quantitativo.
         *
         * @return Conteúdo do campo intConc
         */
        public Double getIntConc() {
          return this.intConc;
        }

        /**
         * Intensidade, concentração ou dose da exposição do trabalhador ao agente nocivo cujo
         * critério de avaliação seja quantitativo.
         *
         * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAval}(./tpAval) = [1].
         *
         * @param intConc Valor para atribuir ao campo intConc
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setIntConc(Double intConc) {
          this.intConc = intConc;
          return this;
        }

        /**
         * Limite de tolerância calculado para agentes específicos, conforme técnica de medição
         * exigida na legislação.
         *
         * @return Conteúdo do campo limTol
         */
        public Double getLimTol() {
          return this.limTol;
        }

        /**
         * Limite de tolerância calculado para agentes específicos, conforme técnica de medição
         * exigida na legislação.
         *
         * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAval}(./tpAval) = [1] e
         * {codAgNoc}(./codAgNoc) = [01.18.001, 02.01.014].
         *
         * @param limTol Valor para atribuir ao campo limTol
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setLimTol(Double limTol) {
          this.limTol = limTol;
          return this;
        }

        /**
         * Dose ou unidade de medida da intensidade ou concentração do agente.
         *
         * @return Conteúdo do campo unMed
         */
        public String getUnMed() {
          return this.unMed;
        }

        /**
         * Dose ou unidade de medida da intensidade ou concentração do agente.
         *
         * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAval}(./tpAval) = [1].
         *
         * @param unMed Valor para atribuir ao campo unMed
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed(String unMed) {
          if (!"1".equals(unMed)
              && !"2".equals(unMed)
              && !"3".equals(unMed)
              && !"4".equals(unMed)
              && !"5".equals(unMed)
              && !"6".equals(unMed)
              && !"7".equals(unMed)
              && !"8".equals(unMed)
              && !"9".equals(unMed)
              && !"10".equals(unMed)
              && !"11".equals(unMed)
              && !"12".equals(unMed)
              && !"13".equals(unMed)
              && !"14".equals(unMed)
              && !"15".equals(unMed)
              && !"16".equals(unMed)
              && !"17".equals(unMed)
              && !"18".equals(unMed)
              && !"19".equals(unMed)
              && !"20".equals(unMed)
              && !"21".equals(unMed)
              && !"22".equals(unMed)
              && !"23".equals(unMed)
              && !"24".equals(unMed)
              && !"25".equals(unMed)
              && !"26".equals(unMed)
              && !"27".equals(unMed)
              && !"28".equals(unMed)
              && !"29".equals(unMed)
              && !"30".equals(unMed))
            throw new RuntimeException(
                "Valor " + String.valueOf(unMed) + " inválido para o campo unMed");
          this.unMed = unMed;
          return this;
        }
        /**
         * dose diária de ruído
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_1() {
          this.unMed = "1";
          return this;
        }
        /**
         * decibel linear (dB (linear))
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_2() {
          this.unMed = "2";
          return this;
        }
        /**
         * decibel (C) (dB(C))
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_3() {
          this.unMed = "3";
          return this;
        }
        /**
         * decibel (A) (dB(A))
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_4() {
          this.unMed = "4";
          return this;
        }
        /**
         * metro por segundo ao quadrado (m/s^^2^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_5() {
          this.unMed = "5";
          return this;
        }
        /**
         * metro por segundo elevado a 1,75 (m/s^^1,75^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_6() {
          this.unMed = "6";
          return this;
        }
        /**
         * parte de vapor ou gás por milhão de partes de ar contaminado (ppm)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_7() {
          this.unMed = "7";
          return this;
        }
        /**
         * miligrama por metro cúbico de ar (mg/m^^3^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_8() {
          this.unMed = "8";
          return this;
        }
        /**
         * fibra por centímetro cúbico (f/cm^^3^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_9() {
          this.unMed = "9";
          return this;
        }
        /**
         * grau Celsius (ºC)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_10() {
          this.unMed = "10";
          return this;
        }
        /**
         * metro por segundo (m/s)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_11() {
          this.unMed = "11";
          return this;
        }
        /**
         * porcentual
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_12() {
          this.unMed = "12";
          return this;
        }
        /**
         * lux (lx)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_13() {
          this.unMed = "13";
          return this;
        }
        /**
         * unidade formadora de colônias por metro cúbico (ufc/m^^3^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_14() {
          this.unMed = "14";
          return this;
        }
        /**
         * dose diária
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_15() {
          this.unMed = "15";
          return this;
        }
        /**
         * dose mensal
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_16() {
          this.unMed = "16";
          return this;
        }
        /**
         * dose trimestral
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_17() {
          this.unMed = "17";
          return this;
        }
        /**
         * dose anual
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_18() {
          this.unMed = "18";
          return this;
        }
        /**
         * watt por metro quadrado (W/m^^2^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_19() {
          this.unMed = "19";
          return this;
        }
        /**
         * ampère por metro (A/m)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_20() {
          this.unMed = "20";
          return this;
        }
        /**
         * militesla (mT)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_21() {
          this.unMed = "21";
          return this;
        }
        /**
         * microtesla (μT)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_22() {
          this.unMed = "22";
          return this;
        }
        /**
         * miliampère (mA)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_23() {
          this.unMed = "23";
          return this;
        }
        /**
         * quilovolt por metro (kV/m)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_24() {
          this.unMed = "24";
          return this;
        }
        /**
         * volt por metro (V/m)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_25() {
          this.unMed = "25";
          return this;
        }
        /**
         * joule por metro quadrado (J/m^^2^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_26() {
          this.unMed = "26";
          return this;
        }
        /**
         * milijoule por centímetro quadrado (mJ/cm^^2^^)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_27() {
          this.unMed = "27";
          return this;
        }
        /**
         * milisievert (mSv)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_28() {
          this.unMed = "28";
          return this;
        }
        /**
         * milhão de partículas por decímetro cúbico (mppdc)
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_29() {
          this.unMed = "29";
          return this;
        }
        /**
         * umidade relativa do ar (UR (%))
         *
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setUnMed_30() {
          this.unMed = "30";
          return this;
        }

        /**
         * Técnica utilizada para medição da intensidade ou concentração.
         *
         * @return Conteúdo do campo tecMedicao
         */
        public String getTecMedicao() {
          return this.tecMedicao;
        }

        /**
         * Técnica utilizada para medição da intensidade ou concentração.
         *
         * <p>Validação: Preenchimento obrigatório e exclusivo se {tpAval}(./tpAval) = [1].
         *
         * @param tecMedicao Valor para atribuir ao campo tecMedicao
         * @return O próprio AgNoc para continuar populando outros campos
         */
        public AgNoc<T> setTecMedicao(String tecMedicao) {
          this.tecMedicao = tecMedicao;
          return this;
        }

        /**
         * EPC e EPI
         *
         * @return Conteúdo do campo epcEpi
         */
        public EpcEpi getEpcEpi() {
          return this.epcEpi;
        }

        /**
         * EPC e EPI
         *
         * <p>DESCRICAO_COMPLETA:Informações relativas a Equipamentos de Proteção Coletiva - EPC e
         * Equipamentos de Proteção Individual - EPI.
         *
         * @return O objeto EpcEpi para população dos campos filhos
         */
        public EpcEpi<AgNoc<T>> setEpcEpi() {
          if (this.epcEpi == null) {
            this.epcEpi = new EpcEpi(this);
          }
          return this.epcEpi;
        }

        public AgNoc(Object pai) {
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
         * EPC e EPI
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "utilizEPC",
              "eficEpc",
              "utilizEPI",
              "epi",
              "epiCompl",
            })
        public static class EpcEpi<T> {

          /**
           * O empregador implementa medidas de proteção coletiva (EPC) para eliminar ou reduzir a
           * exposição dos trabalhadores ao agente nocivo?
           */
          private String utilizEPC;

          /** Os EPCs são eficazes na neutralização dos riscos ao trabalhador? */
          private String eficEpc;

          /** Utilização de EPI. */
          private String utilizEPI;

          /**
           * EPI.
           *
           * <p>- Esse campo pode ser repetido até 50 vezes
           */
          private java.util.List<Epi> epi;

          /**
           * Requisitos das NR-06 e NR-09 pelo(s) EPI(s) informado(s)
           *
           * <p>- Esse campo pode ser repetido até 1 vezes
           */
          private java.util.List<EpiCompl> epiCompl;

          /**
           * O empregador implementa medidas de proteção coletiva (EPC) para eliminar ou reduzir a
           * exposição dos trabalhadores ao agente nocivo?
           *
           * @return Conteúdo do campo utilizEPC
           */
          public String getUtilizEPC() {
            return this.utilizEPC;
          }

          /**
           * O empregador implementa medidas de proteção coletiva (EPC) para eliminar ou reduzir a
           * exposição dos trabalhadores ao agente nocivo?
           *
           * @param utilizEPC Valor para atribuir ao campo utilizEPC
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPC(String utilizEPC) {
            if (!"0".equals(utilizEPC) && !"1".equals(utilizEPC) && !"2".equals(utilizEPC))
              throw new RuntimeException(
                  "Valor " + String.valueOf(utilizEPC) + " inválido para o campo utilizEPC");
            this.utilizEPC = utilizEPC;
            return this;
          }
          /**
           * Não se aplica
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPC_0() {
            this.utilizEPC = "0";
            return this;
          }
          /**
           * Não implementa
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPC_1() {
            this.utilizEPC = "1";
            return this;
          }
          /**
           * Implementa
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPC_2() {
            this.utilizEPC = "2";
            return this;
          }

          /**
           * Os EPCs são eficazes na neutralização dos riscos ao trabalhador?
           *
           * @return Conteúdo do campo eficEpc
           */
          public String getEficEpc() {
            return this.eficEpc;
          }

          /**
           * Os EPCs são eficazes na neutralização dos riscos ao trabalhador?
           *
           * <p>Validação: Preenchimento obrigatório e exclusivo se {utilizEPC}(./utilizEPC) = [2].
           *
           * @param eficEpc Valor para atribuir ao campo eficEpc
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setEficEpc(String eficEpc) {
            if (!"S".equals(eficEpc) && !"N".equals(eficEpc))
              throw new RuntimeException(
                  "Valor " + String.valueOf(eficEpc) + " inválido para o campo eficEpc");
            this.eficEpc = eficEpc;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setEficEpc_S() {
            this.eficEpc = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setEficEpc_N() {
            this.eficEpc = "N";
            return this;
          }

          /**
           * Utilização de EPI.
           *
           * @return Conteúdo do campo utilizEPI
           */
          public String getUtilizEPI() {
            return this.utilizEPI;
          }

          /**
           * Utilização de EPI.
           *
           * @param utilizEPI Valor para atribuir ao campo utilizEPI
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPI(String utilizEPI) {
            if (!"0".equals(utilizEPI) && !"1".equals(utilizEPI) && !"2".equals(utilizEPI))
              throw new RuntimeException(
                  "Valor " + String.valueOf(utilizEPI) + " inválido para o campo utilizEPI");
            this.utilizEPI = utilizEPI;
            return this;
          }
          /**
           * Não se aplica
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPI_0() {
            this.utilizEPI = "0";
            return this;
          }
          /**
           * Não utilizado
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPI_1() {
            this.utilizEPI = "1";
            return this;
          }
          /**
           * Utilizado
           *
           * @return O próprio EpcEpi para continuar populando outros campos
           */
          public EpcEpi<T> setUtilizEPI_2() {
            this.utilizEPI = "2";
            return this;
          }

          /**
           * EPI.
           *
           * @return Conteúdo do campo epi
           */
          public java.util.List<Epi> getEpi() {
            return this.epi;
          }

          /**
           * EPI.
           *
           * <p>- Esse campo pode ser repetido até 50 vezes
           *
           * <p>CONDICAO_GRUPO: O (se {utilizEPI}(../utilizEPI) = [2]); N (nos demais casos)
           *
           * <p>CHAVE_GRUPO: {docAval}, {dscEPI}
           *
           * @return O objeto Epi para população dos campos filhos
           */
          public Epi<EpcEpi<T>> setEpi_Next() {
            if (this.epi == null) {
              this.epi = new java.util.ArrayList<>();
            }
            Epi toAdd = new Epi(this);
            this.epi.add(toAdd);
            return toAdd;
          }

          /**
           * Requisitos das NR-06 e NR-09 pelo(s) EPI(s) informado(s)
           *
           * @return Conteúdo do campo epiCompl
           */
          public java.util.List<EpiCompl> getEpiCompl() {
            return this.epiCompl;
          }

          /**
           * Requisitos das NR-06 e NR-09 pelo(s) EPI(s) informado(s)
           *
           * <p>- Esse campo pode ser repetido até 1 vezes
           *
           * <p>DESCRICAO_COMPLETA:Requisitos da Norma Regulamentadora 06 - NR-06 e da Norma
           * Regulamentadora 09 - NR-09 pelo(s) EPI(s) informado(s).
           *
           * <p>CONDICAO_GRUPO: O (se {utilizEPI}(../utilizEPI) = [2]); N (nos demais casos)
           *
           * @return O objeto EpiCompl para população dos campos filhos
           */
          public EpiCompl<EpcEpi<T>> setEpiCompl_Next() {
            if (this.epiCompl == null) {
              this.epiCompl = new java.util.ArrayList<>();
            }
            EpiCompl toAdd = new EpiCompl(this);
            this.epiCompl.add(toAdd);
            return toAdd;
          }

          public EpcEpi(Object pai) {
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
           * EPI.
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "docAval", "dscEPI", "eficEpi",
              })
          public static class Epi<T> {

            /** Certificado de Aprovação - CA ou documento de avaliação do EPI. */
            private String docAval;

            /** Descrição do EPI. */
            private String dscEPI;

            /** O EPI é eficaz na neutralização do risco ao trabalhador? */
            private String eficEpi;

            /**
             * Certificado de Aprovação - CA ou documento de avaliação do EPI.
             *
             * @return Conteúdo do campo docAval
             */
            public String getDocAval() {
              return this.docAval;
            }

            /**
             * Certificado de Aprovação - CA ou documento de avaliação do EPI.
             *
             * @param docAval Valor para atribuir ao campo docAval
             * @return O próprio Epi para continuar populando outros campos
             */
            public Epi<T> setDocAval(String docAval) {
              this.docAval = docAval;
              return this;
            }

            /**
             * Descrição do EPI.
             *
             * @return Conteúdo do campo dscEPI
             */
            public String getDscEPI() {
              return this.dscEPI;
            }

            /**
             * Descrição do EPI.
             *
             * <p>Validação: Preenchimento obrigatório e exclusivo se {docAval}(./docAval) não for
             * informado.
             *
             * @param dscEPI Valor para atribuir ao campo dscEPI
             * @return O próprio Epi para continuar populando outros campos
             */
            public Epi<T> setDscEPI(String dscEPI) {
              this.dscEPI = dscEPI;
              return this;
            }

            /**
             * O EPI é eficaz na neutralização do risco ao trabalhador?
             *
             * @return Conteúdo do campo eficEpi
             */
            public String getEficEpi() {
              return this.eficEpi;
            }

            /**
             * O EPI é eficaz na neutralização do risco ao trabalhador?
             *
             * @param eficEpi Valor para atribuir ao campo eficEpi
             * @return O próprio Epi para continuar populando outros campos
             */
            public Epi<T> setEficEpi(String eficEpi) {
              if (!"S".equals(eficEpi) && !"N".equals(eficEpi))
                throw new RuntimeException(
                    "Valor " + String.valueOf(eficEpi) + " inválido para o campo eficEpi");
              this.eficEpi = eficEpi;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio Epi para continuar populando outros campos
             */
            public Epi<T> setEficEpi_S() {
              this.eficEpi = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio Epi para continuar populando outros campos
             */
            public Epi<T> setEficEpi_N() {
              this.eficEpi = "N";
              return this;
            }

            public Epi(Object pai) {
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
           * Requisitos das NR-06 e NR-09 pelo(s) EPI(s) informado(s)
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "medProtecao",
                "condFuncto",
                "usoInint",
                "przValid",
                "periodicTroca",
                "higienizacao",
              })
          public static class EpiCompl<T> {

            /**
             * Foi tentada a implementação de medidas de proteção coletiva, de caráter
             * administrativo ou de organização, optando-se pelo EPI por inviabilidade técnica,
             * insuficiência ou interinidade, ou ainda em caráter complementar ou emergencial?
             */
            private String medProtecao;

            /**
             * Foram observadas as condições de funcionamento do EPI ao longo do tempo, conforme
             * especificação técnica do fabricante nacional ou importador, ajustadas às condições de
             * campo?
             */
            private String condFuncto;

            /**
             * Foi observado o uso ininterrupto do EPI ao longo do tempo, conforme especificação
             * técnica do fabricante nacional ou importador, ajustadas às condições de campo?
             */
            private String usoInint;

            /** Foi observado o prazo de validade do CA no momento da compra do EPI? */
            private String przValid;

            /**
             * É observada a periodicidade de troca definida pelo fabricante nacional ou importador
             * e/ou programas ambientais, comprovada mediante recibo assinado pelo usuário em época
             * própria?
             */
            private String periodicTroca;

            /**
             * É observada a higienização conforme orientação do fabricante nacional ou importador?
             */
            private String higienizacao;

            /**
             * Foi tentada a implementação de medidas de proteção coletiva, de caráter
             * administrativo ou de organização, optando-se pelo EPI por inviabilidade técnica,
             * insuficiência ou interinidade, ou ainda em caráter complementar ou emergencial?
             *
             * @return Conteúdo do campo medProtecao
             */
            public String getMedProtecao() {
              return this.medProtecao;
            }

            /**
             * Foi tentada a implementação de medidas de proteção coletiva, de caráter
             * administrativo ou de organização, optando-se pelo EPI por inviabilidade técnica,
             * insuficiência ou interinidade, ou ainda em caráter complementar ou emergencial?
             *
             * @param medProtecao Valor para atribuir ao campo medProtecao
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setMedProtecao(String medProtecao) {
              if (!"S".equals(medProtecao) && !"N".equals(medProtecao))
                throw new RuntimeException(
                    "Valor " + String.valueOf(medProtecao) + " inválido para o campo medProtecao");
              this.medProtecao = medProtecao;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setMedProtecao_S() {
              this.medProtecao = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setMedProtecao_N() {
              this.medProtecao = "N";
              return this;
            }

            /**
             * Foram observadas as condições de funcionamento do EPI ao longo do tempo, conforme
             * especificação técnica do fabricante nacional ou importador, ajustadas às condições de
             * campo?
             *
             * @return Conteúdo do campo condFuncto
             */
            public String getCondFuncto() {
              return this.condFuncto;
            }

            /**
             * Foram observadas as condições de funcionamento do EPI ao longo do tempo, conforme
             * especificação técnica do fabricante nacional ou importador, ajustadas às condições de
             * campo?
             *
             * @param condFuncto Valor para atribuir ao campo condFuncto
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setCondFuncto(String condFuncto) {
              if (!"S".equals(condFuncto) && !"N".equals(condFuncto))
                throw new RuntimeException(
                    "Valor " + String.valueOf(condFuncto) + " inválido para o campo condFuncto");
              this.condFuncto = condFuncto;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setCondFuncto_S() {
              this.condFuncto = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setCondFuncto_N() {
              this.condFuncto = "N";
              return this;
            }

            /**
             * Foi observado o uso ininterrupto do EPI ao longo do tempo, conforme especificação
             * técnica do fabricante nacional ou importador, ajustadas às condições de campo?
             *
             * @return Conteúdo do campo usoInint
             */
            public String getUsoInint() {
              return this.usoInint;
            }

            /**
             * Foi observado o uso ininterrupto do EPI ao longo do tempo, conforme especificação
             * técnica do fabricante nacional ou importador, ajustadas às condições de campo?
             *
             * @param usoInint Valor para atribuir ao campo usoInint
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setUsoInint(String usoInint) {
              if (!"S".equals(usoInint) && !"N".equals(usoInint))
                throw new RuntimeException(
                    "Valor " + String.valueOf(usoInint) + " inválido para o campo usoInint");
              this.usoInint = usoInint;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setUsoInint_S() {
              this.usoInint = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setUsoInint_N() {
              this.usoInint = "N";
              return this;
            }

            /**
             * Foi observado o prazo de validade do CA no momento da compra do EPI?
             *
             * @return Conteúdo do campo przValid
             */
            public String getPrzValid() {
              return this.przValid;
            }

            /**
             * Foi observado o prazo de validade do CA no momento da compra do EPI?
             *
             * @param przValid Valor para atribuir ao campo przValid
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setPrzValid(String przValid) {
              if (!"S".equals(przValid) && !"N".equals(przValid))
                throw new RuntimeException(
                    "Valor " + String.valueOf(przValid) + " inválido para o campo przValid");
              this.przValid = przValid;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setPrzValid_S() {
              this.przValid = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setPrzValid_N() {
              this.przValid = "N";
              return this;
            }

            /**
             * É observada a periodicidade de troca definida pelo fabricante nacional ou importador
             * e/ou programas ambientais, comprovada mediante recibo assinado pelo usuário em época
             * própria?
             *
             * @return Conteúdo do campo periodicTroca
             */
            public String getPeriodicTroca() {
              return this.periodicTroca;
            }

            /**
             * É observada a periodicidade de troca definida pelo fabricante nacional ou importador
             * e/ou programas ambientais, comprovada mediante recibo assinado pelo usuário em época
             * própria?
             *
             * @param periodicTroca Valor para atribuir ao campo periodicTroca
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setPeriodicTroca(String periodicTroca) {
              if (!"S".equals(periodicTroca) && !"N".equals(periodicTroca))
                throw new RuntimeException(
                    "Valor "
                        + String.valueOf(periodicTroca)
                        + " inválido para o campo periodicTroca");
              this.periodicTroca = periodicTroca;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setPeriodicTroca_S() {
              this.periodicTroca = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setPeriodicTroca_N() {
              this.periodicTroca = "N";
              return this;
            }

            /**
             * É observada a higienização conforme orientação do fabricante nacional ou importador?
             *
             * @return Conteúdo do campo higienizacao
             */
            public String getHigienizacao() {
              return this.higienizacao;
            }

            /**
             * É observada a higienização conforme orientação do fabricante nacional ou importador?
             *
             * @param higienizacao Valor para atribuir ao campo higienizacao
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setHigienizacao(String higienizacao) {
              if (!"S".equals(higienizacao) && !"N".equals(higienizacao))
                throw new RuntimeException(
                    "Valor "
                        + String.valueOf(higienizacao)
                        + " inválido para o campo higienizacao");
              this.higienizacao = higienizacao;
              return this;
            }
            /**
             * Sim
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setHigienizacao_S() {
              this.higienizacao = "S";
              return this;
            }
            /**
             * Não
             *
             * @return O próprio EpiCompl para continuar populando outros campos
             */
            public EpiCompl<T> setHigienizacao_N() {
              this.higienizacao = "N";
              return this;
            }

            public EpiCompl(Object pai) {
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
       * Responsável pelos registros ambientais
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cpfResp", "ideOC", "dscOC", "nrOC", "ufOC",
          })
      public static class RespReg<T> {

        /** Preencher com o CPF do responsável pelos registros ambientais. */
        private String cpfResp;

        /** Órgão de classe ao qual o responsável pelos registros ambientais está vinculado. */
        private String ideOC;

        /**
         * Descrição (sigla) do órgão de classe ao qual o responsável pelos registros ambientais
         * está vinculado.
         */
        private String dscOC;

        /** Número de inscrição no órgão de classe. */
        private String nrOC;

        /** Sigla da Unidade da Federação - UF do órgão de classe. */
        private String ufOC;

        /**
         * Preencher com o CPF do responsável pelos registros ambientais.
         *
         * @return Conteúdo do campo cpfResp
         */
        public String getCpfResp() {
          return this.cpfResp;
        }

        /**
         * Preencher com o CPF do responsável pelos registros ambientais.
         *
         * <p>Validação: Deve ser um CPF válido.
         *
         * @param cpfResp Valor para atribuir ao campo cpfResp
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setCpfResp(String cpfResp) {
          this.cpfResp = cpfResp;
          return this;
        }

        /**
         * Órgão de classe ao qual o responsável pelos registros ambientais está vinculado.
         *
         * @return Conteúdo do campo ideOC
         */
        public String getIdeOC() {
          return this.ideOC;
        }

        /**
         * Órgão de classe ao qual o responsável pelos registros ambientais está vinculado.
         *
         * @param ideOC Valor para atribuir ao campo ideOC
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setIdeOC(String ideOC) {
          if (!"1".equals(ideOC) && !"4".equals(ideOC) && !"9".equals(ideOC))
            throw new RuntimeException(
                "Valor " + String.valueOf(ideOC) + " inválido para o campo ideOC");
          this.ideOC = ideOC;
          return this;
        }
        /**
         * Conselho Regional de Medicina - CRM
         *
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setIdeOC_1() {
          this.ideOC = "1";
          return this;
        }
        /**
         * Conselho Regional de Engenharia e Agronomia - CREA
         *
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setIdeOC_4() {
          this.ideOC = "4";
          return this;
        }
        /**
         * Outros
         *
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setIdeOC_9() {
          this.ideOC = "9";
          return this;
        }

        /**
         * Descrição (sigla) do órgão de classe ao qual o responsável pelos registros ambientais
         * está vinculado.
         *
         * @return Conteúdo do campo dscOC
         */
        public String getDscOC() {
          return this.dscOC;
        }

        /**
         * Descrição (sigla) do órgão de classe ao qual o responsável pelos registros ambientais
         * está vinculado.
         *
         * <p>Validação: Preenchimento obrigatório e exclusivo se {ideOC}(./ideOC) = [9].
         *
         * @param dscOC Valor para atribuir ao campo dscOC
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setDscOC(String dscOC) {
          this.dscOC = dscOC;
          return this;
        }

        /**
         * Número de inscrição no órgão de classe.
         *
         * @return Conteúdo do campo nrOC
         */
        public String getNrOC() {
          return this.nrOC;
        }

        /**
         * Número de inscrição no órgão de classe.
         *
         * @param nrOC Valor para atribuir ao campo nrOC
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setNrOC(String nrOC) {
          this.nrOC = nrOC;
          return this;
        }

        /**
         * Sigla da Unidade da Federação - UF do órgão de classe.
         *
         * @return Conteúdo do campo ufOC
         */
        public String getUfOC() {
          return this.ufOC;
        }

        /**
         * Sigla da Unidade da Federação - UF do órgão de classe.
         *
         * @param ufOC Valor para atribuir ao campo ufOC
         * @return O próprio RespReg para continuar populando outros campos
         */
        public RespReg<T> setUfOC(String ufOC) {
          if (!"AC".equals(ufOC)
              && !"AL".equals(ufOC)
              && !"AP".equals(ufOC)
              && !"AM".equals(ufOC)
              && !"BA".equals(ufOC)
              && !"CE".equals(ufOC)
              && !"DF".equals(ufOC)
              && !"ES".equals(ufOC)
              && !"GO".equals(ufOC)
              && !"MA".equals(ufOC)
              && !"MT".equals(ufOC)
              && !"MS".equals(ufOC)
              && !"MG".equals(ufOC)
              && !"PA".equals(ufOC)
              && !"PB".equals(ufOC)
              && !"PR".equals(ufOC)
              && !"PE".equals(ufOC)
              && !"PI".equals(ufOC)
              && !"RJ".equals(ufOC)
              && !"RN".equals(ufOC)
              && !"RS".equals(ufOC)
              && !"RO".equals(ufOC)
              && !"RR".equals(ufOC)
              && !"SC".equals(ufOC)
              && !"SP".equals(ufOC)
              && !"SE".equals(ufOC)
              && !"TO".equals(ufOC))
            throw new RuntimeException(
                "Valor " + String.valueOf(ufOC) + " inválido para o campo ufOC");
          this.ufOC = ufOC;
          return this;
        }

        public RespReg<T> setUfOC_AC() {
          this.ufOC = "AC";
          return this;
        }

        public RespReg<T> setUfOC_AL() {
          this.ufOC = "AL";
          return this;
        }

        public RespReg<T> setUfOC_AP() {
          this.ufOC = "AP";
          return this;
        }

        public RespReg<T> setUfOC_AM() {
          this.ufOC = "AM";
          return this;
        }

        public RespReg<T> setUfOC_BA() {
          this.ufOC = "BA";
          return this;
        }

        public RespReg<T> setUfOC_CE() {
          this.ufOC = "CE";
          return this;
        }

        public RespReg<T> setUfOC_DF() {
          this.ufOC = "DF";
          return this;
        }

        public RespReg<T> setUfOC_ES() {
          this.ufOC = "ES";
          return this;
        }

        public RespReg<T> setUfOC_GO() {
          this.ufOC = "GO";
          return this;
        }

        public RespReg<T> setUfOC_MA() {
          this.ufOC = "MA";
          return this;
        }

        public RespReg<T> setUfOC_MT() {
          this.ufOC = "MT";
          return this;
        }

        public RespReg<T> setUfOC_MS() {
          this.ufOC = "MS";
          return this;
        }

        public RespReg<T> setUfOC_MG() {
          this.ufOC = "MG";
          return this;
        }

        public RespReg<T> setUfOC_PA() {
          this.ufOC = "PA";
          return this;
        }

        public RespReg<T> setUfOC_PB() {
          this.ufOC = "PB";
          return this;
        }

        public RespReg<T> setUfOC_PR() {
          this.ufOC = "PR";
          return this;
        }

        public RespReg<T> setUfOC_PE() {
          this.ufOC = "PE";
          return this;
        }

        public RespReg<T> setUfOC_PI() {
          this.ufOC = "PI";
          return this;
        }

        public RespReg<T> setUfOC_RJ() {
          this.ufOC = "RJ";
          return this;
        }

        public RespReg<T> setUfOC_RN() {
          this.ufOC = "RN";
          return this;
        }

        public RespReg<T> setUfOC_RS() {
          this.ufOC = "RS";
          return this;
        }

        public RespReg<T> setUfOC_RO() {
          this.ufOC = "RO";
          return this;
        }

        public RespReg<T> setUfOC_RR() {
          this.ufOC = "RR";
          return this;
        }

        public RespReg<T> setUfOC_SC() {
          this.ufOC = "SC";
          return this;
        }

        public RespReg<T> setUfOC_SP() {
          this.ufOC = "SP";
          return this;
        }

        public RespReg<T> setUfOC_SE() {
          this.ufOC = "SE";
          return this;
        }

        public RespReg<T> setUfOC_TO() {
          this.ufOC = "TO";
          return this;
        }

        public RespReg(Object pai) {
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
       * Observações relativas a registros ambientais.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "obsCompl",
          })
      public static class Obs<T> {

        /** Observação(ões) complementar(es) referente(s) a registros ambientais. */
        private String obsCompl;

        /**
         * Observação(ões) complementar(es) referente(s) a registros ambientais.
         *
         * @return Conteúdo do campo obsCompl
         */
        public String getObsCompl() {
          return this.obsCompl;
        }

        /**
         * Observação(ões) complementar(es) referente(s) a registros ambientais.
         *
         * @param obsCompl Valor para atribuir ao campo obsCompl
         * @return O próprio Obs para continuar populando outros campos
         */
        public Obs<T> setObsCompl(String obsCompl) {
          this.obsCompl = obsCompl;
          return this;
        }

        public Obs(Object pai) {
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
