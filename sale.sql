PGDMP     1                    x            sale    12.1    12.0     B           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            C           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            D           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            E           1262    17590    sale    DATABASE     b   CREATE DATABASE sale WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';
    DROP DATABASE sale;
                postgres    false            �            1259    17593    employeesalary    TABLE     {   CREATE TABLE public.employeesalary (
    id integer NOT NULL,
    name text,
    salary integer,
    workhourse integer
);
 "   DROP TABLE public.employeesalary;
       public         heap    postgres    false            �            1259    17591    employeeSalary_id_seq    SEQUENCE     �   CREATE SEQUENCE public."employeeSalary_id_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public."employeeSalary_id_seq";
       public          postgres    false    203            F           0    0    employeeSalary_id_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public."employeeSalary_id_seq" OWNED BY public.employeesalary.id;
          public          postgres    false    202            �           2604    17596    employeesalary id    DEFAULT     x   ALTER TABLE ONLY public.employeesalary ALTER COLUMN id SET DEFAULT nextval('public."employeeSalary_id_seq"'::regclass);
 @   ALTER TABLE public.employeesalary ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    203    202    203            ?          0    17593    employeesalary 
   TABLE DATA           F   COPY public.employeesalary (id, name, salary, workhourse) FROM stdin;
    public          postgres    false    203   �
       G           0    0    employeeSalary_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public."employeeSalary_id_seq"', 1, false);
          public          postgres    false    202            �           2606    17601 "   employeesalary employeesalary_pkey 
   CONSTRAINT     `   ALTER TABLE ONLY public.employeesalary
    ADD CONSTRAINT employeesalary_pkey PRIMARY KEY (id);
 L   ALTER TABLE ONLY public.employeesalary DROP CONSTRAINT employeesalary_pkey;
       public            postgres    false    203            ?   $   x�3262��t����H��4403�00 �\1z\\\ n�M     