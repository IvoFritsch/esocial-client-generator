package esocial.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlTransient;

/** S-2200 - Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {
      "evtAdmissao",
    })
@XmlRootElement(name = "eSocial")
public class Evento_Admissao {

  /** Evento Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador. */
  private EvtAdmissao evtAdmissao;

  /**
   * Evento Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador.
   *
   * @return Conteúdo do campo evtAdmissao
   */
  public EvtAdmissao getEvtAdmissao() {
    return this.evtAdmissao;
  }

  /**
   * Evento Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador.
   *
   * <p>CHAVE_GRUPO: {Id}
   *
   * <p>REGRA:REGRA_ADMISSAO_POSTERIOR_INICIO_ATIVIDADES
   *
   * <p>REGRA:REGRA_ADMISSAO_VALIDA_DT_ADM
   *
   * <p>REGRA:REGRA_ADMISSAO_VALIDA_DURACAO_CONTRATO
   *
   * <p>REGRA:REGRA_BLOQUEIA_USO_CPF_EMPREGADOR
   *
   * <p>REGRA:REGRA_COMPATIBILIDADE_CATEGORIA_CLASSTRIB
   *
   * <p>REGRA:REGRA_COMPATIB_CATEG_EVENTO
   *
   * <p>REGRA:REGRA_EMPREGADO_DOMESTICO
   *
   * <p>REGRA:REGRA_ENVIO_PROC_FECHAMENTO
   *
   * <p>REGRA:REGRA_EVENTOS_EXTEMP
   *
   * <p>REGRA:REGRA_EVENTO_IMPACTO_FOPAG
   *
   * <p>REGRA:REGRA_EVETRAB_VALIDA_OPCAO_FGTS
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
   * <p>REGRA:REGRA_MUDANCA_CPF
   *
   * <p>REGRA:REGRA_REGISTRO_PRELIMINAR
   *
   * <p>REGRA:REGRA_RETIFICA_MESMO_VINCULO
   *
   * <p>REGRA:REGRA_VALIDA_EMPREGADOR
   *
   * <p>REGRA:REGRA_VALIDA_MATRICULA
   *
   * <p>REGRA:REGRA_VALIDA_TRABALHADOR_BASE_CPF
   *
   * @return O objeto EvtAdmissao para população dos campos filhos
   */
  public EvtAdmissao<Evento_Admissao> setEvtAdmissao() {
    if (this.evtAdmissao == null) {
      this.evtAdmissao = new EvtAdmissao(this);
    }
    return this.evtAdmissao;
  }

  /**
   * Evento Cadastramento Inicial do Vínculo e Admissão/Ingresso de Trabalhador.
   *
   * @param <T> Tipo do retorno do método finish()
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(
      name = "",
      propOrder = {
        "ideEvento",
        "ideEmpregador",
        "trabalhador",
        "vinculo",
      })
  public static class EvtAdmissao<T> {

    /** Informações de identificação do evento. */
    private Tipos.T_ideEvento_trab ideEvento;

    /** Informações de identificação do empregador. */
    private Tipos.T_ideEmpregador ideEmpregador;

    /** Informações pessoais do trabalhador. */
    private Trabalhador trabalhador;

    /** Informações do vínculo. */
    private Vinculo vinculo;

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
    public Tipos.T_ideEvento_trab<EvtAdmissao<T>> setIdeEvento() {
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
    public Tipos.T_ideEmpregador<EvtAdmissao<T>> setIdeEmpregador() {
      if (this.ideEmpregador == null) {
        this.ideEmpregador = new Tipos.T_ideEmpregador(this);
      }
      return this.ideEmpregador;
    }

    /**
     * Informações pessoais do trabalhador.
     *
     * @return Conteúdo do campo trabalhador
     */
    public Trabalhador getTrabalhador() {
      return this.trabalhador;
    }

    /**
     * Informações pessoais do trabalhador.
     *
     * <p>CHAVE_GRUPO: {cpfTrab}
     *
     * @return O objeto Trabalhador para população dos campos filhos
     */
    public Trabalhador<EvtAdmissao<T>> setTrabalhador() {
      if (this.trabalhador == null) {
        this.trabalhador = new Trabalhador(this);
      }
      return this.trabalhador;
    }

    /**
     * Informações do vínculo.
     *
     * @return Conteúdo do campo vinculo
     */
    public Vinculo getVinculo() {
      return this.vinculo;
    }

    /**
     * Informações do vínculo.
     *
     * <p>DESCRICAO_COMPLETA:Grupo de informações do vínculo.
     *
     * <p>CHAVE_GRUPO: {matricula}
     *
     * @return O objeto Vinculo para população dos campos filhos
     */
    public Vinculo<EvtAdmissao<T>> setVinculo() {
      if (this.vinculo == null) {
        this.vinculo = new Vinculo(this);
      }
      return this.vinculo;
    }

    public EvtAdmissao(Object pai) {
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
     * Informações pessoais do trabalhador.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "cpfTrab",
          "nmTrab",
          "sexo",
          "racaCor",
          "estCiv",
          "grauInstr",
          "nmSoc",
          "nascimento",
          "endereco",
          "trabImig",
          "infoDeficiencia",
          "dependente",
          "contato",
        })
    public static class Trabalhador<T> {

      /** Preencher com o número do CPF do trabalhador. */
      private String cpfTrab;

      /** Informar o nome do trabalhador. */
      private String nmTrab;

      /** Sexo do trabalhador. */
      private String sexo;

      /** Raça e cor do trabalhador. */
      private String racaCor;

      /** Estado civil do trabalhador. */
      private String estCiv;

      /** Grau de instrução do trabalhador. */
      private String grauInstr;

      /** Nome social para travesti ou transexual. */
      private String nmSoc;

      /** Grupo de informações do nascimento do trabalhador. */
      private Tipos.T_nascimento nascimento;

      /** Endereço do trabalhador */
      private Endereco endereco;

      /** Informações do trabalhador imigrante. */
      private TrabImig trabImig;

      /** Pessoa com deficiência. */
      private InfoDeficiencia infoDeficiencia;

      /**
       * Informações dos dependentes.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       */
      private java.util.List<Dependente> dependente;

      /** Informações de contato. */
      private Tipos.T_contato contato;

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
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setCpfTrab(String cpfTrab) {
        this.cpfTrab = cpfTrab;
        return this;
      }

      /**
       * Informar o nome do trabalhador.
       *
       * @return Conteúdo do campo nmTrab
       */
      public String getNmTrab() {
        return this.nmTrab;
      }

      /**
       * Informar o nome do trabalhador.
       *
       * @param nmTrab Valor para atribuir ao campo nmTrab
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setNmTrab(String nmTrab) {
        this.nmTrab = nmTrab;
        return this;
      }

      /**
       * Sexo do trabalhador.
       *
       * @return Conteúdo do campo sexo
       */
      public String getSexo() {
        return this.sexo;
      }

      /**
       * Sexo do trabalhador.
       *
       * @param sexo Valor para atribuir ao campo sexo
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setSexo(String sexo) {
        if (!"M".equals(sexo) && !"F".equals(sexo))
          throw new RuntimeException(
              "Valor " + String.valueOf(sexo) + " inválido para o campo sexo");
        this.sexo = sexo;
        return this;
      }
      /**
       * Masculino
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setSexo_M() {
        this.sexo = "M";
        return this;
      }
      /**
       * Feminino
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setSexo_F() {
        this.sexo = "F";
        return this;
      }

      /**
       * Raça e cor do trabalhador.
       *
       * @return Conteúdo do campo racaCor
       */
      public String getRacaCor() {
        return this.racaCor;
      }

      /**
       * Raça e cor do trabalhador.
       *
       * @param racaCor Valor para atribuir ao campo racaCor
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor(String racaCor) {
        if (!"1".equals(racaCor)
            && !"2".equals(racaCor)
            && !"3".equals(racaCor)
            && !"4".equals(racaCor)
            && !"5".equals(racaCor)
            && !"6".equals(racaCor))
          throw new RuntimeException(
              "Valor " + String.valueOf(racaCor) + " inválido para o campo racaCor");
        this.racaCor = racaCor;
        return this;
      }
      /**
       * Branca
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_1() {
        this.racaCor = "1";
        return this;
      }
      /**
       * Preta
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_2() {
        this.racaCor = "2";
        return this;
      }
      /**
       * Parda
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_3() {
        this.racaCor = "3";
        return this;
      }
      /**
       * Amarela
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_4() {
        this.racaCor = "4";
        return this;
      }
      /**
       * Indígena
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_5() {
        this.racaCor = "5";
        return this;
      }
      /**
       * Não informado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setRacaCor_6() {
        this.racaCor = "6";
        return this;
      }

      /**
       * Estado civil do trabalhador.
       *
       * @return Conteúdo do campo estCiv
       */
      public String getEstCiv() {
        return this.estCiv;
      }

      /**
       * Estado civil do trabalhador.
       *
       * @param estCiv Valor para atribuir ao campo estCiv
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv(String estCiv) {
        if (!"1".equals(estCiv)
            && !"2".equals(estCiv)
            && !"3".equals(estCiv)
            && !"4".equals(estCiv)
            && !"5".equals(estCiv))
          throw new RuntimeException(
              "Valor " + String.valueOf(estCiv) + " inválido para o campo estCiv");
        this.estCiv = estCiv;
        return this;
      }
      /**
       * Solteiro
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_1() {
        this.estCiv = "1";
        return this;
      }
      /**
       * Casado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_2() {
        this.estCiv = "2";
        return this;
      }
      /**
       * Divorciado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_3() {
        this.estCiv = "3";
        return this;
      }
      /**
       * Separado
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_4() {
        this.estCiv = "4";
        return this;
      }
      /**
       * Viúvo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setEstCiv_5() {
        this.estCiv = "5";
        return this;
      }

      /**
       * Grau de instrução do trabalhador.
       *
       * @return Conteúdo do campo grauInstr
       */
      public String getGrauInstr() {
        return this.grauInstr;
      }

      /**
       * Grau de instrução do trabalhador.
       *
       * @param grauInstr Valor para atribuir ao campo grauInstr
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr(String grauInstr) {
        if (!"01".equals(grauInstr)
            && !"02".equals(grauInstr)
            && !"03".equals(grauInstr)
            && !"04".equals(grauInstr)
            && !"05".equals(grauInstr)
            && !"06".equals(grauInstr)
            && !"07".equals(grauInstr)
            && !"08".equals(grauInstr)
            && !"09".equals(grauInstr)
            && !"10".equals(grauInstr)
            && !"11".equals(grauInstr)
            && !"12".equals(grauInstr))
          throw new RuntimeException(
              "Valor " + String.valueOf(grauInstr) + " inválido para o campo grauInstr");
        this.grauInstr = grauInstr;
        return this;
      }
      /**
       * Analfabeto, inclusive o que, embora tenha recebido instrução, não se alfabetizou
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_01() {
        this.grauInstr = "01";
        return this;
      }
      /**
       * Até o 5º ano incompleto do ensino fundamental (antiga 4ª série) ou que se tenha
       * alfabetizado sem ter frequentado escola regular
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_02() {
        this.grauInstr = "02";
        return this;
      }
      /**
       * 5º ano completo do ensino fundamental
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_03() {
        this.grauInstr = "03";
        return this;
      }
      /**
       * Do 6º ao 9º ano do ensino fundamental incompleto (antiga 5ª a 8ª série)
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_04() {
        this.grauInstr = "04";
        return this;
      }
      /**
       * Ensino fundamental completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_05() {
        this.grauInstr = "05";
        return this;
      }
      /**
       * Ensino médio incompleto
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_06() {
        this.grauInstr = "06";
        return this;
      }
      /**
       * Ensino médio completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_07() {
        this.grauInstr = "07";
        return this;
      }
      /**
       * Educação superior incompleta
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_08() {
        this.grauInstr = "08";
        return this;
      }
      /**
       * Educação superior completa
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_09() {
        this.grauInstr = "09";
        return this;
      }
      /**
       * Pós-graduação completa
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_10() {
        this.grauInstr = "10";
        return this;
      }
      /**
       * Mestrado completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_11() {
        this.grauInstr = "11";
        return this;
      }
      /**
       * Doutorado completo
       *
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setGrauInstr_12() {
        this.grauInstr = "12";
        return this;
      }

      /**
       * Nome social para travesti ou transexual.
       *
       * @return Conteúdo do campo nmSoc
       */
      public String getNmSoc() {
        return this.nmSoc;
      }

      /**
       * Nome social para travesti ou transexual.
       *
       * @param nmSoc Valor para atribuir ao campo nmSoc
       * @return O próprio Trabalhador para continuar populando outros campos
       */
      public Trabalhador<T> setNmSoc(String nmSoc) {
        this.nmSoc = nmSoc;
        return this;
      }

      /**
       * Grupo de informações do nascimento do trabalhador.
       *
       * @return Conteúdo do campo nascimento
       */
      public Tipos.T_nascimento getNascimento() {
        return this.nascimento;
      }

      /**
       * Grupo de informações do nascimento do trabalhador.
       *
       * @return O objeto Tipos.T_nascimento para população dos campos filhos
       */
      public Tipos.T_nascimento<Trabalhador<T>> setNascimento() {
        if (this.nascimento == null) {
          this.nascimento = new Tipos.T_nascimento(this);
        }
        return this.nascimento;
      }

      /**
       * Endereço do trabalhador
       *
       * @return Conteúdo do campo endereco
       */
      public Endereco getEndereco() {
        return this.endereco;
      }

      /**
       * Endereço do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Grupo de informações do endereço do trabalhador.
       *
       * <p>CONDICAO_GRUPO: O (se grupo {desligamento}(2200_vinculo_desligamento) não estiver
       * preenchido); F (nos demais casos)
       *
       * @return O objeto Endereco para população dos campos filhos
       */
      public Endereco<Trabalhador<T>> setEndereco() {
        if (this.endereco == null) {
          this.endereco = new Endereco(this);
        }
        return this.endereco;
      }

      /**
       * Informações do trabalhador imigrante.
       *
       * @return Conteúdo do campo trabImig
       */
      public TrabImig getTrabImig() {
        return this.trabImig;
      }

      /**
       * Informações do trabalhador imigrante.
       *
       * <p>CONDICAO_GRUPO: N (se {paisNac}(2200_trabalhador_nascimento_paisNac) = [105]); OC (se
       * {paisNac}(2200_trabalhador_nascimento_paisNac) for diferente de [105]) e se grupo
       * {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais casos)
       *
       * @return O objeto TrabImig para população dos campos filhos
       */
      public TrabImig<Trabalhador<T>> setTrabImig() {
        if (this.trabImig == null) {
          this.trabImig = new TrabImig(this);
        }
        return this.trabImig;
      }

      /**
       * Pessoa com deficiência.
       *
       * @return Conteúdo do campo infoDeficiencia
       */
      public InfoDeficiencia getInfoDeficiencia() {
        return this.infoDeficiencia;
      }

      /**
       * Pessoa com deficiência.
       *
       * <p>CONDICAO_GRUPO: OC (se grupo {desligamento}(2200_vinculo_desligamento) não estiver
       * preenchido); F (nos demais casos)
       *
       * @return O objeto InfoDeficiencia para população dos campos filhos
       */
      public InfoDeficiencia<Trabalhador<T>> setInfoDeficiencia() {
        if (this.infoDeficiencia == null) {
          this.infoDeficiencia = new InfoDeficiencia(this);
        }
        return this.infoDeficiencia;
      }

      /**
       * Informações dos dependentes.
       *
       * @return Conteúdo do campo dependente
       */
      public java.util.List<Dependente> getDependente() {
        return this.dependente;
      }

      /**
       * Informações dos dependentes.
       *
       * <p>- Esse campo pode ser repetido até 99 vezes
       *
       * <p>CHAVE_GRUPO: {tpDep}, {nmDep}, {dtNascto}
       *
       * <p>CONDICAO_GRUPO: OC
       *
       * @return O objeto Dependente para população dos campos filhos
       */
      public Dependente<Trabalhador<T>> setDependente_Next() {
        if (this.dependente == null) {
          this.dependente = new java.util.ArrayList<>();
        }
        Dependente toAdd = new Dependente(this);
        this.dependente.add(toAdd);
        return toAdd;
      }

      /**
       * Informações de contato.
       *
       * @return Conteúdo do campo contato
       */
      public Tipos.T_contato getContato() {
        return this.contato;
      }

      /**
       * Informações de contato.
       *
       * <p>CONDICAO_GRUPO: OC (se grupo {desligamento}(2200_vinculo_desligamento) não estiver
       * preenchido); F (nos demais casos)
       *
       * @return O objeto Tipos.T_contato para população dos campos filhos
       */
      public Tipos.T_contato<Trabalhador<T>> setContato() {
        if (this.contato == null) {
          this.contato = new Tipos.T_contato(this);
        }
        return this.contato;
      }

      public Trabalhador(Object pai) {
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
       * Endereço do trabalhador
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "brasil",
            "exterior",
          })
      public static class Endereco<T> {

        /** Endereço no Brasil. */
        private Tipos.T_endereco_brasil brasil;

        /** Endereço no exterior. */
        private Tipos.T_endereco_exterior exterior;

        /**
         * Endereço no Brasil.
         *
         * @return Conteúdo do campo brasil
         */
        public Tipos.T_endereco_brasil getBrasil() {
          return this.brasil;
        }

        /**
         * Endereço no Brasil.
         *
         * <p>CONDICAO_GRUPO: O (se não informados os grupos
         * {exterior}(2200_trabalhador_endereco_exterior) e
         * {desligamento}(2200_vinculo_desligamento)); N (se grupo
         * {exterior}(2200_trabalhador_endereco_exterior) estiver preenchido); F (nos demais casos)
         *
         * @return O objeto Tipos.T_endereco_brasil para população dos campos filhos
         */
        public Tipos.T_endereco_brasil<Endereco<T>> setBrasil() {
          if (this.brasil == null) {
            this.brasil = new Tipos.T_endereco_brasil(this);
          }
          return this.brasil;
        }

        /**
         * Endereço no exterior.
         *
         * @return Conteúdo do campo exterior
         */
        public Tipos.T_endereco_exterior getExterior() {
          return this.exterior;
        }

        /**
         * Endereço no exterior.
         *
         * <p>CONDICAO_GRUPO: O (se não informados os grupos
         * {brasil}(2200_trabalhador_endereco_brasil) e {desligamento}(2200_vinculo_desligamento));
         * N (se grupo {brasil}(2200_trabalhador_endereco_brasil) estiver preenchido); F (nos demais
         * casos)
         *
         * @return O objeto Tipos.T_endereco_exterior para população dos campos filhos
         */
        public Tipos.T_endereco_exterior<Endereco<T>> setExterior() {
          if (this.exterior == null) {
            this.exterior = new Tipos.T_endereco_exterior(this);
          }
          return this.exterior;
        }

        public Endereco(Object pai) {
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
       * Informações do trabalhador imigrante.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tmpResid",
            "condIng",
          })
      public static class TrabImig<T> {

        /** Tempo de residência do trabalhador imigrante. */
        private String tmpResid;

        /** Condição de ingresso do trabalhador imigrante. */
        private String condIng;

        /**
         * Tempo de residência do trabalhador imigrante.
         *
         * @return Conteúdo do campo tmpResid
         */
        public String getTmpResid() {
          return this.tmpResid;
        }

        /**
         * Tempo de residência do trabalhador imigrante.
         *
         * <p>Validação: Preenchimento obrigatório se
         * ({dtAdm}(2200_vinculo_infoRegimeTrab_infoCeletista_dtAdm) ou
         * {dtExercicio}(2200_vinculo_infoRegimeTrab_infoEstatutario_dtExercicio)) >= [2021-05-10].
         *
         * @param tmpResid Valor para atribuir ao campo tmpResid
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setTmpResid(String tmpResid) {
          if (!"1".equals(tmpResid) && !"2".equals(tmpResid))
            throw new RuntimeException(
                "Valor " + String.valueOf(tmpResid) + " inválido para o campo tmpResid");
          this.tmpResid = tmpResid;
          return this;
        }
        /**
         * Prazo indeterminado
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setTmpResid_1() {
          this.tmpResid = "1";
          return this;
        }
        /**
         * Prazo determinado
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setTmpResid_2() {
          this.tmpResid = "2";
          return this;
        }

        /**
         * Condição de ingresso do trabalhador imigrante.
         *
         * @return Conteúdo do campo condIng
         */
        public String getCondIng() {
          return this.condIng;
        }

        /**
         * Condição de ingresso do trabalhador imigrante.
         *
         * <p>Validação: Se {tmpResid}(./tmpResid) = [1], não pode ser informado [2, 5]. Se
         * {tmpResid}(./tmpResid) = [2], não pode ser informado [1].
         *
         * @param condIng Valor para atribuir ao campo condIng
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng(String condIng) {
          if (!"1".equals(condIng)
              && !"2".equals(condIng)
              && !"3".equals(condIng)
              && !"4".equals(condIng)
              && !"5".equals(condIng)
              && !"6".equals(condIng)
              && !"7".equals(condIng))
            throw new RuntimeException(
                "Valor " + String.valueOf(condIng) + " inválido para o campo condIng");
          this.condIng = condIng;
          return this;
        }
        /**
         * Refugiado
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_1() {
          this.condIng = "1";
          return this;
        }
        /**
         * Solicitante de refúgio
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_2() {
          this.condIng = "2";
          return this;
        }
        /**
         * Permanência no Brasil em razão de reunião familiar
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_3() {
          this.condIng = "3";
          return this;
        }
        /**
         * Beneficiado pelo acordo entre países do Mercosul
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_4() {
          this.condIng = "4";
          return this;
        }
        /**
         * Dependente de agente diplomático e/ou consular de países que mantêm acordo de
         * reciprocidade para o exercício de atividade remunerada no Brasil
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_5() {
          this.condIng = "5";
          return this;
        }
        /**
         * Beneficiado pelo Tratado de Amizade, Cooperação e Consulta entre a República Federativa
         * do Brasil e a República Portuguesa
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_6() {
          this.condIng = "6";
          return this;
        }
        /**
         * Outra condição
         *
         * @return O próprio TrabImig para continuar populando outros campos
         */
        public TrabImig<T> setCondIng_7() {
          this.condIng = "7";
          return this;
        }

        public TrabImig(Object pai) {
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
       * Pessoa com deficiência.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "defFisica",
            "defVisual",
            "defAuditiva",
            "defMental",
            "defIntelectual",
            "reabReadap",
            "infoCota",
            "observacao",
          })
      public static class InfoDeficiencia<T> {

        /** Deficiência física. */
        private String defFisica;

        /** Deficiência visual. */
        private String defVisual;

        /** Deficiência auditiva. */
        private String defAuditiva;

        /** Deficiência mental. */
        private String defMental;

        /** Deficiência intelectual. */
        private String defIntelectual;

        /**
         * Informar se o trabalhador é reabilitado (empregado) ou readaptado (servidor
         * público/militar).
         */
        private String reabReadap;

        /**
         * Informar se o trabalhador preenche cota de pessoas com deficiência habilitadas ou de
         * beneficiários reabilitados.
         */
        private String infoCota;

        /** Observação. */
        private String observacao;

        /**
         * Deficiência física.
         *
         * @return Conteúdo do campo defFisica
         */
        public String getDefFisica() {
          return this.defFisica;
        }

        /**
         * Deficiência física.
         *
         * @param defFisica Valor para atribuir ao campo defFisica
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefFisica(String defFisica) {
          if (!"S".equals(defFisica) && !"N".equals(defFisica))
            throw new RuntimeException(
                "Valor " + String.valueOf(defFisica) + " inválido para o campo defFisica");
          this.defFisica = defFisica;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefFisica_S() {
          this.defFisica = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefFisica_N() {
          this.defFisica = "N";
          return this;
        }

        /**
         * Deficiência visual.
         *
         * @return Conteúdo do campo defVisual
         */
        public String getDefVisual() {
          return this.defVisual;
        }

        /**
         * Deficiência visual.
         *
         * @param defVisual Valor para atribuir ao campo defVisual
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefVisual(String defVisual) {
          if (!"S".equals(defVisual) && !"N".equals(defVisual))
            throw new RuntimeException(
                "Valor " + String.valueOf(defVisual) + " inválido para o campo defVisual");
          this.defVisual = defVisual;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefVisual_S() {
          this.defVisual = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefVisual_N() {
          this.defVisual = "N";
          return this;
        }

        /**
         * Deficiência auditiva.
         *
         * @return Conteúdo do campo defAuditiva
         */
        public String getDefAuditiva() {
          return this.defAuditiva;
        }

        /**
         * Deficiência auditiva.
         *
         * @param defAuditiva Valor para atribuir ao campo defAuditiva
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefAuditiva(String defAuditiva) {
          if (!"S".equals(defAuditiva) && !"N".equals(defAuditiva))
            throw new RuntimeException(
                "Valor " + String.valueOf(defAuditiva) + " inválido para o campo defAuditiva");
          this.defAuditiva = defAuditiva;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefAuditiva_S() {
          this.defAuditiva = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefAuditiva_N() {
          this.defAuditiva = "N";
          return this;
        }

        /**
         * Deficiência mental.
         *
         * @return Conteúdo do campo defMental
         */
        public String getDefMental() {
          return this.defMental;
        }

        /**
         * Deficiência mental.
         *
         * @param defMental Valor para atribuir ao campo defMental
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefMental(String defMental) {
          if (!"S".equals(defMental) && !"N".equals(defMental))
            throw new RuntimeException(
                "Valor " + String.valueOf(defMental) + " inválido para o campo defMental");
          this.defMental = defMental;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefMental_S() {
          this.defMental = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefMental_N() {
          this.defMental = "N";
          return this;
        }

        /**
         * Deficiência intelectual.
         *
         * @return Conteúdo do campo defIntelectual
         */
        public String getDefIntelectual() {
          return this.defIntelectual;
        }

        /**
         * Deficiência intelectual.
         *
         * @param defIntelectual Valor para atribuir ao campo defIntelectual
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefIntelectual(String defIntelectual) {
          if (!"S".equals(defIntelectual) && !"N".equals(defIntelectual))
            throw new RuntimeException(
                "Valor "
                    + String.valueOf(defIntelectual)
                    + " inválido para o campo defIntelectual");
          this.defIntelectual = defIntelectual;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefIntelectual_S() {
          this.defIntelectual = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setDefIntelectual_N() {
          this.defIntelectual = "N";
          return this;
        }

        /**
         * Informar se o trabalhador é reabilitado (empregado) ou readaptado (servidor
         * público/militar).
         *
         * @return Conteúdo do campo reabReadap
         */
        public String getReabReadap() {
          return this.reabReadap;
        }

        /**
         * Informar se o trabalhador é reabilitado (empregado) ou readaptado (servidor
         * público/militar).
         *
         * <p>Reabilitado: estando o empregado incapacitado parcial ou totalmente para o trabalho,
         * cumpriu programa de reabilitação profissional no INSS, recebendo certificado e sendo
         * proporcionados os meios indicados para participar do mercado de trabalho.
         *
         * <p>Readaptado: o servidor está investido em cargo de atribuições e responsabilidades
         * compatíveis com a limitação que tenha sofrido em sua capacidade física ou mental
         * verificada em inspeção médica.
         *
         * @param reabReadap Valor para atribuir ao campo reabReadap
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setReabReadap(String reabReadap) {
          if (!"S".equals(reabReadap) && !"N".equals(reabReadap))
            throw new RuntimeException(
                "Valor " + String.valueOf(reabReadap) + " inválido para o campo reabReadap");
          this.reabReadap = reabReadap;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setReabReadap_S() {
          this.reabReadap = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setReabReadap_N() {
          this.reabReadap = "N";
          return this;
        }

        /**
         * Informar se o trabalhador preenche cota de pessoas com deficiência habilitadas ou de
         * beneficiários reabilitados.
         *
         * @return Conteúdo do campo infoCota
         */
        public String getInfoCota() {
          return this.infoCota;
        }

        /**
         * Informar se o trabalhador preenche cota de pessoas com deficiência habilitadas ou de
         * beneficiários reabilitados.
         *
         * <p>Validação: Preenchimento obrigatório e exclusivo se
         * {tpRegTrab}(2200_vinculo_tpRegTrab) = [1].
         *
         * @param infoCota Valor para atribuir ao campo infoCota
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setInfoCota(String infoCota) {
          if (!"S".equals(infoCota) && !"N".equals(infoCota))
            throw new RuntimeException(
                "Valor " + String.valueOf(infoCota) + " inválido para o campo infoCota");
          this.infoCota = infoCota;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setInfoCota_S() {
          this.infoCota = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setInfoCota_N() {
          this.infoCota = "N";
          return this;
        }

        /**
         * Observação.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Observação.
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio InfoDeficiencia para continuar populando outros campos
         */
        public InfoDeficiencia<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        public InfoDeficiencia(Object pai) {
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
       * Informações dos dependentes.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpDep",
            "nmDep",
            "dtNascto",
            "cpfDep",
            "sexoDep",
            "depIRRF",
            "depSF",
            "incTrab",
          })
      public static class Dependente<T> {

        /** Tipo de dependente. */
        private String tpDep;

        /** Nome do dependente. */
        private String nmDep;

        /** Preencher com a data de nascimento. */
        private javax.xml.datatype.XMLGregorianCalendar dtNascto;

        /** Número de inscrição no CPF. */
        private String cpfDep;

        /** Sexo do dependente. */
        private String sexoDep;

        /**
         * Informar se é dependente do trabalhador para fins de dedução de seu rendimento tributável
         * pelo Imposto de Renda.
         */
        private String depIRRF;

        /** Informar se é dependente para fins de recebimento do benefício de salário-família. */
        private String depSF;

        /** Informar se o dependente tem incapacidade física ou mental para o trabalho. */
        private String incTrab;

        /**
         * Tipo de dependente.
         *
         * @return Conteúdo do campo tpDep
         */
        public String getTpDep() {
          return this.tpDep;
        }

        /**
         * Tipo de dependente.
         *
         * <p>Validação: Deve ser um código válido e existente na Tabela 07.
         *
         * @param tpDep Valor para atribuir ao campo tpDep
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setTpDep(String tpDep) {
          this.tpDep = tpDep;
          return this;
        }

        /**
         * Nome do dependente.
         *
         * @return Conteúdo do campo nmDep
         */
        public String getNmDep() {
          return this.nmDep;
        }

        /**
         * Nome do dependente.
         *
         * @param nmDep Valor para atribuir ao campo nmDep
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setNmDep(String nmDep) {
          this.nmDep = nmDep;
          return this;
        }

        /**
         * Preencher com a data de nascimento.
         *
         * @return Conteúdo do campo dtNascto
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtNascto() {
          return this.dtNascto;
        }

        /**
         * Preencher com a data de nascimento.
         *
         * <p>Validação: Deve ser maior ou igual que 01/01/1890 e menor ou igual à data atual.
         *
         * @param dtNascto Valor para atribuir ao campo dtNascto
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDtNascto(javax.xml.datatype.XMLGregorianCalendar dtNascto) {
          this.dtNascto = dtNascto;
          return this;
        }

        /**
         * Número de inscrição no CPF.
         *
         * @return Conteúdo do campo cpfDep
         */
        public String getCpfDep() {
          return this.cpfDep;
        }

        /**
         * Número de inscrição no CPF.
         *
         * <p>Validação: Deve ser um número de CPF válido, observando o que segue:
         *
         * <p>a) O preenchimento é obrigatório se {depIRRF}(./depIRRF) = [S];
         *
         * <p>b) Em arquivo de empregador Pessoa Física, deve ser diferente do CPF informado em
         * {ideEmpregador}(/ideEmpregador);
         *
         * <p>c) Não pode haver mais de um dependente com o mesmo número de CPF.
         *
         * @param cpfDep Valor para atribuir ao campo cpfDep
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setCpfDep(String cpfDep) {
          this.cpfDep = cpfDep;
          return this;
        }

        /**
         * Sexo do dependente.
         *
         * @return Conteúdo do campo sexoDep
         */
        public String getSexoDep() {
          return this.sexoDep;
        }

        /**
         * Sexo do dependente.
         *
         * <p>Validação: Preenchimento obrigatório se {tpRegPrev}(2200_vinculo_tpRegPrev) = [2] e
         * {cadIni}(2200_vinculo_cadIni) = [N]. Não informar se {tpRegPrev}(2200_vinculo_tpRegPrev)
         * for diferente de [2].
         *
         * @param sexoDep Valor para atribuir ao campo sexoDep
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setSexoDep(String sexoDep) {
          if (!"M".equals(sexoDep) && !"F".equals(sexoDep))
            throw new RuntimeException(
                "Valor " + String.valueOf(sexoDep) + " inválido para o campo sexoDep");
          this.sexoDep = sexoDep;
          return this;
        }
        /**
         * Masculino
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setSexoDep_M() {
          this.sexoDep = "M";
          return this;
        }
        /**
         * Feminino
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setSexoDep_F() {
          this.sexoDep = "F";
          return this;
        }

        /**
         * Informar se é dependente do trabalhador para fins de dedução de seu rendimento tributável
         * pelo Imposto de Renda.
         *
         * @return Conteúdo do campo depIRRF
         */
        public String getDepIRRF() {
          return this.depIRRF;
        }

        /**
         * Informar se é dependente do trabalhador para fins de dedução de seu rendimento tributável
         * pelo Imposto de Renda.
         *
         * @param depIRRF Valor para atribuir ao campo depIRRF
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepIRRF(String depIRRF) {
          if (!"S".equals(depIRRF) && !"N".equals(depIRRF))
            throw new RuntimeException(
                "Valor " + String.valueOf(depIRRF) + " inválido para o campo depIRRF");
          this.depIRRF = depIRRF;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepIRRF_S() {
          this.depIRRF = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepIRRF_N() {
          this.depIRRF = "N";
          return this;
        }

        /**
         * Informar se é dependente para fins de recebimento do benefício de salário-família.
         *
         * @return Conteúdo do campo depSF
         */
        public String getDepSF() {
          return this.depSF;
        }

        /**
         * Informar se é dependente para fins de recebimento do benefício de salário-família.
         *
         * @param depSF Valor para atribuir ao campo depSF
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepSF(String depSF) {
          if (!"S".equals(depSF) && !"N".equals(depSF))
            throw new RuntimeException(
                "Valor " + String.valueOf(depSF) + " inválido para o campo depSF");
          this.depSF = depSF;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepSF_S() {
          this.depSF = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setDepSF_N() {
          this.depSF = "N";
          return this;
        }

        /**
         * Informar se o dependente tem incapacidade física ou mental para o trabalho.
         *
         * @return Conteúdo do campo incTrab
         */
        public String getIncTrab() {
          return this.incTrab;
        }

        /**
         * Informar se o dependente tem incapacidade física ou mental para o trabalho.
         *
         * @param incTrab Valor para atribuir ao campo incTrab
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setIncTrab(String incTrab) {
          if (!"S".equals(incTrab) && !"N".equals(incTrab))
            throw new RuntimeException(
                "Valor " + String.valueOf(incTrab) + " inválido para o campo incTrab");
          this.incTrab = incTrab;
          return this;
        }
        /**
         * Sim
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setIncTrab_S() {
          this.incTrab = "S";
          return this;
        }
        /**
         * Não
         *
         * @return O próprio Dependente para continuar populando outros campos
         */
        public Dependente<T> setIncTrab_N() {
          this.incTrab = "N";
          return this;
        }

        public Dependente(Object pai) {
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
     * Informações do vínculo.
     *
     * @param <T> Tipo do retorno do método finish()
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(
        name = "",
        propOrder = {
          "matricula",
          "tpRegTrab",
          "tpRegPrev",
          "cadIni",
          "infoRegimeTrab",
          "infoContrato",
          "sucessaoVinc",
          "transfDom",
          "mudancaCPF",
          "afastamento",
          "desligamento",
          "cessao",
        })
    public static class Vinculo<T> {

      /**
       * Matrícula atribuída ao trabalhador pela empresa ou, no caso de servidor público, a
       * matrícula constante no Sistema de Administração de Recursos Humanos do órgão.
       */
      private String matricula;

      /** Tipo de regime trabalhista. */
      private String tpRegTrab;

      /** Tipo de regime previdenciário (ou Sistema de Proteção Social dos Militares). */
      private String tpRegPrev;

      /**
       * Indicar se o evento se refere a cadastramento inicial de vínculo (o ingresso do trabalhador
       * no empregador declarante, por admissão ou transferência, é anterior à data de início da
       * obrigatoriedade de envio de seus eventos não periódicos) ou se refere a admissão (o
       * ingresso do trabalhador no empregador declarante é igual ou posterior à data de início de
       * obrigatoriedade de envio de seus eventos não periódicos).
       */
      private String cadIni;

      /** Informações do regime trabalhista. */
      private InfoRegimeTrab infoRegimeTrab;

      /** Informações do contrato de trabalho. */
      private InfoContrato infoContrato;

      /** Grupo de informações da sucessão de vínculo trabalhista/estatutário. */
      private SucessaoVinc sucessaoVinc;

      /**
       * Informações do empregado doméstico transferido de outro representante da mesma unidade
       * familiar.
       */
      private TransfDom transfDom;

      /** Informações de mudança de CPF do trabalhador. */
      private MudancaCPF mudancaCPF;

      /** Informações de afastamento do trabalhador */
      private Afastamento afastamento;

      /** Informação do desligamento do trabalhador */
      private Desligamento desligamento;

      /** Informação de cessão/exercício em outro órgão do trabalhador */
      private Cessao cessao;

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
       * <p>Validação: O valor informado não pode conter a expressão 'eSocial' nas 7 (sete)
       * primeiras posições.
       *
       * <p>REGRA:REGRA_CARACTERE_ESPECIAL
       *
       * @param matricula Valor para atribuir ao campo matricula
       * @return O próprio Vinculo para continuar populando outros campos
       */
      public Vinculo<T> setMatricula(String matricula) {
        this.matricula = matricula;
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
       * <p>Validação: Se {codCateg}(2200_vinculo_infoContrato_codCateg) = [104], deve ser
       * preenchido com [1].
       *
       * @param tpRegTrab Valor para atribuir ao campo tpRegTrab
       * @return O próprio Vinculo para continuar populando outros campos
       */
      public Vinculo<T> setTpRegTrab(String tpRegTrab) {
        if (!"1".equals(tpRegTrab) && !"2".equals(tpRegTrab))
          throw new RuntimeException(
              "Valor " + String.valueOf(tpRegTrab) + " inválido para o campo tpRegTrab");
        this.tpRegTrab = tpRegTrab;
        return this;
      }
      /**
       * CLT - Consolidação das Leis de Trabalho e legislações trabalhistas específicas
       *
       * @return O próprio Vinculo para continuar populando outros campos
       */
      public Vinculo<T> setTpRegTrab_1() {
        this.tpRegTrab = "1";
        return this;
      }
      /**
       * Estatutário/legislações específicas (servidor temporário, militar, agente político, etc.)
       *
       * @return O próprio Vinculo para continuar populando outros campos
       */
      public Vinculo<T> setTpRegTrab_2() {
        this.tpRegTrab = "2";
        return this;
      }

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
       * <p>Validação: Se {codCateg}(./infoContrato_codCateg) = [104], deve ser preenchido com [1].
       * Se {codCateg}(./infoContrato_codCateg) = [101, 102, 103, 105, 106, 107, 108, 111], não pode
       * ser preenchido com [2].
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
       * Indicar se o evento se refere a cadastramento inicial de vínculo (o ingresso do trabalhador
       * no empregador declarante, por admissão ou transferência, é anterior à data de início da
       * obrigatoriedade de envio de seus eventos não periódicos) ou se refere a admissão (o
       * ingresso do trabalhador no empregador declarante é igual ou posterior à data de início de
       * obrigatoriedade de envio de seus eventos não periódicos).
       *
       * @return Conteúdo do campo cadIni
       */
      public String getCadIni() {
        return this.cadIni;
      }

      /**
       * Indicar se o evento se refere a cadastramento inicial de vínculo (o ingresso do trabalhador
       * no empregador declarante, por admissão ou transferência, é anterior à data de início da
       * obrigatoriedade de envio de seus eventos não periódicos) ou se refere a admissão (o
       * ingresso do trabalhador no empregador declarante é igual ou posterior à data de início de
       * obrigatoriedade de envio de seus eventos não periódicos).
       *
       * @param cadIni Valor para atribuir ao campo cadIni
       * @return O próprio Vinculo para continuar populando outros campos
       */
      public Vinculo<T> setCadIni(String cadIni) {
        if (!"S".equals(cadIni) && !"N".equals(cadIni))
          throw new RuntimeException(
              "Valor " + String.valueOf(cadIni) + " inválido para o campo cadIni");
        this.cadIni = cadIni;
        return this;
      }
      /**
       * Sim (Cadastramento Inicial)
       *
       * @return O próprio Vinculo para continuar populando outros campos
       */
      public Vinculo<T> setCadIni_S() {
        this.cadIni = "S";
        return this;
      }
      /**
       * Não (Admissão)
       *
       * @return O próprio Vinculo para continuar populando outros campos
       */
      public Vinculo<T> setCadIni_N() {
        this.cadIni = "N";
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

      /**
       * Grupo de informações da sucessão de vínculo trabalhista/estatutário.
       *
       * @return Conteúdo do campo sucessaoVinc
       */
      public SucessaoVinc getSucessaoVinc() {
        return this.sucessaoVinc;
      }

      /**
       * Grupo de informações da sucessão de vínculo trabalhista/estatutário.
       *
       * <p>CONDICAO_GRUPO: O (se {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao)
       * = [2, 3, 4] ou {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) = [5, 8]); N
       * (nos demais casos)
       *
       * @return O objeto SucessaoVinc para população dos campos filhos
       */
      public SucessaoVinc<Vinculo<T>> setSucessaoVinc() {
        if (this.sucessaoVinc == null) {
          this.sucessaoVinc = new SucessaoVinc(this);
        }
        return this.sucessaoVinc;
      }

      /**
       * Informações do empregado doméstico transferido de outro representante da mesma unidade
       * familiar.
       *
       * @return Conteúdo do campo transfDom
       */
      public TransfDom getTransfDom() {
        return this.transfDom;
      }

      /**
       * Informações do empregado doméstico transferido de outro representante da mesma unidade
       * familiar.
       *
       * <p>CONDICAO_GRUPO: O (se {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao)
       * for igual [5]); N (nos demais casos)
       *
       * @return O objeto TransfDom para população dos campos filhos
       */
      public TransfDom<Vinculo<T>> setTransfDom() {
        if (this.transfDom == null) {
          this.transfDom = new TransfDom(this);
        }
        return this.transfDom;
      }

      /**
       * Informações de mudança de CPF do trabalhador.
       *
       * @return Conteúdo do campo mudancaCPF
       */
      public MudancaCPF getMudancaCPF() {
        return this.mudancaCPF;
      }

      /**
       * Informações de mudança de CPF do trabalhador.
       *
       * <p>CONDICAO_GRUPO: O (se {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao)
       * = [6] ou {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) = [10]); N (nos
       * demais casos)
       *
       * @return O objeto MudancaCPF para população dos campos filhos
       */
      public MudancaCPF<Vinculo<T>> setMudancaCPF() {
        if (this.mudancaCPF == null) {
          this.mudancaCPF = new MudancaCPF(this);
        }
        return this.mudancaCPF;
      }

      /**
       * Informações de afastamento do trabalhador
       *
       * @return Conteúdo do campo afastamento
       */
      public Afastamento getAfastamento() {
        return this.afastamento;
      }

      /**
       * Informações de afastamento do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Informações de afastamento do trabalhador.
       *
       * <p>Preenchimento exclusivo em caso de trabalhador que permaneça afastado na data de início
       * da obrigatoriedade dos eventos não periódicos para o empregador no eSocial ou na data de
       * transferência ou alteração de CPF do empregado.
       *
       * <p>CONDICAO_GRUPO: N (se grupo {desligamento}(2200_vinculo_desligamento) estiver
       * preenchido); OC (nos demais casos)
       *
       * @return O objeto Afastamento para população dos campos filhos
       */
      public Afastamento<Vinculo<T>> setAfastamento() {
        if (this.afastamento == null) {
          this.afastamento = new Afastamento(this);
        }
        return this.afastamento;
      }

      /**
       * Informação do desligamento do trabalhador
       *
       * @return Conteúdo do campo desligamento
       */
      public Desligamento getDesligamento() {
        return this.desligamento;
      }

      /**
       * Informação do desligamento do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Informação do desligamento do trabalhador.
       *
       * <p>Grupo preenchido exclusivamente caso seja necessário enviar cadastramento inicial
       * referente a trabalhador que já tenha sido desligado da empresa antes do início dos eventos
       * não periódicos para o empregador no eSocial (por exemplo, envio para pagamento de
       * diferenças salariais - acordo/dissídio/convenção coletiva - em meses posteriores ao
       * desligamento e sob vigência dos eventos periódicos para o empregador no eSocial) ou no caso
       * de desligamento em data anterior à transferência do empregado.
       *
       * <p>CONDICAO_GRUPO: N (se (grupo {afastamento}(2200_vinculo_afastamento) ou
       * {cessao}(2200_vinculo_cessao) estiver preenchido) ou (se
       * {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao) = [6] ou
       * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) = [10])); OC (nos demais
       * casos)
       *
       * @return O objeto Desligamento para população dos campos filhos
       */
      public Desligamento<Vinculo<T>> setDesligamento() {
        if (this.desligamento == null) {
          this.desligamento = new Desligamento(this);
        }
        return this.desligamento;
      }

      /**
       * Informação de cessão/exercício em outro órgão do trabalhador
       *
       * @return Conteúdo do campo cessao
       */
      public Cessao getCessao() {
        return this.cessao;
      }

      /**
       * Informação de cessão/exercício em outro órgão do trabalhador
       *
       * <p>DESCRICAO_COMPLETA:Informação de cessão/exercício em outro órgão do trabalhador.
       *
       * <p>Preenchimento exclusivo em caso de trabalhador que permaneça cedido/em exercício em
       * outro órgão na data de início da obrigatoriedade dos eventos não periódicos para o
       * empregador/ente público no eSocial ou na data de transferência ou alteração de CPF do
       * empregado.
       *
       * <p>CONDICAO_GRUPO: N (se grupo {desligamento}(2200_vinculo_desligamento) estiver
       * preenchido); OC (nos demais casos)
       *
       * @return O objeto Cessao para população dos campos filhos
       */
      public Cessao<Vinculo<T>> setCessao() {
        if (this.cessao == null) {
          this.cessao = new Cessao(this);
        }
        return this.cessao;
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
         * <p>CONDICAO_GRUPO: O (se {tpRegTrab}(2200_vinculo_tpRegTrab) = [1]); N (nos demais casos)
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
         * <p>CONDICAO_GRUPO: O (se {tpRegTrab}(2200_vinculo_tpRegTrab) = [2]); N (nos demais casos)
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
              "dtAdm",
              "tpAdmissao",
              "indAdmissao",
              "nrProcTrab",
              "tpRegJor",
              "natAtividade",
              "dtBase",
              "cnpjSindCategProf",
              "FGTS",
              "trabTemporario",
              "aprend",
            })
        public static class InfoCeletista<T> {

          /** Preencher com a data de admissão do trabalhador. */
          private javax.xml.datatype.XMLGregorianCalendar dtAdm;

          /** Tipo de admissão do trabalhador. */
          private String tpAdmissao;

          /** Indicativo de admissão. */
          private String indAdmissao;

          /**
           * Número que identifica o processo trabalhista, quando a admissão se der por decisão
           * judicial.
           */
          private String nrProcTrab;

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

          /** Informações do FGTS */
          private FGTS FGTS;

          /** Dados sobre trabalho temporário */
          private TrabTemporario trabTemporario;

          /** Informações relacionadas ao aprendiz */
          private Tipos.T_aprend aprend;

          /**
           * Preencher com a data de admissão do trabalhador.
           *
           * @return Conteúdo do campo dtAdm
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtAdm() {
            return this.dtAdm;
          }

          /**
           * Preencher com a data de admissão do trabalhador.
           *
           * <p>No caso de transferência do empregado ou de mudança de CPF, preencher com a data
           * inicial do vínculo no primeiro empregador (data de início do vínculo).
           *
           * <p>Validação: Devem ser observadas as seguintes regras:
           *
           * <p>a) Deve ser posterior à data de nascimento do trabalhador;
           *
           * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
           * obrigatoriedade dos eventos não periódicos para o empregador no eSocial;
           *
           * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N] e
           * {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao) = [1], deve ser
           * igual ou posterior à data de início da obrigatoriedade dos eventos não periódicos para
           * o empregador no eSocial.
           *
           * @param dtAdm Valor para atribuir ao campo dtAdm
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setDtAdm(javax.xml.datatype.XMLGregorianCalendar dtAdm) {
            this.dtAdm = dtAdm;
            return this;
          }

          /**
           * Tipo de admissão do trabalhador.
           *
           * @return Conteúdo do campo tpAdmissao
           */
          public String getTpAdmissao() {
            return this.tpAdmissao;
          }

          /**
           * Tipo de admissão do trabalhador.
           *
           * <p>Validação: Se for igual a [5], {codCateg}(2200_vinculo_infoContrato_codCateg) deve
           * ser igual a [104] e {procEmi}(2200_ideEvento_procEmi) deve ser igual a [2, 22].
           *
           * <p>Se for igual a [6], {cadIni}(2200_vinculo_cadIni) deve ser igual a [N].
           *
           * @param tpAdmissao Valor para atribuir ao campo tpAdmissao
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setTpAdmissao(String tpAdmissao) {
            if (!"1".equals(tpAdmissao)
                && !"2".equals(tpAdmissao)
                && !"3".equals(tpAdmissao)
                && !"4".equals(tpAdmissao)
                && !"5".equals(tpAdmissao)
                && !"6".equals(tpAdmissao))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpAdmissao) + " inválido para o campo tpAdmissao");
            this.tpAdmissao = tpAdmissao;
            return this;
          }
          /**
           * Admissão
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setTpAdmissao_1() {
            this.tpAdmissao = "1";
            return this;
          }
          /**
           * Transferência de empresa do mesmo grupo econômico
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setTpAdmissao_2() {
            this.tpAdmissao = "2";
            return this;
          }
          /**
           * Transferência de empresa consorciada ou de consórcio
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setTpAdmissao_3() {
            this.tpAdmissao = "3";
            return this;
          }
          /**
           * Transferência por motivo de sucessão, incorporação, cisão ou fusão
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setTpAdmissao_4() {
            this.tpAdmissao = "4";
            return this;
          }
          /**
           * Transferência do empregado doméstico para outro representante da mesma unidade familiar
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setTpAdmissao_5() {
            this.tpAdmissao = "5";
            return this;
          }
          /**
           * Mudança de CPF
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setTpAdmissao_6() {
            this.tpAdmissao = "6";
            return this;
          }

          /**
           * Indicativo de admissão.
           *
           * @return Conteúdo do campo indAdmissao
           */
          public String getIndAdmissao() {
            return this.indAdmissao;
          }

          /**
           * Indicativo de admissão.
           *
           * @param indAdmissao Valor para atribuir ao campo indAdmissao
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setIndAdmissao(String indAdmissao) {
            if (!"1".equals(indAdmissao) && !"2".equals(indAdmissao) && !"3".equals(indAdmissao))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indAdmissao) + " inválido para o campo indAdmissao");
            this.indAdmissao = indAdmissao;
            return this;
          }
          /**
           * Normal
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setIndAdmissao_1() {
            this.indAdmissao = "1";
            return this;
          }
          /**
           * Decorrente de ação fiscal
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setIndAdmissao_2() {
            this.indAdmissao = "2";
            return this;
          }
          /**
           * Decorrente de decisão judicial
           *
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setIndAdmissao_3() {
            this.indAdmissao = "3";
            return this;
          }

          /**
           * Número que identifica o processo trabalhista, quando a admissão se der por decisão
           * judicial.
           *
           * @return Conteúdo do campo nrProcTrab
           */
          public String getNrProcTrab() {
            return this.nrProcTrab;
          }

          /**
           * Número que identifica o processo trabalhista, quando a admissão se der por decisão
           * judicial.
           *
           * <p>Validação: Não informar se {indAdmissao}(./indAdmissao) = [1, 2]. Se preenchido,
           * deve ser um processo judicial válido, com 20 (vinte) algarismos.
           *
           * @param nrProcTrab Valor para atribuir ao campo nrProcTrab
           * @return O próprio InfoCeletista para continuar populando outros campos
           */
          public InfoCeletista<T> setNrProcTrab(String nrProcTrab) {
            this.nrProcTrab = nrProcTrab;
            return this;
          }

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
                  "Valor " + String.valueOf(natAtividade) + " inválido para o campo natAtividade");
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
           * Informações do FGTS
           *
           * @return Conteúdo do campo FGTS
           */
          public FGTS getFGTS() {
            return this.FGTS;
          }

          /**
           * Informações do FGTS
           *
           * <p>DESCRICAO_COMPLETA:Informações do Fundo de Garantia do Tempo de Serviço - FGTS.
           *
           * <p>CONDICAO_GRUPO: N (se {tpAdmissao}(../tpAdmissao) = [6] OU (se
           * {codCateg}(2200_vinculo_infoContrato_codCateg) for diferente de [104] e
           * {dtAdm}(../dtAdm) >= [1988-10-05]) OU (se
           * {codCateg}(2200_vinculo_infoContrato_codCateg) = [104] e {dtAdm}(../dtAdm) >=
           * [2015-10-01])); O (nos demais casos)
           *
           * @return O objeto FGTS para população dos campos filhos
           */
          public FGTS<InfoCeletista<T>> setFGTS() {
            if (this.FGTS == null) {
              this.FGTS = new FGTS(this);
            }
            return this.FGTS;
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
           * caso de contratação de trabalhador temporário.
           *
           * <p>CONDICAO_GRUPO: N (se {codCateg}(2200_vinculo_infoContrato_codCateg) for diferente
           * de [106]); O (se {codCateg}(2200_vinculo_infoContrato_codCateg) = [106] e se grupo
           * {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais casos)
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
           * <p>Preenchimento obrigatório no caso de contratação de aprendiz por entidade educativa
           * sem fins lucrativos que tenha por objetivo a assistência ao adolescente e à educação
           * profissional (art. 430, inciso II, CLT) ou por entidade de prática desportiva filiada
           * ao Sistema Nacional do Desporto ou a Sistema de Desporto de Estado, do Distrito Federal
           * ou de Município (art. 430, inciso III, CLT).
           *
           * <p>CONDICAO_GRUPO: N (se {codCateg}(2200_vinculo_infoContrato_codCateg) for diferente
           * de [103]); OC (se {codCateg}(2200_vinculo_infoContrato_codCateg) = [103] e se grupo
           * {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais casos)
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
           * Informações do FGTS
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "dtOpcFGTS",
              })
          public static class FGTS<T> {

            /** Informar a data de opção do trabalhador pelo FGTS. */
            private javax.xml.datatype.XMLGregorianCalendar dtOpcFGTS;

            /**
             * Informar a data de opção do trabalhador pelo FGTS.
             *
             * @return Conteúdo do campo dtOpcFGTS
             */
            public javax.xml.datatype.XMLGregorianCalendar getDtOpcFGTS() {
              return this.dtOpcFGTS;
            }

            /**
             * Informar a data de opção do trabalhador pelo FGTS.
             *
             * @param dtOpcFGTS Valor para atribuir ao campo dtOpcFGTS
             * @return O próprio FGTS para continuar populando outros campos
             */
            public FGTS<T> setDtOpcFGTS(javax.xml.datatype.XMLGregorianCalendar dtOpcFGTS) {
              this.dtOpcFGTS = dtOpcFGTS;
              return this;
            }

            public FGTS(Object pai) {
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
           * Dados sobre trabalho temporário
           *
           * @param <T> Tipo do retorno do método finish()
           */
          @XmlAccessorType(XmlAccessType.FIELD)
          @XmlType(
              name = "",
              propOrder = {
                "hipLeg",
                "justContr",
                "ideEstabVinc",
                "ideTrabSubstituido",
              })
          public static class TrabTemporario<T> {

            /** Hipótese legal para contratação de trabalhador temporário. */
            private String hipLeg;

            /**
             * Descrição do fato determinado que, no caso concreto, justifica a hipótese legal para
             * a contratação de trabalho temporário. O prazo de contratação do trabalho temporário
             * deve ser compatível com o motivo justificador alegado.
             */
            private String justContr;

            /** Identificação do estabelecimento ao qual o trabalhador está vinculado */
            private IdeEstabVinc ideEstabVinc;

            /**
             * Identificação do(s) trabalhador(es) substituído(s).
             *
             * <p>- Esse campo pode ser repetido até 9 vezes
             */
            private java.util.List<IdeTrabSubstituido> ideTrabSubstituido;

            /**
             * Hipótese legal para contratação de trabalhador temporário.
             *
             * @return Conteúdo do campo hipLeg
             */
            public String getHipLeg() {
              return this.hipLeg;
            }

            /**
             * Hipótese legal para contratação de trabalhador temporário.
             *
             * @param hipLeg Valor para atribuir ao campo hipLeg
             * @return O próprio TrabTemporario para continuar populando outros campos
             */
            public TrabTemporario<T> setHipLeg(String hipLeg) {
              if (!"1".equals(hipLeg) && !"2".equals(hipLeg))
                throw new RuntimeException(
                    "Valor " + String.valueOf(hipLeg) + " inválido para o campo hipLeg");
              this.hipLeg = hipLeg;
              return this;
            }
            /**
             * Necessidade de substituição transitória de pessoal permanente
             *
             * @return O próprio TrabTemporario para continuar populando outros campos
             */
            public TrabTemporario<T> setHipLeg_1() {
              this.hipLeg = "1";
              return this;
            }
            /**
             * Demanda complementar de serviços
             *
             * @return O próprio TrabTemporario para continuar populando outros campos
             */
            public TrabTemporario<T> setHipLeg_2() {
              this.hipLeg = "2";
              return this;
            }

            /**
             * Descrição do fato determinado que, no caso concreto, justifica a hipótese legal para
             * a contratação de trabalho temporário. O prazo de contratação do trabalho temporário
             * deve ser compatível com o motivo justificador alegado.
             *
             * @return Conteúdo do campo justContr
             */
            public String getJustContr() {
              return this.justContr;
            }

            /**
             * Descrição do fato determinado que, no caso concreto, justifica a hipótese legal para
             * a contratação de trabalho temporário. O prazo de contratação do trabalho temporário
             * deve ser compatível com o motivo justificador alegado.
             *
             * @param justContr Valor para atribuir ao campo justContr
             * @return O próprio TrabTemporario para continuar populando outros campos
             */
            public TrabTemporario<T> setJustContr(String justContr) {
              this.justContr = justContr;
              return this;
            }

            /**
             * Identificação do estabelecimento ao qual o trabalhador está vinculado
             *
             * @return Conteúdo do campo ideEstabVinc
             */
            public IdeEstabVinc getIdeEstabVinc() {
              return this.ideEstabVinc;
            }

            /**
             * Identificação do estabelecimento ao qual o trabalhador está vinculado
             *
             * <p>DESCRICAO_COMPLETA:Identificação do estabelecimento ao qual o trabalhador
             * temporário está vinculado. Se o local da efetiva prestação do serviço não possuir
             * inscrição, deverá ser informado o CNPJ/CPF ao qual o local da efetiva prestação está
             * vinculado.
             *
             * @return O objeto IdeEstabVinc para população dos campos filhos
             */
            public IdeEstabVinc<TrabTemporario<T>> setIdeEstabVinc() {
              if (this.ideEstabVinc == null) {
                this.ideEstabVinc = new IdeEstabVinc(this);
              }
              return this.ideEstabVinc;
            }

            /**
             * Identificação do(s) trabalhador(es) substituído(s).
             *
             * @return Conteúdo do campo ideTrabSubstituido
             */
            public java.util.List<IdeTrabSubstituido> getIdeTrabSubstituido() {
              return this.ideTrabSubstituido;
            }

            /**
             * Identificação do(s) trabalhador(es) substituído(s).
             *
             * <p>- Esse campo pode ser repetido até 9 vezes
             *
             * <p>CHAVE_GRUPO: {cpfTrabSubst}
             *
             * <p>CONDICAO_GRUPO: O (se
             * {hipLeg}(2200_vinculo_infoRegimeTrab_infoCeletista_trabTemporario_hipLeg) = [1]); N
             * (nos demais casos)
             *
             * @return O objeto IdeTrabSubstituido para população dos campos filhos
             */
            public IdeTrabSubstituido<TrabTemporario<T>> setIdeTrabSubstituido_Next() {
              if (this.ideTrabSubstituido == null) {
                this.ideTrabSubstituido = new java.util.ArrayList<>();
              }
              IdeTrabSubstituido toAdd = new IdeTrabSubstituido(this);
              this.ideTrabSubstituido.add(toAdd);
              return toAdd;
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
            /**
             * Identificação do estabelecimento ao qual o trabalhador está vinculado
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "tpInsc", "nrInsc",
                })
            public static class IdeEstabVinc<T> {

              /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
              private String tpInsc;

              /**
               * Informar o número de inscrição do contratante de serviços, de acordo com o tipo de
               * inscrição informado em {ideEstabVinc/tpInsc}(./tpInsc).
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
               * @return O próprio IdeEstabVinc para continuar populando outros campos
               */
              public IdeEstabVinc<T> setTpInsc(String tpInsc) {
                if (!"1".equals(tpInsc) && !"2".equals(tpInsc))
                  throw new RuntimeException(
                      "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
                this.tpInsc = tpInsc;
                return this;
              }
              /**
               * CNPJ
               *
               * @return O próprio IdeEstabVinc para continuar populando outros campos
               */
              public IdeEstabVinc<T> setTpInsc_1() {
                this.tpInsc = "1";
                return this;
              }
              /**
               * CPF
               *
               * @return O próprio IdeEstabVinc para continuar populando outros campos
               */
              public IdeEstabVinc<T> setTpInsc_2() {
                this.tpInsc = "2";
                return this;
              }

              /**
               * Informar o número de inscrição do contratante de serviços, de acordo com o tipo de
               * inscrição informado em {ideEstabVinc/tpInsc}(./tpInsc).
               *
               * @return Conteúdo do campo nrInsc
               */
              public String getNrInsc() {
                return this.nrInsc;
              }

              /**
               * Informar o número de inscrição do contratante de serviços, de acordo com o tipo de
               * inscrição informado em {ideEstabVinc/tpInsc}(./tpInsc).
               *
               * <p>Validação: Se {ideEstabVinc/tpInsc}(./tpInsc) for igual a [1], deve ser um CNPJ
               * válido, com 14 (catorze) algarismos. Se {ideEstabVinc/tpInsc}(./tpInsc) for igual a
               * [2], deve ser um CPF válido.
               *
               * @param nrInsc Valor para atribuir ao campo nrInsc
               * @return O próprio IdeEstabVinc para continuar populando outros campos
               */
              public IdeEstabVinc<T> setNrInsc(String nrInsc) {
                this.nrInsc = nrInsc;
                return this;
              }

              public IdeEstabVinc(Object pai) {
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
             * Identificação do(s) trabalhador(es) substituído(s).
             *
             * @param <T> Tipo do retorno do método finish()
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(
                name = "",
                propOrder = {
                  "cpfTrabSubst",
                })
            public static class IdeTrabSubstituido<T> {

              /** CPF do trabalhador substituído. */
              private String cpfTrabSubst;

              /**
               * CPF do trabalhador substituído.
               *
               * @return Conteúdo do campo cpfTrabSubst
               */
              public String getCpfTrabSubst() {
                return this.cpfTrabSubst;
              }

              /**
               * CPF do trabalhador substituído.
               *
               * <p>Validação: Deve ser um CPF válido.
               *
               * @param cpfTrabSubst Valor para atribuir ao campo cpfTrabSubst
               * @return O próprio IdeTrabSubstituido para continuar populando outros campos
               */
              public IdeTrabSubstituido<T> setCpfTrabSubst(String cpfTrabSubst) {
                this.cpfTrabSubst = cpfTrabSubst;
                return this;
              }

              public IdeTrabSubstituido(Object pai) {
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
         * Informações de trabalhador estatutário.
         *
         * @param <T> Tipo do retorno do método finish()
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(
            name = "",
            propOrder = {
              "tpProv",
              "dtExercicio",
              "tpPlanRP",
              "indTetoRGPS",
              "indAbonoPerm",
              "dtIniAbono",
            })
        public static class InfoEstatutario<T> {

          /** Preencher com o tipo de provimento. */
          private String tpProv;

          /** Data da entrada em exercício pelo servidor. */
          private javax.xml.datatype.XMLGregorianCalendar dtExercicio;

          /** Tipo de plano de segregação da massa. */
          private String tpPlanRP;

          /**
           * Informar se o servidor está sujeito ao teto do RGPS pela instituição do regime de
           * previdência complementar.
           */
          private String indTetoRGPS;

          /** Indicar se o servidor recebe abono permanência. */
          private String indAbonoPerm;

          /** Informar a data de inicio do abono permanência. */
          private javax.xml.datatype.XMLGregorianCalendar dtIniAbono;

          /**
           * Preencher com o tipo de provimento.
           *
           * @return Conteúdo do campo tpProv
           */
          public String getTpProv() {
            return this.tpProv;
          }

          /**
           * Preencher com o tipo de provimento.
           *
           * <p>Validação: Os valores [3, 5, 6, 7, 8, 9] só são permitidos se a natureza jurídica do
           * declarante for Administração Pública (grupo [1]).
           *
           * <p>Se {codCateg}(2200_vinculo_infoContrato_codCateg) = [302], deve ser preenchido com
           * [2].
           *
           * @param tpProv Valor para atribuir ao campo tpProv
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv(String tpProv) {
            if (!"1".equals(tpProv)
                && !"2".equals(tpProv)
                && !"3".equals(tpProv)
                && !"5".equals(tpProv)
                && !"6".equals(tpProv)
                && !"7".equals(tpProv)
                && !"8".equals(tpProv)
                && !"9".equals(tpProv)
                && !"10".equals(tpProv)
                && !"99".equals(tpProv))
              throw new RuntimeException(
                  "Valor " + String.valueOf(tpProv) + " inválido para o campo tpProv");
            this.tpProv = tpProv;
            return this;
          }
          /**
           * Nomeação em cargo efetivo
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_1() {
            this.tpProv = "1";
            return this;
          }
          /**
           * Nomeação exclusivamente em cargo em comissão
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_2() {
            this.tpProv = "2";
            return this;
          }
          /**
           * Incorporação, matrícula ou nomeação (militar)
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_3() {
            this.tpProv = "3";
            return this;
          }
          /**
           * Redistribuição
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_5() {
            this.tpProv = "5";
            return this;
          }
          /**
           * Diplomação
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_6() {
            this.tpProv = "6";
            return this;
          }
          /**
           * Contratação por tempo determinado
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_7() {
            this.tpProv = "7";
            return this;
          }
          /**
           * Remoção (em caso de alteração do órgão declarante)
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_8() {
            this.tpProv = "8";
            return this;
          }
          /**
           * Designação
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_9() {
            this.tpProv = "9";
            return this;
          }
          /**
           * Mudança de CPF
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_10() {
            this.tpProv = "10";
            return this;
          }
          /**
           * Outros não relacionados acima
           *
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setTpProv_99() {
            this.tpProv = "99";
            return this;
          }

          /**
           * Data da entrada em exercício pelo servidor.
           *
           * @return Conteúdo do campo dtExercicio
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtExercicio() {
            return this.dtExercicio;
          }

          /**
           * Data da entrada em exercício pelo servidor.
           *
           * <p>Validação: Devem ser observadas as seguintes regras:
           *
           * <p>a) Deve ser posterior à data de nascimento do trabalhador;
           *
           * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
           * obrigatoriedade dos eventos não periódicos para o empregador/ente público no eSocial;
           *
           * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N] e
           * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) for diferente de [5, 8,
           * 10], deve ser igual ou posterior à data de início da obrigatoriedade dos eventos não
           * periódicos para o empregador/ente público no eSocial.
           *
           * @param dtExercicio Valor para atribuir ao campo dtExercicio
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setDtExercicio(
              javax.xml.datatype.XMLGregorianCalendar dtExercicio) {
            this.dtExercicio = dtExercicio;
            return this;
          }

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
           * <p>Validação: Preenchimento obrigatório e exclusivo se
           * {tpRegPrev}(2200_vinculo_tpRegPrev) = [2].
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
           * <p>Validação: Preenchimento obrigatório e exclusivo se
           * {tpRegPrev}(2200_vinculo_tpRegPrev) = [2].
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
           * <p>Validação: Preenchimento obrigatório e exclusivo se
           * {tpRegPrev}(2200_vinculo_tpRegPrev) = [2].
           *
           * @param indAbonoPerm Valor para atribuir ao campo indAbonoPerm
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setIndAbonoPerm(String indAbonoPerm) {
            if (!"S".equals(indAbonoPerm) && !"N".equals(indAbonoPerm))
              throw new RuntimeException(
                  "Valor " + String.valueOf(indAbonoPerm) + " inválido para o campo indAbonoPerm");
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

          /**
           * Informar a data de inicio do abono permanência.
           *
           * @return Conteúdo do campo dtIniAbono
           */
          public javax.xml.datatype.XMLGregorianCalendar getDtIniAbono() {
            return this.dtIniAbono;
          }

          /**
           * Informar a data de inicio do abono permanência.
           *
           * <p>Validação: Preenchimento obrigatório se {indAbonoPerm}(./indAbonoPerm) = [S] e
           * {cadIni}(2200_vinculo_cadIni) = [N]. Não informar se {indAbonoPerm}(./indAbonoPerm) =
           * [N]. Se preenchida, devem ser observadas as seguintes regras:
           *
           * <p>a) Deve ser igual ou posterior à data de exercício do servidor;
           *
           * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
           * obrigatoriedade dos eventos não periódicos para o ente público;
           *
           * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N], deve ser igual ou anterior à data da
           * transferência ou alteração do CPF do servidor
           * ({sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf) ou
           * {dtAltCPF}(2200_vinculo_mudancaCPF_dtAltCPF)). Não informar se
           * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) for diferente de [5, 8,
           * 10].
           *
           * @param dtIniAbono Valor para atribuir ao campo dtIniAbono
           * @return O próprio InfoEstatutario para continuar populando outros campos
           */
          public InfoEstatutario<T> setDtIniAbono(
              javax.xml.datatype.XMLGregorianCalendar dtIniAbono) {
            this.dtIniAbono = dtIniAbono;
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
            "dtIngrCargo",
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

        /** Data de ingresso do servidor no cargo. */
        private javax.xml.datatype.XMLGregorianCalendar dtIngrCargo;

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
         * Treinamentos, capacitações, exercícios simulados e outras anotações
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
         * <p>Validação: O preenchimento é obrigatório, exceto se for relativo a servidor nomeado em
         * cargo em comissão ({tpRegTrab}(2200_vinculo_tpRegTrab) = [2] e
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
         * <p>Validação: Informação obrigatória e exclusiva se {nmCargo}(./nmCargo) for preenchido.
         * Se informado, deve ser um código válido e existente na tabela de CBO, com 6 (seis)
         * posições.
         *
         * @param CBOCargo Valor para atribuir ao campo CBOCargo
         * @return O próprio InfoContrato para continuar populando outros campos
         */
        public InfoContrato<T> setCBOCargo(String CBOCargo) {
          this.CBOCargo = CBOCargo;
          return this;
        }

        /**
         * Data de ingresso do servidor no cargo.
         *
         * @return Conteúdo do campo dtIngrCargo
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtIngrCargo() {
          return this.dtIngrCargo;
        }

        /**
         * Data de ingresso do servidor no cargo.
         *
         * <p>Validação: Não preencher se {tpRegTrab}(2200_vinculo_tpRegTrab) = [1] ou se
         * {CBOCargo}(./CBOCargo) não for informado. Se preenchida, devem ser observadas as
         * seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de exercício do servidor;
         *
         * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
         * obrigatoriedade dos eventos não periódicos para o ente público;
         *
         * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N], deve ser igual ou anterior à data da
         * transferência ou alteração do CPF do servidor
         * ({sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf) ou
         * {dtAltCPF}(2200_vinculo_mudancaCPF_dtAltCPF)). Não informar se
         * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) for diferente de [5, 8, 10].
         *
         * @param dtIngrCargo Valor para atribuir ao campo dtIngrCargo
         * @return O próprio InfoContrato para continuar populando outros campos
         */
        public InfoContrato<T> setDtIngrCargo(javax.xml.datatype.XMLGregorianCalendar dtIngrCargo) {
          this.dtIngrCargo = dtIngrCargo;
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
         * comissão ({tpRegTrab}(2200_vinculo_tpRegTrab) = [2] e
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
         * <p>Validação: Preenchimento obrigatório se {cadIni}(2200_vinculo_cadIni) = [N] e se a
         * natureza jurídica do declarante for igual a 1XX-X, 201-1 ou 203-8.
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
         * <p>CONDICAO_GRUPO: N (se {tpRegTrab}(2200_vinculo_tpRegTrab) = [2]); O (se
         * {tpRegTrab}(2200_vinculo_tpRegTrab) = [1] e se grupo
         * {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais casos)
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
         * <p>CONDICAO_GRUPO: N (se {tpRegTrab}(2200_vinculo_tpRegTrab) = [2]); O (se
         * {tpRegTrab}(2200_vinculo_tpRegTrab) = [1] e se grupo
         * {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais casos)
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
         * <p>CONDICAO_GRUPO: O (se grupo {desligamento}(2200_vinculo_desligamento) não estiver
         * preenchido); F (nos demais casos)
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
         * <p>CONDICAO_GRUPO: O (se {tpRegJor}(2200_vinculo_infoRegimeTrab_infoCeletista_tpRegJor) =
         * [1] e se grupo {desligamento}(2200_vinculo_desligamento) não estiver preenchido); OC (se
         * {tpRegJor}(2200_vinculo_infoRegimeTrab_infoCeletista_tpRegJor) for diferente de [1] e se
         * grupo {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais
         * casos)
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
         * <p>DESCRICAO_COMPLETA:Informações do alvará judicial em caso de contratação de menores de
         * 14 anos, em qualquer categoria, e de maiores de 14 e menores de 16, em categoria
         * diferente de "Aprendiz".
         *
         * <p>CONDICAO_GRUPO: OC (se grupo {desligamento}(2200_vinculo_desligamento) não estiver
         * preenchido); F (nos demais casos)
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
         * <p>CONDICAO_GRUPO: OC (se grupo {desligamento}(2200_vinculo_desligamento) não estiver
         * preenchido); F (nos demais casos)
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
         * Treinamentos, capacitações, exercícios simulados e outras anotações
         *
         * @return Conteúdo do campo treiCap
         */
        public java.util.List<Tipos.T_treiCap> getTreiCap() {
          return this.treiCap;
        }

        /**
         * Treinamentos, capacitações, exercícios simulados e outras anotações
         *
         * <p>- Esse campo pode ser repetido até 99 vezes
         *
         * <p>DESCRICAO_COMPLETA:Treinamentos, capacitações, exercícios simulados, autorizações ou
         * outras anotações que devam ser anotadas no registro de empregados e/ou na CTPS, por
         * determinação de Norma Regulamentadora - NR.
         *
         * <p>CHAVE_GRUPO: {codTreiCap}
         *
         * <p>CONDICAO_GRUPO: OC (se grupo {desligamento}(2200_vinculo_desligamento) não estiver
         * preenchido); F (nos demais casos)
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
              "tpContr",
              "dtTerm",
              "clauAssec",
              "objDet",
            })
        public static class Duracao<T> {

          /** Tipo de contrato de trabalho. */
          private String tpContr;

          /** Data do término do contrato por prazo determinado. */
          private javax.xml.datatype.XMLGregorianCalendar dtTerm;

          /**
           * Indicar se o contrato por prazo determinado contém cláusula assecuratória do direito
           * recíproco de rescisão antes da data de seu término.
           */
          private String clauAssec;

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
           * <p>Validação: O preenchimento é obrigatório se {tpContr}(./tpContr) = [2]. Não informar
           * se {tpContr}(./tpContr) = [1]. Se preenchido, deve ser igual ou posterior à data de
           * admissão (no caso de transferência ou mudança de CPF, igual ou posterior a
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
           * Indicar se o contrato por prazo determinado contém cláusula assecuratória do direito
           * recíproco de rescisão antes da data de seu término.
           *
           * @return Conteúdo do campo clauAssec
           */
          public String getClauAssec() {
            return this.clauAssec;
          }

          /**
           * Indicar se o contrato por prazo determinado contém cláusula assecuratória do direito
           * recíproco de rescisão antes da data de seu término.
           *
           * <p>Validação: O preenchimento é obrigatório se {tpContr}(./tpContr) = [2, 3]. Não
           * preencher se {tpContr}(./tpContr) = [1].
           *
           * @param clauAssec Valor para atribuir ao campo clauAssec
           * @return O próprio Duracao para continuar populando outros campos
           */
          public Duracao<T> setClauAssec(String clauAssec) {
            if (!"S".equals(clauAssec) && !"N".equals(clauAssec))
              throw new RuntimeException(
                  "Valor " + String.valueOf(clauAssec) + " inválido para o campo clauAssec");
            this.clauAssec = clauAssec;
            return this;
          }
          /**
           * Sim
           *
           * @return O próprio Duracao para continuar populando outros campos
           */
          public Duracao<T> setClauAssec_S() {
            this.clauAssec = "S";
            return this;
          }
          /**
           * Não
           *
           * @return O próprio Duracao para continuar populando outros campos
           */
          public Duracao<T> setClauAssec_N() {
            this.clauAssec = "N";
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
           * <p>Validação: O preenchimento é obrigatório e exclusivo se {tpContr}(./tpContr) = [3].
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
           * <p>CONDICAO_GRUPO: N (se {codCateg}(2200_vinculo_infoContrato_codCateg) = [104]); O (se
           * {codCateg}(2200_vinculo_infoContrato_codCateg) for diferente de [104] e se grupo
           * {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais casos)
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
           * <p>DESCRICAO_COMPLETA:Grupo preenchido exclusivamente em caso de trabalhador doméstico
           * e trabalhador temporário, indicando o endereço onde o trabalhador exerce suas
           * atividades.
           *
           * <p>CONDICAO_GRUPO: N (se {codCateg}(2200_vinculo_infoContrato_codCateg) for diferente
           * de [104, 106]); O (se {codCateg}(2200_vinculo_infoContrato_codCateg) = [104, 106] e se
           * grupo {desligamento}(2200_vinculo_desligamento) não estiver preenchido); F (nos demais
           * casos)
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

      /**
       * Grupo de informações da sucessão de vínculo trabalhista/estatutário.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "tpInsc",
            "nrInsc",
            "matricAnt",
            "dtTransf",
            "observacao",
          })
      public static class SucessaoVinc<T> {

        /** Preencher com o código correspondente ao tipo de inscrição, conforme Tabela 05. */
        private String tpInsc;

        /**
         * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição
         * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
         */
        private String nrInsc;

        /** Matrícula do trabalhador no empregador anterior. */
        private String matricAnt;

        /** Preencher com a data da transferência do empregado para o empregador declarante. */
        private javax.xml.datatype.XMLGregorianCalendar dtTransf;

        /** Observação. */
        private String observacao;

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
         * <p>Validação: Somente é possível informar [5] se {dtTransf}(./dtTransf) for igual ou
         * anterior a [1999-06-30].
         *
         * <p>Somente é possível informar [6] se {dtTransf}(./dtTransf) for igual ou anterior a
         * [2011-12-31].
         *
         * @param tpInsc Valor para atribuir ao campo tpInsc
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc(String tpInsc) {
          if (!"1".equals(tpInsc)
              && !"2".equals(tpInsc)
              && !"5".equals(tpInsc)
              && !"6".equals(tpInsc))
            throw new RuntimeException(
                "Valor " + String.valueOf(tpInsc) + " inválido para o campo tpInsc");
          this.tpInsc = tpInsc;
          return this;
        }
        /**
         * CNPJ
         *
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc_1() {
          this.tpInsc = "1";
          return this;
        }
        /**
         * CPF
         *
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc_2() {
          this.tpInsc = "2";
          return this;
        }
        /**
         * CGC
         *
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc_5() {
          this.tpInsc = "5";
          return this;
        }
        /**
         * CEI
         *
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setTpInsc_6() {
          this.tpInsc = "6";
          return this;
        }

        /**
         * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição
         * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
         *
         * @return Conteúdo do campo nrInsc
         */
        public String getNrInsc() {
          return this.nrInsc;
        }

        /**
         * Informar o número de inscrição do empregador anterior, de acordo com o tipo de inscrição
         * indicado no campo {sucessaoVinc/tpInsc}(./tpInsc).
         *
         * <p>Validação: Deve ser um número de inscrição válido e diferente da inscrição do
         * declarante, considerando as particularidades aplicadas à informação de CNPJ de órgão
         * público em S-1000.
         *
         * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [1], deve possuir 14 (catorze) algarismos e ser
         * diferente do CNPJ base do empregador (exceto se
         * {ideEmpregador/nrInsc}(2200_ideEmpregador_nrInsc) tiver 14 (catorze) algarismos) e dos
         * estabelecimentos informados através do evento S-1005.
         *
         * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [2], deve possuir 11 (onze) algarismos.
         *
         * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [5], deve possuir somente algarismos.
         *
         * <p>Se {sucessaoVinc/tpInsc}(./tpInsc) = [6], deve possuir 12 (doze) algarismos.
         *
         * @param nrInsc Valor para atribuir ao campo nrInsc
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setNrInsc(String nrInsc) {
          this.nrInsc = nrInsc;
          return this;
        }

        /**
         * Matrícula do trabalhador no empregador anterior.
         *
         * @return Conteúdo do campo matricAnt
         */
        public String getMatricAnt() {
          return this.matricAnt;
        }

        /**
         * Matrícula do trabalhador no empregador anterior.
         *
         * <p>Validação: O preenchimento é obrigatório se {cadIni}(2200_vinculo_cadIni) = [N].
         *
         * @param matricAnt Valor para atribuir ao campo matricAnt
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setMatricAnt(String matricAnt) {
          this.matricAnt = matricAnt;
          return this;
        }

        /**
         * Preencher com a data da transferência do empregado para o empregador declarante.
         *
         * @return Conteúdo do campo dtTransf
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTransf() {
          return this.dtTransf;
        }

        /**
         * Preencher com a data da transferência do empregado para o empregador declarante.
         *
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser posterior à data de admissão do trabalhador;
         *
         * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
         * obrigatoriedade dos eventos não periódicos para o empregador;
         *
         * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N], deve ser igual ou posterior à data de
         * início da obrigatoriedade dos eventos não periódicos para o empregador.
         *
         * @param dtTransf Valor para atribuir ao campo dtTransf
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setDtTransf(javax.xml.datatype.XMLGregorianCalendar dtTransf) {
          this.dtTransf = dtTransf;
          return this;
        }

        /**
         * Observação.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Observação.
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio SucessaoVinc para continuar populando outros campos
         */
        public SucessaoVinc<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        public SucessaoVinc(Object pai) {
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
       * Informações do empregado doméstico transferido de outro representante da mesma unidade
       * familiar.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cpfSubstituido",
            "matricAnt",
            "dtTransf",
          })
      public static class TransfDom<T> {

        /** Preencher com o número do CPF do representante anterior da unidade familiar. */
        private String cpfSubstituido;

        /** Matrícula do trabalhador no representante anterior da unidade familiar. */
        private String matricAnt;

        /** Data da transferência do vínculo ao novo representante da unidade familiar. */
        private javax.xml.datatype.XMLGregorianCalendar dtTransf;

        /**
         * Preencher com o número do CPF do representante anterior da unidade familiar.
         *
         * @return Conteúdo do campo cpfSubstituido
         */
        public String getCpfSubstituido() {
          return this.cpfSubstituido;
        }

        /**
         * Preencher com o número do CPF do representante anterior da unidade familiar.
         *
         * <p>Validação: Deve ser um CPF válido e diferente do CPF do declarante e do empregado.
         *
         * @param cpfSubstituido Valor para atribuir ao campo cpfSubstituido
         * @return O próprio TransfDom para continuar populando outros campos
         */
        public TransfDom<T> setCpfSubstituido(String cpfSubstituido) {
          this.cpfSubstituido = cpfSubstituido;
          return this;
        }

        /**
         * Matrícula do trabalhador no representante anterior da unidade familiar.
         *
         * @return Conteúdo do campo matricAnt
         */
        public String getMatricAnt() {
          return this.matricAnt;
        }

        /**
         * Matrícula do trabalhador no representante anterior da unidade familiar.
         *
         * @param matricAnt Valor para atribuir ao campo matricAnt
         * @return O próprio TransfDom para continuar populando outros campos
         */
        public TransfDom<T> setMatricAnt(String matricAnt) {
          this.matricAnt = matricAnt;
          return this;
        }

        /**
         * Data da transferência do vínculo ao novo representante da unidade familiar.
         *
         * @return Conteúdo do campo dtTransf
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtTransf() {
          return this.dtTransf;
        }

        /**
         * Data da transferência do vínculo ao novo representante da unidade familiar.
         *
         * @param dtTransf Valor para atribuir ao campo dtTransf
         * @return O próprio TransfDom para continuar populando outros campos
         */
        public TransfDom<T> setDtTransf(javax.xml.datatype.XMLGregorianCalendar dtTransf) {
          this.dtTransf = dtTransf;
          return this;
        }

        public TransfDom(Object pai) {
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
       * Informações de mudança de CPF do trabalhador.
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "cpfAnt",
            "matricAnt",
            "dtAltCPF",
            "observacao",
          })
      public static class MudancaCPF<T> {

        /** Preencher com o número do CPF antigo do trabalhador. */
        private String cpfAnt;

        /** Preencher com a matrícula anterior do trabalhador. */
        private String matricAnt;

        /** Data de alteração do CPF. */
        private javax.xml.datatype.XMLGregorianCalendar dtAltCPF;

        /** Observação. */
        private String observacao;

        /**
         * Preencher com o número do CPF antigo do trabalhador.
         *
         * @return Conteúdo do campo cpfAnt
         */
        public String getCpfAnt() {
          return this.cpfAnt;
        }

        /**
         * Preencher com o número do CPF antigo do trabalhador.
         *
         * @param cpfAnt Valor para atribuir ao campo cpfAnt
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setCpfAnt(String cpfAnt) {
          this.cpfAnt = cpfAnt;
          return this;
        }

        /**
         * Preencher com a matrícula anterior do trabalhador.
         *
         * @return Conteúdo do campo matricAnt
         */
        public String getMatricAnt() {
          return this.matricAnt;
        }

        /**
         * Preencher com a matrícula anterior do trabalhador.
         *
         * @param matricAnt Valor para atribuir ao campo matricAnt
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setMatricAnt(String matricAnt) {
          this.matricAnt = matricAnt;
          return this;
        }

        /**
         * Data de alteração do CPF.
         *
         * @return Conteúdo do campo dtAltCPF
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtAltCPF() {
          return this.dtAltCPF;
        }

        /**
         * Data de alteração do CPF.
         *
         * @param dtAltCPF Valor para atribuir ao campo dtAltCPF
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setDtAltCPF(javax.xml.datatype.XMLGregorianCalendar dtAltCPF) {
          this.dtAltCPF = dtAltCPF;
          return this;
        }

        /**
         * Observação.
         *
         * @return Conteúdo do campo observacao
         */
        public String getObservacao() {
          return this.observacao;
        }

        /**
         * Observação.
         *
         * @param observacao Valor para atribuir ao campo observacao
         * @return O próprio MudancaCPF para continuar populando outros campos
         */
        public MudancaCPF<T> setObservacao(String observacao) {
          this.observacao = observacao;
          return this;
        }

        public MudancaCPF(Object pai) {
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
       * Informações de afastamento do trabalhador
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtIniAfast",
            "codMotAfast",
          })
      public static class Afastamento<T> {

        /** Data de início do afastamento. */
        private javax.xml.datatype.XMLGregorianCalendar dtIniAfast;

        /** Preencher com o código do motivo de afastamento temporário. */
        private String codMotAfast;

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
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de admissão/exercício do trabalhador;
         *
         * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
         * obrigatoriedade dos eventos não periódicos para o empregador;
         *
         * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N], deve ser anterior à data da transferência
         * ou alteração do CPF do empregado
         * ({sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf),
         * {transfDom/dtTransf}(2200_vinculo_transfDom_dtTransf) ou
         * {dtAltCPF}(2200_vinculo_mudancaCPF_dtAltCPF)). Não informar se
         * {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao) = [1] ou se
         * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) for diferente de [5, 8, 10].
         *
         * @param dtIniAfast Valor para atribuir ao campo dtIniAfast
         * @return O próprio Afastamento para continuar populando outros campos
         */
        public Afastamento<T> setDtIniAfast(javax.xml.datatype.XMLGregorianCalendar dtIniAfast) {
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
         * <p>Validação: Deve ser um código válido e existente na Tabela 18. Se a natureza jurídica
         * do declarante for Administração Pública (grupo [1]), não pode ser informado [14].
         *
         * @param codMotAfast Valor para atribuir ao campo codMotAfast
         * @return O próprio Afastamento para continuar populando outros campos
         */
        public Afastamento<T> setCodMotAfast(String codMotAfast) {
          this.codMotAfast = codMotAfast;
          return this;
        }

        public Afastamento(Object pai) {
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
       * Informação do desligamento do trabalhador
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtDeslig",
          })
      public static class Desligamento<T> {

        /** Preencher com a data de desligamento do vínculo (último dia trabalhado). */
        private javax.xml.datatype.XMLGregorianCalendar dtDeslig;

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
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de admissão/exercício do trabalhador;
         *
         * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
         * obrigatoriedade dos eventos não periódicos para o empregador;
         *
         * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N], deve ser anterior à data da transferência
         * do empregado ({sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf) ou
         * {transfDom/dtTransf}(2200_vinculo_transfDom_dtTransf)). Não informar se
         * {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao) = [1] ou se
         * {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) for diferente de [5, 8].
         *
         * @param dtDeslig Valor para atribuir ao campo dtDeslig
         * @return O próprio Desligamento para continuar populando outros campos
         */
        public Desligamento<T> setDtDeslig(javax.xml.datatype.XMLGregorianCalendar dtDeslig) {
          this.dtDeslig = dtDeslig;
          return this;
        }

        public Desligamento(Object pai) {
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
       * Informação de cessão/exercício em outro órgão do trabalhador
       *
       * @param <T> Tipo do retorno do método finish()
       */
      @XmlAccessorType(XmlAccessType.FIELD)
      @XmlType(
          name = "",
          propOrder = {
            "dtIniCessao",
          })
      public static class Cessao<T> {

        /** Data de início da cessão/exercício em outro órgão. */
        private javax.xml.datatype.XMLGregorianCalendar dtIniCessao;

        /**
         * Data de início da cessão/exercício em outro órgão.
         *
         * @return Conteúdo do campo dtIniCessao
         */
        public javax.xml.datatype.XMLGregorianCalendar getDtIniCessao() {
          return this.dtIniCessao;
        }

        /**
         * Data de início da cessão/exercício em outro órgão.
         *
         * <p>Validação: Devem ser observadas as seguintes regras:
         *
         * <p>a) Deve ser igual ou posterior à data de admissão/exercício do trabalhador;
         *
         * <p>b) Se {cadIni}(2200_vinculo_cadIni) = [S], deve ser anterior à data de início da
         * obrigatoriedade dos eventos não periódicos para o ente público e a natureza jurídica do
         * declarante deve ser Administração Pública (grupo [1]);
         *
         * <p>c) Se {cadIni}(2200_vinculo_cadIni) = [N], deve ser anterior à data da transferência
         * ou alteração do CPF do empregado
         * ({sucessaoVinc/dtTransf}(2200_vinculo_sucessaoVinc_dtTransf) ou
         * {dtAltCPF}(2200_vinculo_mudancaCPF_dtAltCPF)) e igual ou posterior a [2021-05-10]. Não
         * informar se {tpAdmissao}(2200_vinculo_infoRegimeTrab_infoCeletista_tpAdmissao) = [1] ou
         * se {tpProv}(2200_vinculo_infoRegimeTrab_infoEstatutario_tpProv) for diferente de [5, 8,
         * 10].
         *
         * @param dtIniCessao Valor para atribuir ao campo dtIniCessao
         * @return O próprio Cessao para continuar populando outros campos
         */
        public Cessao<T> setDtIniCessao(javax.xml.datatype.XMLGregorianCalendar dtIniCessao) {
          this.dtIniCessao = dtIniCessao;
          return this;
        }

        public Cessao(Object pai) {
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
